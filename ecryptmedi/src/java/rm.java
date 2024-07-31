import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet(urlPatterns = {"/rm"})
public class rm extends HttpServlet {

    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if(request.getParameter("add")!=null)
            {
                response.sendRedirect("addr.html");
            }
           
           if(request.getParameter("update")!=null)
            {
                response.sendRedirect("updater.html");
            }
           
if(request.getParameter("view")!=null)
{
    response.sendRedirect("viewr.html");
}
             	
     }
        catch(Exception e)
        {
            out.println("error:"+e);
        }
    }

    
}

