package datahandling;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.http.HttpServlet;
import org.apache.commons.lang3.StringUtils;
import uk.ac.core.oacore4j.articles.response.json.Article;
import uk.ac.core.oacore4j.articles.response.json.Language;
import uk.ac.core.oacore4j.articles.response.json.Repository;


/**
 *
 * @author Vishal Kumar
 */
public class DataProcess extends HttpServlet {
    public String id; //A102
    public String authors ;// new String[20];//A300
    public String citations ;// new String[20];//A020
    public String types;//new String[20];//A060
    public String datePublished; //A440
    public String description;//A600
    public String fulltextUrls;//"";//A510
    public String oai;//"";//A900
    public String doi;//"";//A100
    public String language;//"" ;//A040
    public String title;//"";//A200
    public String journals ;//= new String[20];//A201
    public String topics ;//= new String[20];//A630
    public String repo;
    Connection con;
    PreparedStatement preparedStmt = null;
    public String query1 ;
    public String query2;
    public int year;
    public int[][] cnt;
    public DataProcess(){
        this.authors="";
        this.citations="";
        this.con=null;
        this.datePublished="";
        this.description="";
        this.doi="";
        this.fulltextUrls="";
        this.id="";
        this.journals="";
        this.language="";
        this.preparedStmt=null;
        this.oai="";
        this.title="";
        this.topics="";
        this.types="";
        this.query1="";//insert into table_name (A001, A102, A200, A440, A600, A630, A900, A100, A040, A300, A020, A201, A060 )" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?)
        this.query2="";
        this.repo =  "";
        this.year = 0;
        cnt = new int[3][3];
        cnt[0][0] = cnt[0][1] = cnt[1][2]=cnt[1][0] = cnt[1][1] = cnt[1][2]=cnt[2][0] = cnt[2][1] = cnt[2][2]  = 0;
    }
    public String getId(){
        return id;
    }
    
    public boolean storeData(Article a1){
        DataProcess obj = new DataProcess();
        if(a1.getAuthors()!=null){
            List<String> authors = a1.getAuthors();
            this.authors = StringUtils.join(authors," ; ");
        }
        
        if(a1.getCitations()!=null){
            List<Object> citations = a1.getCitations();
            this.citations= StringUtils.join(citations," ; ");
        }
        if(a1.getTypes()!=null){
            List<Object> types = a1.getTypes();
            this.types = StringUtils.join(types," ; ");
        }
        if(a1.getDatePublished()!=null){
            this.datePublished = a1.getDatePublished();
        }
        if(a1.getDescription()!=null){
            this.description = a1.getDescription();
        }
        if(a1.getFulltextIdentifier()!=null){
            this.fulltextUrls = a1.getFulltextIdentifier();
        }
        if(a1.getOai()!=null){
            this.oai = a1.getOai();
        }
        if(a1.getId()!=null){
            this.id = a1.getId();
        }
        if(a1.getYear()!=null){
            this.year = a1.getYear();
        }
        
        if(a1.getLanguage()!=null){
            Language language = a1.getLanguage();
            if(language.getId()!=9) return false;
            if(language.getName()!=null){
                //String toLowerCase = language.getName().toLowerCase();
               // int len = toLowerCase.length();
                //len = min(3,len);
                this.language = "eng";//toLowerCase.substring(0, len);
            }
        } else{
            return false;
        }
        if(a1.getRepositories()!=null){
            List<Repository> repositories = a1.getRepositories();
            if(repositories.size()>0){
               // if(repositories.get(0).getName()!=null){
                    repo = repositories.get(0).getName();
               // }
            }
        } 
        if(a1.getTitle()!=null){
            this.title = a1.getTitle();
        }
        if(a1.getTopics()!=null){
            List<Object> topics = a1.getTopics();
            this.topics = StringUtils.join(topics," ; ");
        }
        return true;
    }
}
