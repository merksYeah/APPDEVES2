package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inventoryList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/LoadTemplate.jsp");
    _jspx_dependants.add("/ClientTemplate.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("    <title>CRIPSI</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        \r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.datatables.net/1.10.6/css/jquery.dataTables.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t#add{margin-left:600px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("  <section id=\"container\" >\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t  \r\n");
      out.write("      <!-- **********************************************************************************************************************************************************\r\n");
      out.write("      MAIN CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("        <section id=\"main-content\">\r\n");
      out.write("          <section class=\"wrapper\">\r\n");
      out.write("          \t<h2><i class=\"fa fa-angle-right\"></i> Inventory List</h3>\r\n");
      out.write("          \t\r\n");
      out.write("          \t<!-- BASIC FORM ELELEMNTS -->\r\n");
      out.write("          \t<div class=\"row mt\">\r\n");
      out.write("          \t\t<div class=\"col-lg-12\">\r\n");
      out.write("                  <div class=\"form-panel\">\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("                  \t  <h4 class=\"mb\"><i class=\"fa fa-angle-right\"></i> Inventory</h4>\r\n");
      out.write("\t\t\t\t\t    <!--div class=\"input-group custom-search-form col-md-2\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </div-->\r\n");
      out.write("                        <div class=\"row mt\">\r\n");
      out.write("                          \r\n");
      out.write("                  <div class=\"col-md-12\">\r\n");
      out.write("                      <div class=\"content-panel\">\r\n");
      out.write("                          <form action =\"Search\" method = \"post\"><div class=\"input-group custom-search-form col-md-2\">\r\n");
      out.write("                                \r\n");
      out.write("                                             \r\n");
      out.write("                                  <input type=\"text\" class=\"form-control\" placeholder=\"Search...\" name = \"productname\" >\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                <button class=\"btn btn-default\" type =\"submit\">\r\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </span>\r\n");
      out.write("                            </div></form>\r\n");
      out.write("\t                  \t  \t  <table class=\"table table-bordered table-striped table-condensed\" id='what'>\r\n");
      out.write("\t                  \t  \t  <h4><i class=\"fa fa-angle-right\"></i> Products</h4>\r\n");
      out.write("                                          \r\n");
      out.write("                                          \r\n");
      out.write("\t                  \t  \t  <hr>\r\n");
      out.write("                              <thead>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                               \r\n");
      out.write("                                  <th><i class=\"fa fa-barcode\"></i> Product ID</th>\r\n");
      out.write("                                  <th class=\"hidden-phone\"><i class=\"fa fa-question-circle\"></i> Product Name</th>\r\n");
      out.write("                                  <th><i class=\"fa fa-bookmark\"></i> Package</th>\r\n");
      out.write("                                  <th><i class=\" fa fa-edit\"></i> Net Weight</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <th><i class=\" fa fa-edit\"></i> Quantity</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <th><i class=\" fa fa-edit\"></i> Edit</th>\r\n");
      out.write("                                  \r\n");
      out.write("                              </tr>\r\n");
      out.write("                              </thead>\r\n");
      out.write("                              <tbody>\r\n");
      out.write("                          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                          </table>      \r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("                      </div><!-- /content-panel -->\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("                  </div><!-- /col-md-12 -->\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("              </div><!-- /row ->\t\t\t   \r\n");
      out.write("                  </div>\r\n");
      out.write("          \t\t</div><!-- col-lg-12-->      \t\r\n");
      out.write("          \t</div><!-- /row -->\r\n");
      out.write("\t \r\n");
      out.write("      </section><!-- /MAIN CONTENT -->\r\n");
      out.write("\r\n");
      out.write("      <!--main content end-->\r\n");
      out.write("     \r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery-ui-1.9.2.custom.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.ui.touch-punch.min.js\"></script>\r\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <!--common script for all pages-->\r\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf8\" src=\"//cdn.datatables.net/1.10.6/js/jquery.dataTables.js\"></script>\r\n");
      out.write("    <!--script for this page-->\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready( function () {\r\n");
      out.write("    $('#what').DataTable();\r\n");
      out.write("    } );\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
        out.write("\r\n");
        out.write("             ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<html> \r\n");
        out.write("<!-- **********************************************************************************************************************************************************\r\n");
        out.write("      TOP BAR CONTENT & NOTIFICATIONS\r\n");
        out.write("      *********************************************************************************************************************************************************** -->\r\n");
        out.write("      <!--header start-->\r\n");
        out.write("      <header class=\"header black-bg\">\r\n");
        out.write("              <div class=\"sidebar-toggle-box\">\r\n");
        out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\r\n");
        out.write("              </div>\r\n");
        out.write("            <!--logo start-->\r\n");
        out.write("            <a href=\"index.html\" class=\"logo\"><b>CRIPSI</b></a>\r\n");
        out.write("            <!--logo end-->\r\n");
        out.write("            <div class=\"nav notify-row\" id=\"top_menu\">\r\n");
        out.write("                <!--  notification start -->\r\n");
        out.write("                <ul class=\"nav top-menu\">\r\n");
        out.write("                    <!-- settings start -->\r\n");
        out.write("                    <li class=\"dropdown\">\r\n");
        out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\r\n");
        out.write("                            <i class=\"fa fa-tasks\"></i>\r\n");
        out.write("                            <span class=\"badge bg-theme\">4</span>\r\n");
        out.write("                        </a>\r\n");
        out.write("                        <ul class=\"dropdown-menu extended tasks-bar\">\r\n");
        out.write("                            <div class=\"notify-arrow notify-arrow-green\"></div>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <p class=\"green\">You have 4 pending tasks</p>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <div class=\"task-info\">\r\n");
        out.write("                                        <div class=\"desc\">DashGum Admin Panel</div>\r\n");
        out.write("                                        <div class=\"percent\">40%</div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"progress progress-striped\">\r\n");
        out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\r\n");
        out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <div class=\"task-info\">\r\n");
        out.write("                                        <div class=\"desc\">Database Update</div>\r\n");
        out.write("                                        <div class=\"percent\">60%</div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"progress progress-striped\">\r\n");
        out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
        out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <div class=\"task-info\">\r\n");
        out.write("                                        <div class=\"desc\">Product Development</div>\r\n");
        out.write("                                        <div class=\"percent\">80%</div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"progress progress-striped\">\r\n");
        out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\r\n");
        out.write("                                            <span class=\"sr-only\">80% Complete</span>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <div class=\"task-info\">\r\n");
        out.write("                                        <div class=\"desc\">Payments Sent</div>\r\n");
        out.write("                                        <div class=\"percent\">70%</div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                    <div class=\"progress progress-striped\">\r\n");
        out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"70\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%\">\r\n");
        out.write("                                            <span class=\"sr-only\">70% Complete (Important)</span>\r\n");
        out.write("                                        </div>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li class=\"external\">\r\n");
        out.write("                                <a href=\"#\">See All Tasks</a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("                    <!-- settings end -->\r\n");
        out.write("                    <!-- inbox dropdown start-->\r\n");
        out.write("                    <li id=\"header_inbox_bar\" class=\"dropdown\">\r\n");
        out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\r\n");
        out.write("                            <i class=\"fa fa-envelope-o\"></i>\r\n");
        out.write("                            <span class=\"badge bg-theme\">5</span>\r\n");
        out.write("                        </a>\r\n");
        out.write("                        <ul class=\"dropdown-menu extended inbox\">\r\n");
        out.write("                            <div class=\"notify-arrow notify-arrow-green\"></div>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <p class=\"green\">You have 5 new messages</p>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-zac.jpg\"></span>\r\n");
        out.write("                                    <span class=\"subject\">\r\n");
        out.write("                                    <span class=\"from\">Zac Snider</span>\r\n");
        out.write("                                    <span class=\"time\">Just now</span>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                    <span class=\"message\">\r\n");
        out.write("                                        Hi mate, how is everything?\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-divya.jpg\"></span>\r\n");
        out.write("                                    <span class=\"subject\">\r\n");
        out.write("                                    <span class=\"from\">Divya Manian</span>\r\n");
        out.write("                                    <span class=\"time\">40 mins.</span>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                    <span class=\"message\">\r\n");
        out.write("                                     Hi, I need your help with this.\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-danro.jpg\"></span>\r\n");
        out.write("                                    <span class=\"subject\">\r\n");
        out.write("                                    <span class=\"from\">Dan Rogers</span>\r\n");
        out.write("                                    <span class=\"time\">2 hrs.</span>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                    <span class=\"message\">\r\n");
        out.write("                                        Love your new Dashboard.\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">\r\n");
        out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-sherman.jpg\"></span>\r\n");
        out.write("                                    <span class=\"subject\">\r\n");
        out.write("                                    <span class=\"from\">Dj Sherman</span>\r\n");
        out.write("                                    <span class=\"time\">4 hrs.</span>\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                    <span class=\"message\">\r\n");
        out.write("                                        Please, answer asap.\r\n");
        out.write("                                    </span>\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                            <li>\r\n");
        out.write("                                <a href=\"index.html#\">See all messages</a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("                    <!-- inbox dropdown end -->\r\n");
        out.write("                </ul>\r\n");
        out.write("                <!--  notification end -->\r\n");
        out.write("            </div>\r\n");
        out.write("            <div class=\"top-menu\">\r\n");
        out.write("            \t<ul class=\"nav pull-right top-menu\">\r\n");
        out.write("                    <li><a class=\"logout\" href=\"login2.html\">Logout</a></li>\r\n");
        out.write("            \t</ul>\r\n");
        out.write("            </div>\r\n");
        out.write("        </header>\r\n");
        out.write("      <!--header end-->\r\n");
        out.write("      \r\n");
        out.write("      <!-- **********************************************************************************************************************************************************\r\n");
        out.write("      MAIN SIDEBAR MENU\r\n");
        out.write("      *********************************************************************************************************************************************************** -->\r\n");
        out.write("      <!--sidebar start-->\r\n");
        out.write("      <aside>\r\n");
        out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
        out.write("              <!-- sidebar menu start-->\r\n");
        out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\r\n");
        out.write("              \r\n");
        out.write("              \t  <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-woah.png\" class=\"img-circle\" width=\"60\"></a></p>\r\n");
        out.write("              \t  <h5 class=\"centered\">Miguel Mercado</h5>\r\n");
        out.write("\t\t\t\t   <h5 class=\"centered\">Client</h5>\r\n");
        out.write("              \t  \t\r\n");
        out.write("                  \r\n");
        out.write("\t\t\t\t   <li class=\"sub-menu\">\r\n");
        out.write("                      <a href=\"javascript:;\" class = \"active\">\r\n");
        out.write("                          <i class=\"fa fa-user\"></i>\r\n");
        out.write("                          <span>Client Screens</span>\r\n");
        out.write("                      </a>\r\n");
        out.write("                      <ul class=\"sub\">\r\n");
        out.write("\t\t\t\t\t  <li>\r\n");
        out.write("                      <a href=\"ClientHomepage.html\" >\r\n");
        out.write("                          <i class=\"fa fa-home\"></i>\r\n");
        out.write("                          <span>Homepage</span>\r\n");
        out.write("                      </a>\r\n");
        out.write("                  </li>\r\n");
        out.write("                          <li>\r\n");
        out.write("\t\t\t\t\t\t\t  <a  href=\"ToSalesOrder\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\r\n");
        out.write("\t\t\t\t\t\t\t\t<span>New Sales Order</span>\r\n");
        out.write("\t\t\t\t\t\t\t  </a>\r\n");
        out.write("\t\t\t\t\t\t  </li>\r\n");
        out.write("                           <li>\r\n");
        out.write("\t\t\t\t\t\t  <a  href=\"ToList\">\r\n");
        out.write("\t\t\t\t\t\t  <i class=\"fa fa-file-o\"></i>\r\n");
        out.write("\t\t\t\t\t\t\t<span>My Purchase Order List</span>\r\n");
        out.write("\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t<li>\r\n");
        out.write("                      <a href=\"MyDeliverySchedule.html\">\r\n");
        out.write("                          <i class=\"fa fa-calendar\"></i>\r\n");
        out.write("                          <span>My Delivery Schedule</span>\r\n");
        out.write("                      </a>\r\n");
        out.write("                  </li>\r\n");
        out.write("                      </ul>\r\n");
        out.write("                  </li>\r\n");
        out.write("                  </aside>\r\n");
        out.write("              </html>");
        out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                             \r\n");
          out.write("                                  <tr>\r\n");
          out.write("                                        <a href=\"Search?productCode=");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\">WHAT</a> \r\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \r\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \r\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \r\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \r\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \r\n");
          out.write("                                      <td>\r\n");
          out.write("                                      <button class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i></button>\r\n");
          out.write("                                  </td>\r\n");
          out.write("                                      \r\n");
          out.write("                                  </tr>\r\n");
          out.write("                              ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productCode}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productCode}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.packageType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.netweight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }
}
