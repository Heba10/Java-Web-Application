<%-- 
    Document   : get_data_to_delete
    Created on : May 2, 2018, 11:26:54 AM
    Author     : Do3aa
--%>
<%@page import="java.util.*"%>
<%@page import="static jdbc.DB_Connect.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Record</title>
    </head>
    <body>
       <h2>Delete an Existing Record</h2>
        <form action="DeleteRecord" method="post">
            Id: <select name ='Funding'>
          <% 
                    List <String> ids = getAllIdValues();
                     for(String Funding: ids){
                    out.print("<option>"+Funding+"</option>");
                    }
                %>
            </select>
            <br>
            <input type="submit" value='Delete Record'>   
        </form>
                </body>
</html>
