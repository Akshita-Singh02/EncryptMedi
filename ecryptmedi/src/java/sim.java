import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/sim"})
public class sim extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if(request.getParameter("add")!=null)
            {
                response.sendRedirect("add.html");
            }
            if(request.getParameter("delete")!=null)
            {
                response.sendRedirect("delete.html");
            }
           if(request.getParameter("update")!=null)
            {
                response.sendRedirect("update.html");
            }
           
if(request.getParameter("show")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 Statement st= cd.createStatement();
         ResultSet rs=st.executeQuery("Select * from staff");
         out.println("<table border=1 width=50% height=50%>");  
         out.println("<tr><th>Name</th><th>Address</th><th>Contact</th><th>S_ID</th><th>Position</th><tr>"); 
         while(rs.next())
         {
             String n=rs.getString(1);
             String a=rs.getString(2);
             int c=rs.getInt(3);
             int s=rs.getInt(4);
             String p=rs.getString(5);
             out.println("<tr><td>" + n + "</td><td>" + a + "</td><td>" + c + "</td><td>" + s + "</td><td>" + p + "</td></tr>");   
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

