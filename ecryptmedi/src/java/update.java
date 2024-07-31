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
@WebServlet(urlPatterns = {"/update"})
public class update extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             int sid=Integer.parseInt(request.getParameter("sid"));
           if(request.getParameter("b1")!=null)
           {
               String name=request.getParameter("name");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE staff set name=?  where sid=? ");
               ps.setInt(2, sid);
              
               ps.setString(1, name);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("sim.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
           
            if(request.getParameter("b2")!=null)
           {
               String address=request.getParameter("address");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE staff set address=?  where sid=? ");
               ps.setInt(2, sid);
               ps.setString(1, address);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("sim.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
 if(request.getParameter("b3")!=null)
           {
               int contact=Integer.parseInt(request.getParameter("mnumber"));
               
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE staff set contact=?  where sid=? ");
               ps.setInt(2, sid);
              
               ps.setInt(1, contact);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("sim.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
 
  if(request.getParameter("b4")!=null)
           {
              String position=request.getParameter("position");
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("UPDATE staff set position=?  where sid=? ");
               ps.setInt(2, sid);
              
               ps.setString(1, position);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("sim.html");
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

