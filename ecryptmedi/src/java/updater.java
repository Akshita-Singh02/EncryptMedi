import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.lang.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/updater"})
public class updater extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             int regno=Integer.parseInt(request.getParameter("regno"));
           if(request.getParameter("b1")!=null)
           {
               String name=request.getParameter("name");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE patient set name=?  where regno=? ");
               ps.setInt(2, regno);
              
               ps.setString(1, name);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("rm.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
           
            if(request.getParameter("b2")!=null)
           {
               String date=request.getParameter("date");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE patient set date=?  where regno=? ");
               ps.setInt(2, regno);
               ps.setString(1, date);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("rm.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
 if(request.getParameter("b3")!=null)
           {
               String disease =request.getParameter("disease");
               
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE patient set disease=?  where regno=? ");
               ps.setInt(2, regno);
              
               ps.setString(1, disease);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("rm.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
 
  if(request.getParameter("b4")!=null)
           {
              String symptoms=request.getParameter("symptoms");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE patient set symptoms=?  where regno=? ");
               ps.setInt(2, regno);
              
               ps.setString(1, symptoms);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("rm.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
             	
     }
        catch(Exception e)
        {
            out.println("error:"+e);
        }
    }

    
}

