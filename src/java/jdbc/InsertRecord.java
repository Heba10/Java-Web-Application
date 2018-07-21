/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdbc.DBInfo.*;

/**
 *
 * @author user
 */
@WebServlet(name = "InsertRecord", urlPatterns = {"/InsertRecord"})
public class InsertRecord extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertRecord</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertRecord at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection c=null;
        PreparedStatement s=null;
        try(PrintWriter out= response.getWriter()){
        Class.forName("com.mysql.jdbc.Driver");
        c= DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql="insert into transactions values (? ,? ,?)";
        s=c.prepareStatement(sql);
        String i= request.getParameter("Extract");
        String n=request.getParameter("Sensory");
        String p=request.getParameter("Funding");
        s.setString(1, i);
        s.setInt(2, Integer.parseInt(n));
        s.setString(3, p);
        s.executeUpdate();
        out.println("new record is added successfully");
   
        }
        catch(SQLException | ClassNotFoundException e){
        try(PrintWriter out=response.getWriter()){out.println("Error"+e.getMessage());
        //System.out.println("f");
        
        }
        
        
        
        
        }
        
        finally{
                try{
                if(s!=null)
                {s.close();}                
                
                if(c!=null)
                {c.close();}
                    }
            
            
        catch(SQLException e){}
        
       
        
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
