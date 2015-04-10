package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <!-- **********************************************************************************************************************************************************\n");
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
      out.write("    \n");
      out.write("       <!-- **********************************************************************************************************************************************************\n");
      out.write("      MAIN SIDEBAR MENU\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("      <!--sidebar start-->\n");
      out.write("       <aside>\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("              <!-- sidebar menu start-->\n");
      out.write("              <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("              \n");
      out.write("              \t  <p class=\"centered\"><a href=\"profile.html\"><img src=\"assets/img/ui-woah.png\" class=\"img-circle\" width=\"60\"></a></p>\n");
      out.write("              \t  <h5 class=\"centered\">Miguel Mercado<br> PLANT MANAGER</h5>\n");
      out.write("              \t  <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Client Screens</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("\t\t\t\t\t  <li>\n");
      out.write("                      <a href=\"ClientHomepage.html\">\n");
      out.write("                          <i class=\"fa fa-home\"></i>\n");
      out.write("                          <span>Homepage</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\n");
      out.write("                          <li>\n");
      out.write("\t\t\t\t\t\t\t  <a  href=\"NewPurchaseOrder.html\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>New Purchase Order</span>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  </li>\n");
      out.write("                           <li>\n");
      out.write("\t\t\t\t\t\t  <a  href=\"MyPurchaseOrderList.html\">\n");
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
      out.write("\t\t\t\t    <li class=\"sub-menu\">\n");
      out.write("                      <a href=\"javascript:;\" class = \"active\">\n");
      out.write("                          <i class=\"fa fa-user\"></i>\n");
      out.write("                          <span>Plant Manager Screens</span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"sub\">\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t  <li>\n");
      out.write("                      <a  href=\"plant manager homepage.html\">\n");
      out.write("                          <i class=\"fa fa-home\"></i>\n");
      out.write("                          <span>Homepage</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\t\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t  <a  href=\"sales order filters.html\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Sales Order</span>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t\t   <li>\n");
      out.write("\t\t\t\t\t\t\t  <a  href=\"req slip.html\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>New Requisition Slip</span>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t <li>\n");
      out.write("                      <a href=\"PreLoadInventory\">\n");
      out.write("                         <i class=\"glyphicon glyphicon-list-alt\"></i>\n");
      out.write("                          <span>Inventory List</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\t\n");
      out.write("\t\t\t\t     \n");
      out.write("\t\t\t\t   <li class=\"mt3\">\n");
      out.write("                      <a href=\"delivery schedule.html\">\n");
      out.write("                          <i class=\"glyphicon glyphicon-calendar\"></i>\n");
      out.write("                          <span>Delivery Schedule</span>\n");
      out.write("                      </a>\n");
      out.write("                  </li>\t\n");
      out.write("\t\t\t\t  <li>\n");
      out.write("\t\t\t\t\t\t\t  <a href=\"generate report.html\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Monthly Inventory</span>\n");
      out.write("\t\t\t\t\t\t\t  </a>\n");
      out.write("\t\t\t\t\t\t  </li>\n");
      out.write("               \n");
      out.write("                      </ul>\n");
      out.write("                  </li> \n");
      out.write("\t\t\t\t   <li class=\"sub-menu\">\n");
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
      out.write("\t\t\t\t  \n");
      out.write("                 \n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("              <!-- sidebar menu end-->\n");
      out.write("          </div>\n");
      out.write("      </aside>\n");
      out.write("      <!--sidebar end-->\n");
      out.write("   \n");
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
