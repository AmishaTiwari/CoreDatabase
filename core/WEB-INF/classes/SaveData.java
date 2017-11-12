/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import datahandling.DataProcess;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Vishal Kumar
 */
@WebServlet(urlPatterns = {"/SaveData"})
public class SaveData extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        if(session.getAttribute("obj1")==null){
                PrintWriter out = response.getWriter();
                out.println("404!");
                
        } else{
            String filename = "myFile.bib" ;
            response.setContentType("text/bibtex; charset=ISO-8859-1");
            response.setCharacterEncoding("ISO-8859-2");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
            PrintWriter out = response.getWriter();
            
            List<DataProcess> obj = (List<DataProcess>)session.getAttribute("obj1");
            if(request.getParameterValues("index")!=null){
                PrintWriter ou = response.getWriter();
                String id[] = request.getParameterValues("index");
                for(String it : id){
                    int i = parseInt(it);
                    DataProcess o = obj.get(i);
                    out.flush();
                     out.write("@Article{Core:"+o.id+",\n");
                     out.write("author = {"+StringUtils.join(o.authors.split("\\;")," and ")+"},\n");
                     out.write("citation = {"+o.citations+"},\n");
                     out.write("journal = {"+o.journals+"},\n");
                     out.write("dataPublished = {"+o.datePublished+"},\n");
                     out.write("title = {"+o.title+"},\n");
                     out.write("topics = {"+o.topics+"},\n");
                     String des = o.description;
                     des = StringUtils.join(des.split("\\$"), "\\$");
                     des = StringUtils.join(des.split("\\%"), "\\%");
                     out.write("description = {"+des+"},\n");
                     out.write("id = {"+o.id+"},\n");
                    out.write("language = {"+o.language+"},\n");
                    out.write("repository = {"+o.repo+"},\n");
                    out.write("oai = {"+o.oai+"},\n");
                    out.write("url = {"+o.fulltextUrls+"},\n");
                    out.write("}\n");
                }
            }
        }
    }

}
