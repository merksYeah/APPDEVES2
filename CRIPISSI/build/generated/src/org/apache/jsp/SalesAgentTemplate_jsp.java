package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SalesAgentTemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <!-- **********************************************************************************************************************************************************\n");
      out.write("      TOP BAR CONTENT & NOTIFICATIONS\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("      <!--header start-->\n");
      out.write("      <header class=\"header black-bg\">\n");
      out.write("              <div class=\"sidebar-toggle-box\">\n");
      out.write("                  <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
      out.write("              </div>\n");
      out.write("            <!--logo start-->\n");
      out.write("            <a href=\"index.html\" class=\"logo\"><b>CRIPSI</b></a>\n");
      out.write("            <!--logo end-->\n");
      out.write("            <div class=\"nav notify-row\" id=\"top_menu\">\n");
      out.write("                <!--  notification start -->\n");
      out.write("                <ul class=\"nav top-menu\">\n");
      out.write("                    <!-- settings start -->\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\n");
      out.write("                            <i class=\"fa fa-tasks\"></i>\n");
      out.write("                            <span class=\"badge bg-theme\">4</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu extended tasks-bar\">\n");
      out.write("                            <div class=\"notify-arrow notify-arrow-green\"></div>\n");
      out.write("                            <li>\n");
      out.write("                                <p class=\"green\">You have 4 pending tasks</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <div class=\"task-info\">\n");
      out.write("                                        <div class=\"desc\">DashGum Admin Panel</div>\n");
      out.write("                                        <div class=\"percent\">40%</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"progress progress-striped\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("                                            <span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <div class=\"task-info\">\n");
      out.write("                                        <div class=\"desc\">Database Update</div>\n");
      out.write("                                        <div class=\"percent\">60%</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"progress progress-striped\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <div class=\"task-info\">\n");
      out.write("                                        <div class=\"desc\">Product Development</div>\n");
      out.write("                                        <div class=\"percent\">80%</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"progress progress-striped\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                            <span class=\"sr-only\">80% Complete</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <div class=\"task-info\">\n");
      out.write("                                        <div class=\"desc\">Payments Sent</div>\n");
      out.write("                                        <div class=\"percent\">70%</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"progress progress-striped\">\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"70\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%\">\n");
      out.write("                                            <span class=\"sr-only\">70% Complete (Important)</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"external\">\n");
      out.write("                                <a href=\"#\">See All Tasks</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- settings end -->\n");
      out.write("                    <!-- inbox dropdown start-->\n");
      out.write("                    <li id=\"header_inbox_bar\" class=\"dropdown\">\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index.html#\">\n");
      out.write("                            <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                            <span class=\"badge bg-theme\">5</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu extended inbox\">\n");
      out.write("                            <div class=\"notify-arrow notify-arrow-green\"></div>\n");
      out.write("                            <li>\n");
      out.write("                                <p class=\"green\">You have 5 new messages</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-zac.jpg\"></span>\n");
      out.write("                                    <span class=\"subject\">\n");
      out.write("                                    <span class=\"from\">Zac Snider</span>\n");
      out.write("                                    <span class=\"time\">Just now</span>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"message\">\n");
      out.write("                                        Hi mate, how is everything?\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-divya.jpg\"></span>\n");
      out.write("                                    <span class=\"subject\">\n");
      out.write("                                    <span class=\"from\">Divya Manian</span>\n");
      out.write("                                    <span class=\"time\">40 mins.</span>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"message\">\n");
      out.write("                                     Hi, I need your help with this.\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-danro.jpg\"></span>\n");
      out.write("                                    <span class=\"subject\">\n");
      out.write("                                    <span class=\"from\">Dan Rogers</span>\n");
      out.write("                                    <span class=\"time\">2 hrs.</span>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"message\">\n");
      out.write("                                        Love your new Dashboard.\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">\n");
      out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"assets/img/ui-sherman.jpg\"></span>\n");
      out.write("                                    <span class=\"subject\">\n");
      out.write("                                    <span class=\"from\">Dj Sherman</span>\n");
      out.write("                                    <span class=\"time\">4 hrs.</span>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"message\">\n");
      out.write("                                        Please, answer asap.\n");
      out.write("                                    </span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"index.html#\">See all messages</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- inbox dropdown end -->\n");
      out.write("                </ul>\n");
      out.write("                <!--  notification end -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-menu\">\n");
      out.write("            \t<ul class=\"nav pull-right top-menu\">\n");
      out.write("                    <li><a class=\"logout\" href=\"login2.html\">Logout</a></li>\n");
      out.write("            \t</ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("      <!--header end-->\n");
      out.write("    <aside>\n");
      out.write("        <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("              <!-- sidebar menu start-->\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("              \n");
      out.write("              \t  <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-woah.png\" class=\"img-circle\" width=\"60\"></a></p>\n");
      out.write("              \t  <h5 class=\"centered\">Miguel Mercado</h5>\n");
      out.write("\t\t\t\t   <h5 class=\"centered\">Client</h5>\n");
      out.write("    <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" >\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Sales Agent Screens</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("\t\t\t\t\t   <li>\n");
      out.write("                      <a href=\"SalesAgentHomepage.html\">\n");
      out.write("                          <i class=\"fa fa-home\"></i>\n");
      out.write("                          <span>Homepage</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                          <li>\n");
      out.write("\t\t\t\t\t\t\t  <a  href=\"Sales Order Form.html\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>New Sales Order</span>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  </li>\n");
      out.write("                           <li>\n");
      out.write("\t\t\t\t\t\t  <a  href=\"MyPurchaseOrderList.html\">\n");
      out.write("\t\t\t\t\t\t  <i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t<span>My Purchase Order List</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t <li>\n");
      out.write("                      <a href=\"MyDeliverySchedule.html\">\n");
      out.write("                          <i class=\"fa fa-calendar\"></i>\n");
      out.write("                          <span>My Delivery Schedule</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\t\t\t\t   <li>\n");
      out.write("                      <a href=\"ClientList.html\">\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Client List</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("    </aside>\n");
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
