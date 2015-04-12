package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/LoadTemplate.jsp");
    _jspx_dependants.add("/ClientTemplate.jsp");
    _jspx_dependants.add("/PlantManagerTemplate.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Dashboard\">\r\n");
      out.write("    <meta name=\"keyword\" content=\"Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\r\n");
      out.write("\r\n");
      out.write("    <title>CRIPISI</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/zabuto_calendar.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/js/gritter/css/jquery.gritter.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/lineicons/style.css\">    \r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/chart-master/Chart.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("  <section id=\"container\" >\r\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("       <!-- **********************************************************************************************************************************************************\n");
      out.write("      TOP BAR CONTENT & NOTIFICATIONS\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("      <!--header start-->\n");
      out.write("     <header class=\"header black-bg\">\n");
      out.write("              <div class=\"sidebar-toggle-box\">\n");
      out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
      out.write("              </div>\n");
      out.write("            <!--logo start-->\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><b>CRIPSI</b></a>\n");
      out.write("            <!--logo end-->\n");
      out.write("            \n");
      out.write("            <div class=\"top-menu\">\n");
      out.write("            \t<ul class=\"nav pull-right top-menu\">\n");
      out.write("                    <li><a class=\"logout\" href=\"login.html\">Logout</a></li>\n");
      out.write("            \t</ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("      <!--header end-->\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("</html>");
      out.write("\r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      MAIN CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("      <!--main content start-->\r\n");
      out.write("      <section id=\"main-content\">\r\n");
      out.write("          <section class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-lg-9 main-chart\">\r\n");
      out.write("                  \r\n");
      out.write("                  \t<div class=\"row mtbox\">\r\n");
      out.write("                  \t\t<div class=\"col-md-2 col-sm-2 col-md-offset-1 box0\">\r\n");
      out.write("                  \t\t\t<div class=\"box1\">\r\n");
      out.write("\t\t\t\t\t  \t\t\t<span class=\"li_note\"></span>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>5</h3>\r\n");
      out.write("                  \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<p>5 purchase orders have been put on hold</p>\r\n");
      out.write("                  \t\t</div>\r\n");
      out.write("                  \t\t<div class=\"col-md-2 col-sm-2 box0\">\r\n");
      out.write("                  \t\t\t<div class=\"box1\">\r\n");
      out.write("\t\t\t\t\t  \t\t\t<span class=\"li_truck\"></span>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>5</h3>\r\n");
      out.write("                  \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<p>5 orders have been delivered</p>\r\n");
      out.write("                  \t\t</div>\r\n");
      out.write("                  \t\t<div class=\"col-md-2 col-sm-2 box0\">\r\n");
      out.write("                  \t\t\t<div class=\"box1\">\r\n");
      out.write("\t\t\t\t\t  \t\t\t<span class=\"li_stack\"></span>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>23</h3>\r\n");
      out.write("                  \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<p>You have 23 unread messages in your inbox.</p>\r\n");
      out.write("                  \t\t</div>\r\n");
      out.write("                  \t\t<div class=\"col-md-2 col-sm-2 box0\">\r\n");
      out.write("                  \t\t\t<div class=\"box1\">\r\n");
      out.write("\t\t\t\t\t  \t\t\t<span class=\"li_data\"></span>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<h3>OK!</h3>\r\n");
      out.write("                  \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  \t\t\t<p>The server is working perfectly. Relax & enjoy.</p>\r\n");
      out.write("                  \t\t</div>\r\n");
      out.write("                  \t\r\n");
      out.write("                  \t</div><!-- /row mt -->\t\r\n");
      out.write("                  \r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"row mt\">\r\n");
      out.write("                      <!-- TWITTER PANEL -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-sm-4 mb\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- REVENUE PANEL -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"darkblue-panel pn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"darkblue-header\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>REVENUE</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chart mt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sparkline\" data-type=\"line\" data-resize=\"true\" data-height=\"75\" data-width=\"90%\" data-line-width=\"1\" data-line-color=\"#fff\" data-spot-color=\"#fff\" data-fill-color=\"\" data-highlight-line-color=\"#fff\" data-spot-radius=\"4\" data-data=\"[200,135,667,333,526,996,564,123,890,464,655]\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"mt\"><b>P 17,980</b><br/>Month Income</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- /col-md-4 -->\r\n");
      out.write("                      \t\r\n");
      out.write("\r\n");
      out.write("                    </div><!-- /row -->\r\n");
      out.write("                    \r\n");
      out.write("                    \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"row mt\">\r\n");
      out.write("                      <!--CUSTOM CHART START -->\r\n");
      out.write("                      <div class=\"border-head\">\r\n");
      out.write("                          <h3>Orders</h3>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"custom-bar-chart\">\r\n");
      out.write("                          <ul class=\"y-axis\">\r\n");
      out.write("                              <li><span>10</span></li>\r\n");
      out.write("                              <li><span>8</span></li>\r\n");
      out.write("                              <li><span>6</span></li>\r\n");
      out.write("                              <li><span>4</span></li>\r\n");
      out.write("                              <li><span>2</span></li>\r\n");
      out.write("                              <li><span>0</span></li>\r\n");
      out.write("                          </ul>\r\n");
      out.write("                          <div class=\"bar\">\r\n");
      out.write("                              <div class=\"title\">JAN</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"7\" data-toggle=\"tooltip\" data-placement=\"top\">85%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar \">\r\n");
      out.write("                              <div class=\"title\">FEB</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"5\" data-toggle=\"tooltip\" data-placement=\"top\">50%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar \">\r\n");
      out.write("                              <div class=\"title\">MAR</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"4\" data-toggle=\"tooltip\" data-placement=\"top\">60%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar \">\r\n");
      out.write("                              <div class=\"title\">APR</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"3\" data-toggle=\"tooltip\" data-placement=\"top\">45%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar\">\r\n");
      out.write("                              <div class=\"title\">MAY</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"3\" data-toggle=\"tooltip\" data-placement=\"top\">32%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar \">\r\n");
      out.write("                              <div class=\"title\">JUN</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"8\" data-toggle=\"tooltip\" data-placement=\"top\">62%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"bar\">\r\n");
      out.write("                              <div class=\"title\">JUL</div>\r\n");
      out.write("                              <div class=\"value tooltips\" data-original-title=\"9\" data-toggle=\"tooltip\" data-placement=\"top\">75%</div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!--custom chart end-->\r\n");
      out.write("\t\t\t\t\t</div><!-- /row -->\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                  </div><!-- /col-lg-9 END SECTION MIDDLE -->\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      RIGHT SIDEBAR CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"col-lg-3 ds\">\r\n");
      out.write("                    <!--COMPLETED ACTIONS DONUTS CHART-->\r\n");
      out.write("\t\t\t\t\t\t<h3>NOTIFICATIONS</h3>\r\n");
      out.write("                                        \r\n");
      out.write("                      <!-- First Action -->\r\n");
      out.write("                      <div class=\"desc\">\r\n");
      out.write("                      \t<div class=\"thumb\">\r\n");
      out.write("                      \t\t<span class=\"badge bg-theme\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      \t<div class=\"details\">\r\n");
      out.write("                      \t\t<p><muted>2 Minutes Ago</muted><br/>\r\n");
      out.write("                      \t\t   <a href=\"#\">Miguel Mercado</a> Sent a memo.<br/>\r\n");
      out.write("                      \t\t</p>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Second Action -->\r\n");
      out.write("                      <div class=\"desc\">\r\n");
      out.write("                      \t<div class=\"thumb\">\r\n");
      out.write("                      \t\t<span class=\"badge bg-theme\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      \t<div class=\"details\">\r\n");
      out.write("                      \t\t<p><muted>2 Minutes Ago</muted><br/>\r\n");
      out.write("                      \t\t   <a href=\"#\">Miguel Mercado</a> Sent a memo.<br/>\r\n");
      out.write("                      \t\t</p>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Third Action -->\r\n");
      out.write("                      <div class=\"desc\">\r\n");
      out.write("                      \t<div class=\"thumb\">\r\n");
      out.write("                      \t\t<span class=\"badge bg-theme\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      \t<div class=\"details\">\r\n");
      out.write("                      \t\t<p><muted>2 Minutes Ago</muted><br/>\r\n");
      out.write("                      \t\t   <a href=\"#\">Miguel Mercado</a> Sent a memo.<br/>\r\n");
      out.write("                      \t\t</p>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Fourth Action -->\r\n");
      out.write("                      <div class=\"desc\">\r\n");
      out.write("                      \t<div class=\"thumb\">\r\n");
      out.write("                      \t\t<span class=\"badge bg-theme\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      \t<div class=\"details\">\r\n");
      out.write("                      \t\t<p><muted>2 Minutes Ago</muted><br/>\r\n");
      out.write("                      \t\t   <a href=\"#\">Miguel Mercado</a> Sent a memo.<br/>\r\n");
      out.write("                      \t\t</p>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <!-- Fifth Action -->\r\n");
      out.write("                      <div class=\"desc\">\r\n");
      out.write("                      \t<div class=\"thumb\">\r\n");
      out.write("                      \t\t<span class=\"badge bg-theme\"><i class=\"fa fa-clock-o\"></i></span>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      \t<div class=\"details\">\r\n");
      out.write("                      \t\t<p><muted>2 Minutes Ago</muted><br/>\r\n");
      out.write("                      \t\t   <a href=\"#\">Miguel Mercado</a> Sent a memo.<br/>\r\n");
      out.write("                      \t\t</p>\r\n");
      out.write("                      \t</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <!-- CALENDAR-->\r\n");
      out.write("                        <div id=\"calendar\" class=\"mb\">\r\n");
      out.write("                            <div class=\"panel green-panel no-margin\">\r\n");
      out.write("                                <div class=\"panel-body\">\r\n");
      out.write("                                    <div id=\"date-popover\" class=\"popover top\" style=\"cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;\">\r\n");
      out.write("                                        <div class=\"arrow\"></div>\r\n");
      out.write("                                        <h3 class=\"popover-title\" style=\"disadding: none;\"></h3>\r\n");
      out.write("                                        <div id=\"date-popover-content\" class=\"popover-content\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"my-calendar\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><!-- / calendar -->\r\n");
      out.write("                      \r\n");
      out.write("                  </div><!-- /col-lg-3 -->\r\n");
      out.write("              </div><! --/row -->\r\n");
      out.write("          </section>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <!--main content end-->\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.sparkline.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--common script for all pages-->\r\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter/js/jquery.gritter.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/gritter-conf.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--script for this page-->\r\n");
      out.write("    <script src=\"assets/js/sparkline-chart.js\"></script>    \r\n");
      out.write("\t<script src=\"assets/js/zabuto_calendar.js\"></script>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"application/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $(\"#date-popover\").popover({html: true, trigger: \"manual\"});\r\n");
      out.write("            $(\"#date-popover\").hide();\r\n");
      out.write("            $(\"#date-popover\").click(function (e) {\r\n");
      out.write("                $(this).hide();\r\n");
      out.write("            });\r\n");
      out.write("        \r\n");
      out.write("            $(\"#my-calendar\").zabuto_calendar({\r\n");
      out.write("                action: function () {\r\n");
      out.write("                    return myDateFunction(this.id, false);\r\n");
      out.write("                },\r\n");
      out.write("                action_nav: function () {\r\n");
      out.write("                    return myNavFunction(this.id);\r\n");
      out.write("                },\r\n");
      out.write("                ajax: {\r\n");
      out.write("                    url: \"show_data.php?action=1\",\r\n");
      out.write("                    modal: true\r\n");
      out.write("                },\r\n");
      out.write("                legend: [\r\n");
      out.write("                    {type: \"text\", label: \"Special event\", badge: \"00\"},\r\n");
      out.write("                    {type: \"block\", label: \"Regular event\", }\r\n");
      out.write("                ]\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        function myNavFunction(id) {\r\n");
      out.write("            $(\"#date-popover\").hide();\r\n");
      out.write("            var nav = $(\"#\" + id).data(\"navigation\");\r\n");
      out.write("            var to = $(\"#\" + id).data(\"to\");\r\n");
      out.write("            console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login['role'] == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("             ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<html> \n");
        out.write("      \n");
        out.write("      <!-- **********************************************************************************************************************************************************\n");
        out.write("      MAIN SIDEBAR MENU\n");
        out.write("      *********************************************************************************************************************************************************** -->\n");
        out.write("      <!--sidebar start-->\n");
        out.write("      <aside>\n");
        out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
        out.write("              <!-- sidebar menu start-->\n");
        out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
        out.write("              \n");
        out.write("              \t  <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-woah.png\" class=\"img-circle\" width=\"60\"></a></p>\n");
        out.write("              \t  <h5 class=\"centered\">Miguel Mercado</h5>\n");
        out.write("\t\t\t\t   <h5 class=\"centered\">Client</h5>\n");
        out.write("              \t  \t\n");
        out.write("                  \n");
        out.write("\t\t\t\t   <li class=\"sub-menu\">\n");
        out.write("                      <a href=\"javascript:;\" class = \"active\">\n");
        out.write("                          <i class=\"fa fa-user\"></i>\n");
        out.write("                          <span>Client Screens</span>\n");
        out.write("                      </a>\n");
        out.write("                      <ul class=\"sub\">\n");
        out.write("\t\t\t\t\t  <li>\n");
        out.write("                      <a href=\"ClientHomepage.html\" >\n");
        out.write("                          <i class=\"fa fa-home\"></i>\n");
        out.write("                          <span>Homepage</span>\n");
        out.write("                      </a>\n");
        out.write("                  </li>\n");
        out.write("                          <li>\n");
        out.write("\t\t\t\t\t\t\t  <a  href=\"ToSalesOrder\">\n");
        out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t<span>New Sales Order</span>\n");
        out.write("\t\t\t\t\t\t\t  </a>\n");
        out.write("\t\t\t\t\t\t  </li>\n");
        out.write("                           <li>\n");
        out.write("\t\t\t\t\t\t  <a  href=\"ToList\">\n");
        out.write("\t\t\t\t\t\t  <i class=\"fa fa-file-o\"></i>\n");
        out.write("\t\t\t\t\t\t\t<span>My Purchase Order List</span>\n");
        out.write("\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t\t\t<li>\n");
        out.write("                      <a href=\"MyDeliverySchedule.html\">\n");
        out.write("                          <i class=\"fa fa-calendar\"></i>\n");
        out.write("                          <span>My Delivery Schedule</span>\n");
        out.write("                      </a>\n");
        out.write("                  </li>\n");
        out.write("                      </ul>\n");
        out.write("                  </li>\n");
        out.write("                  </aside>\n");
        out.write("              </html>");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login['role'] == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("             ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("     <!-- **********************************************************************************************************************************************************\n");
        out.write("      MAIN SIDEBAR MENU\n");
        out.write("      *********************************************************************************************************************************************************** -->\n");
        out.write("      <!--sidebar start-->\n");
        out.write("      <aside>\n");
        out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
        out.write("              <!-- sidebar menu start-->\n");
        out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
        out.write("              \n");
        out.write("              \t<p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-woah.png\" class=\"img-circle\" width=\"60\"></a></p>\n");
        out.write("              \t  <h5 class=\"centered\">Miguel Mercado</h5>\n");
        out.write("                  <h5 class=\"centered\">Client</h5>\n");
        out.write("              \t  \t\n");
        out.write("                  <li class=\"mt\">\n");
        out.write("                      <a class=\"active\" href=\"index.html\">\n");
        out.write("                          <i class=\"fa fa-barcode\"></i>\n");
        out.write("                          <span>Add Product</span>\n");
        out.write("                      </a>\n");
        out.write("                  </li>\n");
        out.write("\n");
        out.write("                  <li class=\"sub-menu\">\n");
        out.write("                      <a href=\"javascript:;\" >\n");
        out.write("                          <i class=\"fa fa-truck\"></i>\n");
        out.write("                          <span>Supplier</span>\n");
        out.write("                      </a>\n");
        out.write("                      <ul class=\"sub\">\n");
        out.write("                          <li><a  href=\"general.html\">Add Supplier</a></li>\n");
        out.write("                          <li><a  href=\"general.html\">Update Supplier List</a></li>\n");
        out.write("                      </ul>\n");
        out.write("                  </li>\n");
        out.write("\n");
        out.write("              </ul>\n");
        out.write("              <!-- sidebar menu end-->\n");
        out.write("          </div>\n");
        out.write("      </aside>\n");
        out.write("      <!--sidebar end-->\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
