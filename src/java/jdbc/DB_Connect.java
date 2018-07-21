/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
import static jdbc.DBInfo.*;
import java.util.*;

import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class DB_Connect {
    public static List<String> getAllIdValues(){
       Connection c=null;
        Statement s=null;
        ResultSet r=null;
        List <String> ids=new ArrayList();
    try{
    Class.forName("com.mysql.jdbc.Driver");
    c=DriverManager.getConnection(URL, USERNAME, PASSWORD);
    s=c.createStatement();
     String query="select * from transactions";
     r=s.executeQuery(query);
     while (r.next()){
         String Funding =r.getString(3);
         ids.add(Funding);
     }
     return ids;
    }
    catch(SQLException | ClassNotFoundException e) {
        return null;
    }
    finally {
        
            try{
                if(s!=null)
                {s.close();}                
                
                if(c!=null)
                {c.close();}
                if(r!=null)
                          {r.close();}
                    }
            catch(SQLException e){}
            
       }
}
}
