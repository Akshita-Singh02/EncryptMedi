import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/deleter"})
public class deleter extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
           int regno=Integer.parseInt(request.getParameter("regno"));
           if(request.getParameter("delete")!=null)
           {
               Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("DELETE from patient where regno=? ");
               ps.setInt(1, regno);
               int i=ps.executeUpdate();
               if(i>0)
               {
                   response.sendRedirect("prm.html");
               }
               else
               {
                   out.print("ERROR");
               }
           }
        }
        catch(Exception e )
        {
            out.println("error"+e);
        }
    }

   

}
