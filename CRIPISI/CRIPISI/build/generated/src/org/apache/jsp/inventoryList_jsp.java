package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.*;

public final class inventoryList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Template.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Dashboard\">\n");
      out.write("    <meta name=\"keyword\" content=\"Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\n");
      out.write("\n");
      out.write("    <title>CRIPSI</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!--external css-->\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        \n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("\t<style>\n");
      out.write("\t\t#add{margin-left:600px;}\n");
      out.write("\t</style>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <section id=\"container\" >\n");
      out.write("      ");
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
      out.write("\n");
      out.write("  \n");
      out.write("\t  \n");
      out.write("      <!-- **********************************************************************************************************************************************************\n");
      out.write("      MAIN CONTENT\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("        <section id=\"main-content\">\n");
      out.write("          <section class=\"wrapper\">\n");
      out.write("          \t<h2><i class=\"fa fa-angle-right\"></i> Inventory List</h3>\n");
      out.write("          \t\n");
      out.write("          \t<!-- BASIC FORM ELELEMNTS -->\n");
      out.write("          \t<div class=\"row mt\">\n");
      out.write("          \t\t<div class=\"col-lg-12\">\n");
      out.write("                  <div class=\"form-panel\">\n");
      out.write("\t\t\t\t  \n");
      out.write("                  \t  <h4 class=\"mb\"><i class=\"fa fa-angle-right\"></i> Inventory</h4>\n");
      out.write("\t\t\t\t\t    <!--div class=\"input-group custom-search-form col-md-2\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type=\"button\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                            </div-->\n");
      out.write("                        <div class=\"row mt\">\n");
      out.write("                  <div class=\"col-md-12\">\n");
      out.write("                      <div class=\"content-panel\">\n");
      out.write("                          <form action =\"Search\" method = \"post\"><div class=\"input-group custom-search-form col-md-2\">\n");
      out.write("                                \n");
      out.write("                                             \n");
      out.write("                                  <input type=\"text\" class=\"form-control\" placeholder=\"Search...\" name = \"productname\" >\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-default\" type =\"submit\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                            </div></form>\n");
      out.write("\t                  \t  \t  <table class=\"table table-bordered table-striped table-condensed\">\n");
      out.write("\t                  \t  \t  <h4><i class=\"fa fa-angle-right\"></i> Products</h4>\n");
      out.write("                                          \n");
      out.write("                                          \n");
      out.write("\t                  \t  \t  <hr>\n");
      out.write("                              <thead>\n");
      out.write("                              <tr>\n");
      out.write("                                  <th><i class=\"fa fa-barcode\"></i> Product ID</th>\n");
      out.write("                                  <th class=\"hidden-phone\"><i class=\"fa fa-question-circle\"></i> Product Name</th>\n");
      out.write("                                  <th><i class=\"fa fa-bookmark\"></i> Package</th>\n");
      out.write("                                  <th><i class=\" fa fa-edit\"></i> Net Weight</th>\n");
      out.write("\t\t\t\t\t\t\t\t  <th><i class=\" fa fa-edit\"></i> Quantity</th>\n");
      out.write("\t\t\t\t\t\t\t\t  <th><i class=\" fa fa-edit\"></i> Edit</th>\n");
      out.write("                                  <th></th>\n");
      out.write("                              </tr>\n");
      out.write("                              </thead>\n");
      out.write("                              <tbody>\n");
      out.write("                          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                          </table>      \n");
      out.write("\t\t\t\t\t\t  \n");
      out.write("                      </div><!-- /content-panel -->\n");
      out.write("\t\t\t\t\t \n");
      out.write("                  </div><!-- /col-md-12 -->\n");
      out.write("\t\t\t\t  \n");
      out.write("              </div><!-- /row ->\t\t\t   \n");
      out.write("                  </div>\n");
      out.write("          \t\t</div><!-- col-lg-12-->      \t\n");
      out.write("          \t</div><!-- /row -->\n");
      out.write("\t \n");
      out.write("      </section><!-- /MAIN CONTENT -->\n");
      out.write("\n");
      out.write("      <!--main content end-->\n");
      out.write("     \n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("    <!-- js placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-ui-1.9.2.custom.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--common script for all pages-->\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\n");
      out.write("\n");
      out.write("    <!--script for this page-->\n");
      out.write("    \n");
      out.write("  <script>\n");
      out.write("      //custom select box\n");
      out.write("\n");
      out.write("      $(function(){\n");
      out.write("          $('select.styled').customSelect();\n");
      out.write("      });\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
          out.write("\n");
          out.write("                                  <tr>\n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                      <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                      <td>\n");
          out.write("                                      <button class=\"btn btn-primary btn-xs\"><i class=\"fa fa-pencil\"></i></button>\n");
          out.write("                                  </td>\n");
          out.write("                                      \n");
          out.write("                                  </tr>\n");
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.packageType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.netweight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
