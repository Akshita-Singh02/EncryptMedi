import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/add"})
public class add extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String name=request.getParameter("name");
        	String address=request.getParameter("address");
        	int contact=Integer.parseInt(request.getParameter("mnumber"));
        	int sid=Integer.parseInt(request.getParameter("sid"));
                String position=request.getParameter("position");
if(request.getParameter("add")!=null)
            	{ Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("insert into staff (name,address,contact,sid,position) values(?,?,?,?,?)");
            	ps.setString(1,name);
             	ps.setString(2,address);
             	ps.setInt(3,contact);
                ps.setInt(4,sid);
                ps.setString(5, position);
                int i=ps.executeUpdate();
             	if(i>0)
             	{
                    
                 	response.sendRedirect("sim.html");
                        
             	}
             	else
             	{
             	out.println("data not saved ");
             	}
                ps.close();
                cd.close();
        	}  }
        catch(Exception e)
        {
            out.println("error:"+e);
        }
    }}

