package datahandling;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import uk.ac.core.oacore4j.articles.response.ArticleSearchResponse;
import uk.ac.core.oacore4j.articles.response.json.Article;

/**
 *
 * @author Vishal Kumar
 */
public class DataOperation extends KMP {
    private List<DataProcess> l1=null;
    private List<Article> l2=null;
    public List<String> top;
    public List<String> k1;
    public List<String> k2;
    
    public DataOperation(String json) throws IOException{
        ObjectMapper mp = new ObjectMapper();
            ArticleSearchResponse readValue = mp.readValue(json, ArticleSearchResponse.class);
            l2 = readValue.getData();
            l1 = new ArrayList();
            top = k1 = k2 = null;
    }
    public void copyArticle(String[] rep){
        int i1=0;
        for(Article it : l2){
            DataProcess o1 = new DataProcess();
            if(o1.storeData(it)){
                if(top!=null){
                    for (String it1 : top) {
						//o1.repo += it1;
                        if(!it1.equals("*")){
						//	o1.repo += " 1 ";
                            o1.cnt[0][0] += KMPSearch(it1.toLowerCase(),o1.title.toLowerCase());
                            o1.cnt[0][1] += KMPSearch(it1.toLowerCase(),o1.topics.toLowerCase());
                            o1.cnt[0][2] += KMPSearch(it1.toLowerCase(),o1.description.toLowerCase());
                        }
                    }
                }
                if(k1!=null){
                    for (String it1 : k1) {
					//	o1.repo += it1;
                        if(!it1.equals("*")){
						//	o1.repo += " 2 ";
                            o1.cnt[1][0] += KMPSearch(it1.toLowerCase(),o1.title.toLowerCase());
                            o1.cnt[1][1] += KMPSearch(it1.toLowerCase(),o1.topics.toLowerCase());
                            o1.cnt[1][2] += KMPSearch(it1.toLowerCase(),o1.description.toLowerCase());
                        }
                    }
                }
                if(k2!=null){
                    for (String it1 : k2) {
						//o1.repo += it1;
                        if(!it1.equals("*")){
						//	o1.repo += " 1 ";
                            o1.cnt[2][0] += KMPSearch(it1.toLowerCase(),o1.title.toLowerCase());
                            o1.cnt[2][1] += KMPSearch(it1.toLowerCase(),o1.topics.toLowerCase());
                            o1.cnt[2][2] += KMPSearch(it1.toLowerCase(),o1.description.toLowerCase());
                        }
                    }
                }
				
			//	o1.repo += Integer.toString(o1.cnt[0][0]) + " ^ " + Integer.toString(o1.cnt[0][1]) + " ^ " + Integer.toString(o1.cnt[0][2]) + " ^ ";
			//	o1.repo += Integer.toString(o1.cnt[1][0]) + " ^ " + Integer.toString(o1.cnt[1][1]) + " ^ " + Integer.toString(o1.cnt[1][2]) + " ^ ";
			//	o1.repo += Integer.toString(o1.cnt[2][0]) + " ^ " + Integer.toString(o1.cnt[2][1]) + " ^ " + Integer.toString(o1.cnt[2][2]) + " ^ ";
				
                if(o1.repo.equals("")){
                    o1.repo = rep[i1];
                }
                l1.add(o1);
                i1++;
            }
        }
        l2=null;
    }
    public List<Article> getArticle(){
        return l2;
    }
    public List<DataProcess> getData() {
        
        int size = l1.size();
        int x = size>200?200:size;
        List<DataProcess> l = new ArrayList();
        int i=0;
        for(DataProcess it : l1){
                l.add(it);
                i++;
            if(i==200) break;
        }
        l1=null;
        return l;
    }
    
    public void sorted(){
        
        Collections.sort(this.l1, new Comparator<DataProcess>(){
            @Override
            public int compare(DataProcess o1, DataProcess o2) {
                
                int s0O1= o1.cnt[0][0]+o1.cnt[0][1]+o1.cnt[0][2]; //topic
                int s1O1= o1.cnt[1][0]+o1.cnt[1][1]+o1.cnt[1][2]; //k1
                int s2O1= o1.cnt[2][0]+o1.cnt[2][1]+o1.cnt[2][2]; //k2
                
                int b1= (s0O1==0?0:4) + (s0O1==0?0:2)+ (s2O1==0?0:1);
                
                int s0O2= o2.cnt[0][0]+o2.cnt[0][1]+o2.cnt[0][2]; //topic
                int s1O2= o2.cnt[1][0]+o2.cnt[1][1]+o2.cnt[1][2]; //k1
                int s2O2= o2.cnt[2][0]+o2.cnt[2][1]+o2.cnt[2][2]; //k2
                
                int b2= (s0O2==0?0:4) + (s0O2==0?0:2)+ (s2O2==0?0:1);
                
                if (b1 != b2) return b2-b1;
                
                int sO1 = s0O1 + s1O1 + s2O1;
                int sO2 = s0O2 + s1O2 + s2O2;
                
                if(sO1!=sO2) return sO2-sO1;
                
                if(s0O1 != s0O2) return s0O2 - s0O1;
                if(s0O1 != s0O2) return s1O2 - s1O1;
                if(s0O1 != s0O2) return s2O2 - s2O1;
                
                if( o1.cnt[0][0] != o2.cnt[0][0]) return o2.cnt[0][0] - o1.cnt[0][0];
                if( o1.cnt[0][1] != o2.cnt[0][1]) return o2.cnt[0][1] - o1.cnt[0][1];
                if( o1.cnt[0][2] != o2.cnt[0][2]) return o2.cnt[0][2] - o1.cnt[0][2];
                
                if( o1.cnt[1][0] != o2.cnt[1][0]) return o2.cnt[1][0] - o1.cnt[1][0];
                if( o1.cnt[1][1] != o2.cnt[1][1]) return o2.cnt[1][1] - o1.cnt[1][1];
                if( o1.cnt[1][2] != o2.cnt[1][2]) return o2.cnt[1][2] - o1.cnt[1][2];
                
                if( o1.cnt[2][0] != o2.cnt[2][0]) return o2.cnt[2][0] - o1.cnt[2][0];
                if( o1.cnt[2][1] != o2.cnt[2][1]) return o2.cnt[2][1] - o1.cnt[2][1];
                if( o1.cnt[2][2] != o2.cnt[2][2]) return o2.cnt[2][2] - o1.cnt[2][2];

                
                return 0;
            }
            
        });
    }
    public void sorted2(){
        
        Collections.sort(this.l1, new Comparator<DataProcess>(){
            @Override
            public int compare(DataProcess o1, DataProcess o2) {
                return o2.year-o1.year;
            }
        });
    }
    
    public void sorted3(){
        
        Collections.sort(this.l1, new Comparator<DataProcess>(){
            @Override
            public int compare(DataProcess o1, DataProcess o2) {
                long a2 = Long.parseLong(o2.id);
                long a1 = Long.parseLong(o1.id);
                return a2<a1?-1:1;
                
            }
        });
    }
    
}
