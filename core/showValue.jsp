<%--
    Document   : showValue
    Created on : Jul 7, 2017, 6:31:45 PM
    Author     : Vishal Kumar
--%>

<%@page import="datahandling.DataProcess"%>
<%@page import="uk.ac.core.oacore4j.articles.response.json.Language"%>
<%@page import="java.util.ArrayList"%>
<%@page import="uk.ac.core.oacore4j.articles.response.json.Article"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="config.jsp" %>
<%
    List<DataProcess> obj2 = (List<DataProcess>)request.getSession().getAttribute("obj1");
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <LINK REL=STYLESHEET href="templatemo_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h2>Total Records: <%out.print(obj2.size());%></h2>
        <button id="allC">Mark All</button>
        <button id="none">Unmark All</button>
        <button id="rang">Range</button> 
        <input style="width: 50px" id="minR" type="number" value="1" min="1" max="<%out.print(obj2.size());%>"> 
        to
        <input style="width: 50px" id="maxR" type="number" max ="<%out.print(obj2.size());%>" value="<%out.print(obj2.size());%>" >
        <form action="SaveData" id= "merge" method="post">
            <div><input type="submit" value="submit"></div>
            <input type="textarea" name="query" style="display: none" value="<%out.println("obj1");%>">
            <% int i=0;
               for(DataProcess it: obj2){
                out.println("<div id='div12400' name='div12400'>");
                    out.println("<table class='tablebindsdi' border='0'>");
                        out.println("<tr>");
                            out.println("<th  name='title'>");
                            out.println("<input type='checkbox' id='"+i+"' class='chkbx' name='index' value='"+i+"'>");
                            out.println("<a href=\""+it.fulltextUrls+"\">Title: "+it.title);
                            out.println("</a></th></tr>");
                        out.println("<tr>");
                            out.println("<td  name='id'>Id: <Font style='color:Black;font-weight:Normal;'>");
                                    out.println(it.id);
                            out.println("</font></td></tr>");
                        out.println("<tr><td name='author'> Author: <Font style='color:Black;font-weight:Normal;'>");
                                    out.println(it.authors);
                                    out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='doctype'>Document Type: <Font style='color:Black;font-weight:Normal;'>Article");
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='lang'>Language: <Font style='color:Black;font-weight:Normal;'>");
                                    out.println(it.language);
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='lang'>Repository: <Font style='color:Black;font-weight:Normal;'>");
                                    out.println(it.repo);
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td name='pub'> Publishing Date: <Font style='color:Black;font-weight:Normal;'>"+it.datePublished);
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='topics'>Topics: <Font style='color:Black;font-weight:Normal;'>"+it.topics);
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='description'> Description: <Font style='color:Black;font-weight:Normal;'><div class='wrap_text'>");
                            out.println(it.description);//description
                            out.println("</div></font></td></tr>");
                        out.println("<tr>");
                            out.println("<td  name='oai'>oai: <Font style='color:Black;font-weight:Normal;'>"+it.oai);
                            out.println("</font></td></tr>");
                        out.println("<tr>");
                        out.println("<tr><td><hr></td></tr>");

                    out.println("</table>	</div>");
                    i++;
            }
            %>
        </form>
        <script src="js/jquery.min.js"></script>
        <script src="js/chkbox.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#merge').checkboxes('range', true);
                $("#allC").on('click',function(){
                    $("#merge").checkboxes('check');
                    e.preventDefault();
                });
                
                $("#none").on('click',function(){
                    $("#merge").checkboxes('uncheck');
                    e.preventDefault();
                });
                $("#rang").on('click',function(){
                    $("#merge").checkboxes('uncheck');
                    var st = parseInt($("#minR").val());
                    var en = parseInt($("#maxR").val());
                    if(st>en||st<1||en<1){
                        alert('wrong range');
                        return;
                    }
                    st--;
                    en--;
                    for(var i = st; i<=en; i++){
                        var x=i.toString();
                        $("#"+x).prop("checked",true);
                    }
                });
            });
        </script>
    </body>
</html>
