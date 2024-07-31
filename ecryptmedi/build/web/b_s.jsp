<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BILL</title>
        <style>
        .topnav {
            background-color: #333;
            overflow: hidden;
        }

        .topnav a {
            float: left;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 17px;
        }


        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }


        .topnav a.active {
            background-color: #00bcd4;
            color: white;
        }

        ul.breadcrumb {
            padding: 10px 16px;
            list-style: none;
            background-color: #eee;
        }


        ul.breadcrumb li {
            display: inline;
            font-size: 18px;
        }


        ul.breadcrumb li+li:before {
            padding: 8px;
            color: black;
            content: "/\00a0";
        }


        ul.breadcrumb li a {
            color: #0275d8;
            text-decoration: none;
        }


        ul.breadcrumb li a:hover {
            color: #01447e;
            text-decoration: underline;
        }

        
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password], input[type=email], input[type=number] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 10%;
  border-radius: 50%;
}

.container {
  padding: 16px;
 
}
input[type=text], input[type=password], input[type=email], input[type=number] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: blue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
  background-color: black;
}
.button1 {background-color: #80deea;}



    </style>
    </head>
    <body>
        <form action="b_s.jsp" method="post">
             <center> <h1>||  HOSPITAL  ||</h1></center>
             <div class="topnav">
  <a class="active" href="home.jsp">Home</a>
        </div>
    <ul class="breadcrumb">
<li> <a href="home.jsp"> HOME </a></li> 
<li> <a href="bill_s.jsp"> BILL </a></li> 
<li> <a href="b_s.jsp"> VIEW BILL </a></li> 

</ul>
             <center> <h1>BILL</h1></center>
             <hr><hr>
        <%
            try
            {
                
            String rnum=(String)session.getAttribute("regnum"); 
           
            
            int r=Integer.parseInt(rnum);
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	PreparedStatement pst= cd.prepareStatement("Select * from patient where regno=? ");
         pst.setInt(1,r);
         ResultSet rs=pst.executeQuery();
        
         if(rs.next())
         {
             String n=rs.getString(1);
             String d=rs.getString(3);
             int p=rs.getInt(2);
             String s=rs.getString(5);
             String di=rs.getString(4);
             out.println("<br><b>NAME :"+n+"<b>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;   DATE :"+d);
              
               out.println("<br><br><b>DISEASE :"+di+"<br><br><hr>");
                out.println("<b><font color='red'>TOTAL </font>:Rs. 500<hr><br><br>");
          
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             cd.close();  
            }
            
            catch (Exception e)
            {
                out.println("<br>error"+e);
            }
            
        %>
        </form>
    </body>
</html>
