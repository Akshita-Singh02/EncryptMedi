<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>  
<meta charset="ISO-8859-1">  
<title>PATIENT HOME PAGE</title>  
 
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
  width: 15%;
}


.card {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  border-radius: 5px; /* 5px rounded corners */
}

.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

/* Add some padding inside the card container */
.container {
  padding: 2px 16px;
}

img {
  border-radius: 5px 5px 0 0;
}
    </style>
     </head>
<body>  
 <form action="home.jsp" method="post">
           <center> <h1>||  HOSPITAL  ||</h1></center>
        <div class="topnav">
  <a class="active" href="home.jsp">Home</a>
        </div>
    <ul class="breadcrumb">
<li> <a href="home.jsp"> HOME </a></li> 

</ul>
           <div class="container">
               <br>
   <div class="card">
  <img src="images/download.png" alt="Avatar"  style="height:50%" usemap="#workmap">
  <map name="workmap">
  <area shape="rect" coords="24,34,270,350" alt="Computer" href="bill_s.jsp">
  </map>
  
  <div class="container">
    <h4><b>Bill</b></h4>
    
  </div>
</div>
               
           </div>
           
 </form>
 </body>  
</html>
