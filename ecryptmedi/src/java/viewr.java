import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/viewr"})
public class viewr extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int pid=Integer.parseInt(request.getParameter("pid"));
if(request.getParameter("view")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	PreparedStatement pst= cd.prepareStatement("Select * from patient where pid=? ");
         pst.setInt(1,pid);
         ResultSet rs=pst.executeQuery();
        out.println("<table border=1 width=50% height=50%>");  
         out.println("<tr><th>Name</th><th>Patient's ID</th><th>Date</th><th>Disease</th><th>Symptoms</th><tr>"); 
         while(rs.next())
         {
             String n=rs.getString(1);
             String d=rs.getString(3);
             int p=rs.getInt(2);
             String s=rs.getString(5);
             String di=rs.getString(4);
             
            out.println("<tr><td>" + n + "</td><td>" + p + "</td><td>" + d + "</td><td>" + di + "</td><td>" + s + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             cd.close();  
         
}
             	
     }
        catch(Exception e)
        {
            out.println("error:"+e);
        }
    }

    
}

