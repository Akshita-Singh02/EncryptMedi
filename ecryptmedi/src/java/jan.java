/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/jan"})
public class jan extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
         
               
               int regno=Integer.parseInt(request.getParameter("regno"));
       Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	PreparedStatement pst= cd.prepareStatement("Select * from patient where regno=? ");
         pst.setInt(1,regno);
         ResultSet rs=pst.executeQuery();
        if(rs.next())
         {
             int num=rs.getInt(6);
             String dio=String.valueOf(num);
             Cookie c1=new Cookie("regnum",dio);
             response.addCookie(c1);
             Cookie []a=request.getCookies();
            String m=a[0].getName();
            String x=a[0].getValue();
            
            out.println("<br>"+m);
            out.println("<br>"+x);
            
            String n=rs.getString(1);
             String d=rs.getString(3);
             int p=rs.getInt(2);
             String s=rs.getString(5);
             String di=rs.getString(4);
             out.println("<br>NAME :"+n);
              out.println("<p align='right'> DATE :"+d+"</p>");
               out.println("DISEASE :"+di);
                out.println("TOTAL :Rs. 500");
            
          }
        else
        {
            out.println("INVALID REGISTRATION NUMBER !!! TRY AGAIN ");
           
        }
       
    }
    
    catch(Exception e)
    {
       // out.println(e);
                
    }
    }

    
}
