/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import datahandling.DataOperation;
import datahandling.DataProcess;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.core.oacore4j.articles.response.json.Article;
import java.util.Arrays;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vishal Kumar
 */
@WebServlet(urlPatterns = {"/process"})
public class process extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            HttpSession session = request.getSession(true);
            PrintWriter out = response.getWriter();
            String top=request.getParameter("topics");
            String k1=request.getParameter("keys1");
            String k2=request.getParameter("keys2");
            
            String json = request.getParameter("json");
            String repo = request.getParameter("repo");
            String sortV = "";
            if(request.getParameter("sort")!=null){
                sortV = request.getParameter("sort");
            }
            String[] rep = repo.split("#@#");
                       
            DataOperation ob1 = new DataOperation(json);
            if(top!=null){
                if(top.charAt(0)!='*'){
                    ob1.top = Arrays.asList(top.split("@"));
                }
            }
            if(k1!=null){
                if(k1.charAt(0)!='*'){
                    ob1.k1 = Arrays.asList(k1.split("@"));
                }
            }
            if(k2!=null){
                if(k2.charAt(0)!='*'){
                    ob1.k2 = Arrays.asList(k2.split("@"));
                }
            }
            List<Article> data = ob1.getArticle();
            out.println("ok"+data.size());
            ob1.copyArticle(rep);
            for(String it:rep){
                out.println(it);
            }
            if(sortV.equals("1"))
                ob1.sorted2();
            else if(sortV.equals("2"))
                ob1.sorted3();
            else
                ob1.sorted();
            List<DataProcess> l2 = ob1.getData();
            int i=0;
            for(DataProcess it : l2){
                out.println(it.repo);
            }
            if(session.getAttribute("obj1")!=null){
                session.removeAttribute("obj1");
            }
            request.setAttribute("obj", data);
            session.setAttribute("obj1",l2);
            out.println("here");
            request.getRequestDispatcher("showValue.jsp").forward(request, response);
    }

}
