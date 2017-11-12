<%-- 
    Document   : userProfile
    Created on : Jul 10, 2017, 11:51:44 PM
    Author     : Vishal Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="config.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK REL=STYLESHEET href="templatemo_style.css" rel="stylesheet" type="text/css" />
        <title>User Query</title>
    </head>
    <body>
        <div id="templatmeo_wrapper">
            
            <div id="templatemo_content_wrapper">
              

              <div id="templatemo_content">
                <div class="templatemo_box">
                  <h2> <span> </span> <center> 
            <form action="getfromIC" method="GET">
                <label for="icNo">Ic No</label>
                <input type="text" name="icNo">
                <input type="submit" value="submit">
            </form>
                      </center></h2></div></div></div></div>
    </body>
</html>
