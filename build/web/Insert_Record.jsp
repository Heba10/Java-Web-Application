<%-- 
    Document   : get_data_to_insert
    Created on : Apr 14, 2018, 9:26:38 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert_Record</title>
    </head>
    <body>
        <h2>Insert Record</h2>
        <br> </br>
        <form action='InsertRecord' method='post'>
            Extract:<input name='Extract' size='25' >
            <br> </br>
            Sensory:<input name='Sensory' size='25' >
            <br> </br>
            Funding:<input name='Funding' size='25' >
            <br> </br>
            <input type='submit' value='Insert Record'>
            
        </form>
    </body>
</html>