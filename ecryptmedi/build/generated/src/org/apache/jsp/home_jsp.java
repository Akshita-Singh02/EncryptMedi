package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>  \n");
      out.write("<meta charset=\"ISO-8859-1\">  \n");
      out.write("<title>PATIENT HOME PAGE</title>  \n");
      out.write(" \n");
      out.write("<style>\n");
      out.write("        .topnav {\n");
      out.write("            background-color: #333;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .topnav a {\n");
      out.write("            float: left;\n");
      out.write("            color: #f2f2f2;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 14px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .topnav a:hover {\n");
      out.write("            background-color: #ddd;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .topnav a.active {\n");
      out.write("            background-color: #00bcd4;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul.breadcrumb {\n");
      out.write("            padding: 10px 16px;\n");
      out.write("            list-style: none;\n");
      out.write("            background-color: #eee;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        ul.breadcrumb li {\n");
      out.write("            display: inline;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        ul.breadcrumb li+li:before {\n");
      out.write("            padding: 8px;\n");
      out.write("            color: black;\n");
      out.write("            content: \"/\\00a0\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        ul.breadcrumb li a {\n");
      out.write("            color: #0275d8;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        ul.breadcrumb li a:hover {\n");
      out.write("            color: #01447e;\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password], input[type=email], input[type=number] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("  width: 10%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("  width: 15%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("  transition: 0.3s;\n");
      out.write("  border-radius: 5px; /* 5px rounded corners */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card:hover {\n");
      out.write("  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add some padding inside the card container */\n");
      out.write(".container {\n");
      out.write("  padding: 2px 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  border-radius: 5px 5px 0 0;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("     </head>\n");
      out.write("<body>  \n");
      out.write(" <form action=\"home.jsp\" method=\"post\">\n");
      out.write("           <center> <h1>||  HOSPITAL  ||</h1></center>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("  <a class=\"active\" href=\"home.jsp\">Home</a>\n");
      out.write("        </div>\n");
      out.write("    <ul class=\"breadcrumb\">\n");
      out.write("<li> <a href=\"home.jsp\"> HOME </a></li> \n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("           <div class=\"container\">\n");
      out.write("               <br>\n");
      out.write("   <div class=\"card\">\n");
      out.write("  <img src=\"images/download.png\" alt=\"Avatar\"  style=\"height:50%\" usemap=\"#workmap\">\n");
      out.write("  <map name=\"workmap\">\n");
      out.write("  <area shape=\"rect\" coords=\"24,34,270,350\" alt=\"Computer\" href=\"bill_s.jsp\">\n");
      out.write("  </map>\n");
      out.write("  \n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h4><b>Bill</b></h4>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write(" </form>\n");
      out.write(" </body>  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
