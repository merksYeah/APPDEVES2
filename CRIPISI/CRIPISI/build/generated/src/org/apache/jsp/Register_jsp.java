package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\"    content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\"      content=\"Sergey Pozhilov (GetTemplate.com)\">\n");
      out.write("\t\n");
      out.write("\t<title>Sign up</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"assets/images/gt_favicon.png\">\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" media=\"screen\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Custom styles for our template -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.css\" media=\"screen\" >\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("\n");
      out.write("\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"assets/js/html5shiv.js\"></script>\n");
      out.write("\t<script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- Fixed navbar -->\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-top headroom\" >\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<!-- Button for smallest screens -->\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\"><img src=\"assets/images/onlinelogomaker-020815-1336020815-1343020815-1344.png\" alt=\"Progressus HTML5 template\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav pull-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a class=\"btn\" href=\"signin.html\">SIGN IN / SIGN UP</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div><!--/.nav-collapse -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> \n");
      out.write("\t<!-- /.navbar -->\n");
      out.write("\n");
      out.write("\t<header id=\"head\" class=\"secondary\"></header>\n");
      out.write("\n");
      out.write("\t<!-- container -->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t<li class=\"active\">Registration</li>\n");
      out.write("\t\t</ol>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Article main content -->\n");
      out.write("\t\t\t<article class=\"col-xs-12 maincontent\">\n");
      out.write("\t\t\t\t<header class=\"page-header\">\n");
      out.write("\t\t\t\t\t<h1 class=\"page-title\">Registration</h1>\n");
      out.write("\t\t\t\t</header>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"thin text-center\">Register a new account</h3>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-center text-muted\">Register for a CHEMRES Employee Account, </p>\n");
      out.write("\t\t\t\t\t\t\t<hr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<form action = \"Register\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-margin\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>First Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name = \"username\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-margin\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Last Name</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-margin\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>Email Address <span class=\"text-danger\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row top-margin\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Password <span class=\"text-danger\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label>Confirm Password <span class=\"text-danger\">*</span></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<hr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tI've read the <a href=\"page_terms.html\">Terms and Conditions</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>                        \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-4 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-action\" type=\"submit\">Register</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<!-- /Article -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t<!-- /container -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<footer id=\"footer\" class=\"top-space\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer1\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"widget-title\">Contact</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t<p>+234 23 9873237<br>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"mailto:#\">some.email@somewhere.com</a><br>\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t234 Hidden Pond Road, Ashland City, TN 37015\n");
      out.write("\t\t\t\t\t\t\t</p>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"widget-title\">Follow me</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"follow-me-icons clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-twitter fa-2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-dribbble fa-2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-github fa-2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fa fa-facebook fa-2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</p>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 widget\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"widget-title\">Text widget</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Excepturi, dolores, quibusdam architecto voluptatem amet fugiat nesciunt placeat provident cumque accusamus itaque voluptate modi quidem dolore optio velit hic iusto vero praesentium repellat commodi ad id expedita cupiditate repellendus possimus unde?</p>\n");
      out.write("\t\t\t\t\t\t\t<p>Eius consequatur nihil quibusdam! Laborum, rerum, quis, inventore ipsa autem repellat provident assumenda labore soluta minima alias temporibus facere distinctio quas adipisci nam sunt explicabo officia tenetur at ea quos doloribus dolorum voluptate reprehenderit architecto sint libero illo et hic.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div> <!-- /row of widgets -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer2\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 widget\">\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"simplenav\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Home</a> | \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"about.html\">About</a> |\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"sidebar-right.html\">Sidebar</a> |\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"contact.html\">Contact</a> |\n");
      out.write("\t\t\t\t\t\t\t\t<b><a href=\"signup.html\">Sign up</a></b>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 widget\">\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-body\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-right\">\n");
      out.write("\t\t\t\t\t\t\t\tCopyright &copy; 2014, Your name. Designed by <a href=\"http://gettemplate.com/\" rel=\"designer\">gettemplate</a> \n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div> <!-- /row of widgets -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- JavaScript libs are placed at the end of the document so the pages load faster -->\n");
      out.write("\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/headroom.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/jQuery.headroom.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/template.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
