import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.*;
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet 
{
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
{
 response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
             String a=request.getParameter("g1");
        	String email=request.getParameter("email");
               
                    	String psw=request.getParameter("psw");
             if(email.equals("admin@mail")&&psw.equals("123")&&a.equals("ADMIN"))
              {                  
                response.sendRedirect("ah.html");
              }
            if(a.equals("DOCTOR"))
              {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement pst=con.prepareStatement("select * from staff where email=? and psw=? and position='Doctor' ");
            	pst.setString(1,email);
            	pst.setString(2,psw);
           	 
ResultSet rst=pst.executeQuery();
if(rst.next())
{
RequestDispatcher rd=request.getRequestDispatcher("doch.html");
rd.forward(request,response);
}else
{
	out.println("invalid username and password");
}
rst.close();
pst.close();
con.close();
  }
              
            
        
              if(a.equals("PATIENT"))
              {
Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("select * from detail where email=? and psw=?  ");
               
            	ps.setString(1,email);
            	ps.setString(2,psw);
           	 
ResultSet rs=ps.executeQuery();
if(rs.next())
{
    
RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
rd.forward(request,response);
}


else
{
	out.println("invalid username and password");
}
rs.close();
ps.close();
cd.close();
  }
   }
catch(Exception e)
        {
            out.println("error:"+e);
        }
    }

   
}

