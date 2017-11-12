<%-- 
    Document   : runUser
    Created on : Jul 10, 2017, 11:05:26 PM
    Author     : Vishal Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="config.jsp" %>
<% String id = "";%>
<sql:setDataSource var = "snapshot" driver = myDriver
         url = url
         user = username  password = password/>
<sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Employees;
      </sql:query>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK REL=STYLESHEET href="templatemo_style.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
