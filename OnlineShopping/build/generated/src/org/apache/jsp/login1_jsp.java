package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/myvars.jsp");
    _jspx_dependants.add("/extfiles.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String dbpath = "jdbc:mysql://localhost/shoppingdb";
    String dbuser = "myshopdbuser";
    String dbpass = "123";
    String salt="&*^@#&*%^&%JHGJasdasHG%$%^!786724312386";
    String emailun="gtbtrial@gmail.com";
    String emailpass="gtbinstitute13#";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/icons/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/fasthover.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<link href='css/font1.css' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='css/font2.css' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smooth-scrolling -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"w3l_login\">\n");
      out.write("                   Welcome \n");
      out.write("                   ");

                   if(session.getAttribute("nm")!=null)
                   {
                       out.print(session.getAttribute("nm"));
                       out.print(" <a href='changepass.jsp'>Change Password</a> ");
                       out.print("<a href='signout.jsp'>Signout</a>");
                   }
                   else
                   {
                       out.print("Guest");
                       out.print(" <a href='login.jsp'>Login</a> ");
                       out.print("<a href='signup.jsp'>Sign Up</a>");
                   }
                        
                   
      out.write("\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3l_logo\">\n");
      out.write("                        <h1><a href=\"index.html\">Women's Fashion<span>For Fashion Lovers</span></a></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"search\">\n");
      out.write("                        <input class=\"search_box\" type=\"checkbox\" id=\"search_box\">\n");
      out.write("                        <label class=\"icon-search\" for=\"search_box\"><span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span></label>\n");
      out.write("                        <div class=\"search_form\">\n");
      out.write("                                <form action=\"#\" method=\"post\">\n");
      out.write("                                        <input type=\"text\" name=\"Search\" placeholder=\"Search...\">\n");
      out.write("                                        <input type=\"submit\" value=\"Send\">\n");
      out.write("                                </form>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cart box_1\">\n");
      out.write("                        <a href=\"showcart.jsp\">\n");
      out.write("                                <div class=\"total\">\n");
      out.write("                                    <span>\n");
      out.write("                                    ");
 
                                        if(session.getAttribute("tcost")!=null)
                                        {
                                            out.print(session.getAttribute("tcost"));
                                        }
                                    
      out.write("</span> (<span>\n");
      out.write("            ");

            if(session.getAttribute("un")!=null)
            {
                try
                {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection myconn = DriverManager.getConnection(dbpath,dbuser,dbpass);
                       try
                       {
                            String c = "select count(srno) from carttable where username=?";
                            PreparedStatement myset =  myconn.prepareStatement(c);
                            myset.setString(1, session.getAttribute("un").toString());
                            ResultSet rs = myset.executeQuery();
                            if(rs.next()==true)
                            {
                                out.print(rs.getString(1));
                            }
                            else
                            {
                                out.print("0" + "Items");
                            }


                       }
                       catch(Exception e)
                       {
                           out.print("Error in query " + e.getMessage());
                       }
                       finally
                       {
                           myconn.close();
                       }

                }
                catch(Exception e)
                {
                    out.print("Error in connection " + e.getMessage());
                }
            }
            else
            {
                out.print("0 Items");
            }
            
      out.write("\n");
      out.write("                                    </span> )</div>\n");
      out.write("                                <img src=\"images/bag.png\" alt=\"\" />\n");
      out.write("                        </a>\n");
      out.write("                        <p><a href=\"showcart.jsp\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\t\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"navigation\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\t\n");
      out.write("\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("                                                        \n");
      out.write("                           \n");
      out.write("                                                        <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                                         <div class=\"row\">\n");
      out.write("\t\t\t");

                        try
                        {
                      Connection myconn = DriverManager.getConnection(dbpath,dbuser,dbpass);
                       try
                       {
                            String c = "select * from addcat";
                            PreparedStatement myset =  myconn.prepareStatement(c);
                           
                            ResultSet rs = myset.executeQuery();
                            if(rs.next())//women
                            {
                                do
                                {
                   
                                    String c1 = "select * from addsubcat where MainCatID=?";
                                    PreparedStatement myset1 =  myconn.prepareStatement(c1);
                                    myset1.setString(1,rs.getString("CatId"));
                                    ResultSet rs1 = myset1.executeQuery();
                                      out.print("<div class='col-sm-3'>"
                                                  + "<ul class='multi-column-dropdown'>"
                                                  + "<h6>" + rs.getString("catname") + "</h6>");
                                    if(rs1.next())
                                    {
                                        do
                                        {
                                                  out.print("<li><a href='showprods.jsp?scid= " + rs1.getString("subcatid") + "'><span>" + rs1.getString("subcatname") + "</span></a></li>");    
                                        }
                                        while(rs1.next());
                                    }
                                     out.print("</ul></div>"); 
                                }
                               
                                while(rs.next());
                            }
                       }
                       catch(Exception e)
                       {
                           out.print("Error in query " + e.getMessage());
                       }
                       finally
                       {
                           myconn.close();
                       }

                }
                catch(Exception e)
                {
                    out.print("Error in connection " + e.getMessage());
                }  
                            
      out.write("\n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"short-codes.html\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mail.html\" class=\"act\">Mail Us</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("\n");
      out.write("        ");

        
        if(request.getParameter("msg")!=null)
        {
            out.print("<script>alert('Please login to access the page')</script>");
        }
            
        
      out.write("\n");
      out.write("        ");


        if(request.getParameter("msg2")!=null)
        {
            out.print("<script>alert('Your account has been activated, please login now')</script>");
        }

        
      out.write("\n");
      out.write("        ");

            Cookie cookies[] = request.getCookies();
            Cookie mycookie=null;
            if(cookies!=null)
            {
                
                for(int i=0;i<cookies.length;i++)
                {
                    if(cookies[i].getName().equals("uinfo"))
                    {
                        mycookie = cookies[i];
                        break;
                    }
                }
                if(mycookie!=null)
                {
                    String un = mycookie.getValue();               
                    try 
                    {
                        Class.forName("com.mysql.jdbc.Driver");

                        Connection myconn = DriverManager.getConnection(dbpath, dbuser, dbpass);
                        try 
                        {
                            String q = "select name,username from signup where username=? ";
                            PreparedStatement myst = myconn.prepareStatement(q);
                            myst.setString(1, un);



                            ResultSet res = myst.executeQuery();
                            if (res.next() == true) 
                            {
                                    String n = res.getString("name");
                                    session.setAttribute("nm", n);
                                    session.setAttribute("un", un);
                                    response.sendRedirect("index.jsp");
                            }
                        } 
                        catch (Exception e) 
                        {
                            out.print("Error in query " + e.getMessage());
                        } 
                        finally 
                        {
                            myconn.close();
                        }
                    } 
                    catch (Exception e) 
                    {
                        out.print("Error in connection " + e.getMessage());
                    }
                }
        }
           
           
           
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- //header -->\n");
      out.write("        <!-- banner -->\n");
      out.write("        <div class=\"banner10\" id=\"home1\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2>Login</h2>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //banner -->\n");
      out.write("\n");
      out.write("        <!-- breadcrumbs -->\n");
      out.write("        <div class=\"breadcrumb_dress\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a> <i>/</i></li>\n");
      out.write("                    <li>Login</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //breadcrumbs -->\n");
      out.write("\n");
      out.write("        <!-- mail -->\n");
      out.write("        <div class=\"mail\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>Login</h3>\n");
      out.write("                <div class=\"register\">\n");
      out.write("                    <form action=\"Login.html\" method=\"post\" id=\"form1\">\t\t\t\n");
      out.write("                        <input placeholder=\"Username\" name=\"email\" type=\"email\" required=\"\">\t\n");
      out.write("                        <input placeholder=\"Password\" name=\"password\" type=\"password\" required=\"\"><br/><br/>\n");
      out.write("                        <a href=\"forgotpass.jsp\">Forgot Password</a><br/><br/>\n");
      out.write("                        \n");
      out.write("                        <label><input type=\"checkbox\" name=\"cb1\">Remember Me</label>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"sign-up\">\n");
      out.write("                            <input type=\"submit\" value=\"Login\" name=\"submit\"/>\n");
      out.write("                            <div id=\"msgdiv\">\n");
      out.write("                                ");

                                        
                                if(request.getAttribute("msg")!=null)
                                {
                                    out.print(request.getAttribute("msg"));
                                }
                                    
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3_footer_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Contact</h3>\n");
      out.write("\t\t\t\t\t<p>Duis aute irure dolor in reprehenderit in voluptate velit esse.</p>\n");
      out.write("\t\t\t\t\t<ul class=\"address\">\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>1234k Avenue, 4th block, <span>New York City.</span></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:info@example.com\">info@example.com</a></li>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+1234 567 567</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Information</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"info\"> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mail.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"short-codes.html\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"faq.html\">FAQ's</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.html\">Special Products</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Category</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"info\"> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"dresses.html\">Dresses</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sweaters.html\">Sweaters</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"shirts.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sarees.html\">Sarees</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"skirts.html\">Shorts & Skirts</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("\t\t\t\t\t<h3>Profile</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"info\"> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.html\">Summer Store</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"checkout.html\">My Cart</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h4>Follow Us</h4>\n");
      out.write("\t\t\t\t\t<div class=\"agileits_social_button\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"google\"> </a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"pinterest\"> </a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-copy\">\n");
      out.write("\t\t\t<div class=\"footer-copy1\">\n");
      out.write("\t\t\t\t<div class=\"footer-copy-pos\">\n");
      out.write("\t\t\t\t\t<a href=\"#home1\" class=\"scroll\"><img src=\"images/arrow.png\" alt=\" \" class=\"img-responsive\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<p>&copy; 2017 Women's Fashion. All rights reserved | Design by <a href=\"#\">NSPSNM</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("    </body>\n");
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
