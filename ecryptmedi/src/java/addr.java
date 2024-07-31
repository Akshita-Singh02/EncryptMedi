import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/addr"})
public class addr extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String name=request.getParameter("name");
        	String date=request.getParameter("date");
        	String symptoms=request.getParameter("symptoms");
        	int pid=Integer.parseInt(request.getParameter("pid"));
                String disease=request.getParameter("disease");
                int regno=Integer.parseInt(request.getParameter("regno"));
if(request.getParameter("add")!=null)
            	{ 
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	 
            	PreparedStatement ps=cd.prepareStatement("insert into patient values(?,?,?,?,?,?)");
            	ps.setString(1,name);
             	ps.setString(3,date);
             	ps.setString(5,symptoms);
                ps.setInt(2,pid);
                ps.setString(4, disease);
                ps.setInt(6,regno);
                
           	 
             	int i=ps.executeUpdate();
             	if(i>0)
             	{
                    
                 	response.sendRedirect("rm.html");
                        
             	}
             	else
             	{
             	out.println("data not saved ");
             	}
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

