import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String name=request.getParameter("name");
        	String address=request.getParameter("address");
        	int mnumber=Integer.parseInt(request.getParameter("mnumber"));
        	String email=request.getParameter("email");
                String psw=request.getParameter("psw");
                String psw1=request.getParameter("psw1");
if(psw.equals(psw1))
            	{ Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("insert into detail (email,psw,name,address,mnumber)values(?,?,?,?,?)");
            	ps.setString(3,name);
             	ps.setString(4,address);
             	ps.setInt(5,mnumber);
                ps.setString(1,email);
                ps.setString(2, psw);
                
           	 
             	int i=ps.executeUpdate();
             	if(i>0)
             	{
                 	out.println("user register");
             	}
             	else
             	{
             	out.println("user not register");
             	}
        	}
             	else
             	{
                     	out.println("re-enter password not found");
                     	}

        }
        catch(Exception e)
        {
            out.println("error:"+e);
        }
    }

    
}
