<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
   <head>  
<meta charset="ISO-8859-1">  
<title> VIEW BILL</title>  
 
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

</ul>
 <div class="container">
 
    <label for="regno"><b>ENTER YOUR REGISTRATION NUMBER :</b></label>
    <input type="text" placeholder="Enter Registration Number" name="regno" >
    <br><br>
           <button class="button button1" name="view">VIEW BILL </button>
            <br>
               <%
    try
    {
       int regno=Integer.parseInt(request.getParameter("regno"));
       Class.forName("org.apache.derby.jdbc.ClientDriver");
           	Connection cd = DriverManager.getConnection("jdbc:derby://localhost:1527/data","app","app");
       	PreparedStatement pst= cd.prepareStatement("Select * from patient where regno=? ");
         pst.setInt(1,regno);
         ResultSet rs=pst.executeQuery();
        if(rs.next())
         {
             int num=rs.getInt(6);
             String dio=String.valueOf(num);
             
               session.setAttribute("regnum",dio);  
               session.setAttribute("hello",dio);
            response.sendRedirect("b_s.jsp");
            
          }
        else
        {
            out.println("INVALID REGISTRATION NUMBER !!! TRY AGAIN ");
           
        }
       
    }
    
    catch(Exception e)
    {
      // out.println(e);
                
    }
   %>

           </div>
 </form>
 </body>  
</html>
