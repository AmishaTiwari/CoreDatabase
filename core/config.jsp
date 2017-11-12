<%-- 
    Document   : config
    Created on : Jul 10, 2017, 10:19:34 PM
    Author     : Vishal Kumar
--%>

<%
    String dbName = "main";
    String successFile = "/home/beast/Desktop/DRDO/";
    String myDriver = "org.gjt.mm.mysql.Driver";
    String url = "jdbc:mysql://localhost:3306/newegateway";
    String username = "root";
    String password = "root";
    HttpSession Ses = request.getSession(true);
    Ses.setAttribute("dbName", dbName);
    Ses.setAttribute("url", url);
    Ses.setAttribute("myDriver", myDriver);
    Ses.setAttribute("username", username);
    Ses.setAttribute("password", password);           
    Ses.setAttribute("successFile", successFile);
%>
