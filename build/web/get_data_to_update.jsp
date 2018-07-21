<%-- 
    Document   : get_data_to_update
    Created on : Apr 26, 2018, 8:54:13 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import ="static jdbc.DB_Connect.*"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh"content ="50">
        <title>Update Operation</title>
    </head>
    <body>
        <h2> Update an Existing Record</h2>
        <form action='UPdateRecord' method='post'>
            
            select Funding: <select name ='Funding'>
            <%
                List <String> ids = getAllIdValues();
                for(String Funding: ids){
                    out.print("<option>"+Funding+"</option>");
                }
                 
           %>
        </select>
        <br>
        Enter Extract:<input name ='Extract' size="50">
        <br>
         Enter Sensory:<input name ='Sensory' size="50">
        <br>
        <input type='submit' value='Insert Record'>
          
            
        </form>
          
    
                 
    </body>
</html>
