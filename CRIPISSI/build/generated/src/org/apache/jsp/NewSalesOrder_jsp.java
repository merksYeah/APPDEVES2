package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class NewSalesOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/security.jsp");
    _jspx_dependants.add("/LoadTemplate.jsp");
    _jspx_dependants.add("/ClientTemplate.jsp");
    _jspx_dependants.add("/PlantManagerTemplate.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

        String currentApp = "/SearchUser";

      out.write('\n');
      out.write('\n');

//    String login = (String) session.getAttribute("login");
//    if (login == null || !login.equals("true")){
//        response.sendRedirect("login.jsp");
//        return;
//    } 
    
    HashMap<String,String> rights = (HashMap<String,String>) session.getAttribute("login");
    if (rights == null || rights.get(currentApp) == null || !rights.get(currentApp).equals("TRUE")){
        response.sendRedirect("indexx.jsp");
        return;
    }

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
      out.write("\t\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!--external css-->\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!--external css-->\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/jquery-ui-1.11.4.custom/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/DataTables-1.10.6/media/css/jquery.dataTables.min.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <section id=\"container\" >\n");
      out.write("     ");
      out.write("\n");
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
      out.write("                    <li><a class=\"logout\" href=\"Logout\">Logout</a></li>\n");
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
      out.write("\n");
      out.write("      \n");
      out.write("      <!-- **********************************************************************************************************************************************************\n");
      out.write("      MAIN CONTENT\n");
      out.write("      *********************************************************************************************************************************************************** -->\n");
      out.write("      <!--main content start-->\n");
      out.write("      <section id=\"main-content\">\n");
      out.write("          <section class=\"wrapper\">\n");
      out.write("          \t<h3><i class=\"fa fa-angle-right\"></i> New Purchase Order</h3>\n");
      out.write("          \t\n");
      out.write("          \t<!-- BASIC FORM ELELEMNTS -->\n");
      out.write("          \t<div class=\"row mt\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                  <div class=\"form-panel\">\n");
      out.write("                  \t  <h4 class=\"mb\"><i class=\"fa fa-angle-right\"></i> Order Information</h4>\n");
      out.write("                          <form action = \"CreateSalesOrder\" class=\"form-horizontal style-form\" method=\"post\"> <div class =\"form-group\" >\n");
      out.write("                                <label class=\"col-lg-2 col-sm-2 control-label\">Customer TIN</label>\n");
      out.write("                                <div class = col-lg-2>\n");
      out.write("                                    <input name = \"customertin\" type=\"text\" id=\"disabledInput\" class=\"form-control\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" rows=\"1\"  readonly>\n");
      out.write("                                 \n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                          <div class=\"form-group\">\n");
      out.write("                              <label class=\"col-lg-2 col-sm-2 control-label\">Deliver To</label>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <select name =\"address\" class=\"form-control\" required>\n");
      out.write("                                    \n");
      out.write("                                          <option value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write('"');
      out.write('>');
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("                                    \n");
      out.write("                                  </select>\n");
      out.write("                                </div>\n");
      out.write("                          </div>\n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("\t\t\t\t<label class=\"col-lg-2 col-sm-2 control-label\">Terms</label>\n");
      out.write("                                    <div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("                                            <input required type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"option1\"> Cash-On-Delivery\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("                                            <input required type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\"> In Terms\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class =\"form-group\" >\n");
      out.write("                                <label class=\"col-lg-2 col-sm-2 control-label\">Delivery Date</label>\n");
      out.write("                                <div class = col-lg-2>\n");
      out.write("                                    <input  name =\"orderdate\" id = \"datepicker\" type = \"input\" class=\"form-control\" rows=\"1\"  required>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                            <div class =\"form-group\" >\n");
      out.write("                                <label class=\"col-lg-2 col-sm-2 control-label\">Comments</label>\n");
      out.write("                                <div class = col-lg-6>\n");
      out.write("                                    <input   type = \"input\" class=\"form-control\" rows=\"1\">\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <h4 class=\"mb\"><i class=\"fa fa-angle-right\"></i> Products to Order</h4>\n");
      out.write("\t\t\t\t\t\t<table id = \"what\"class=\"table table-bordered table-striped table-condensed\">\n");
      out.write("                                                        <hr>\n");
      out.write("                                                            <thead>\n");
      out.write("                                                                <tr>\n");
      out.write("                                                                    <th></th>\n");
      out.write("                                                                    <th></th>\n");
      out.write("                                                                    <th><i class=\"fa fa-barcode\"></i> ProductCode</th>\n");
      out.write("                                                                    <th class=\"hidden-phone\"><i class=\"fa fa-question-circle\"></i> Product Name</th>\n");
      out.write("                                                                    <th class=\"hidden-phone\"><i class=\"fa fa-question-circle\"></i> Package Type</th>\n");
      out.write("                                                                    <th class=\"hidden-phone\"><i class=\"fa fa-question-circle\"></i> Net Weight</th>\n");
      out.write("                                                                    <th><i class=\"fa fa-bookmark\"></i> Quantity In Stock</th>\n");
      out.write("                                                                    <th><i class=\" fa fa-edit\"></i> Unit Price</th>\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                          <div class =\"form-group\" >\n");
      out.write("                                            <div class=\"col-lg-12\">\n");
      out.write("                                                <input type = \"submit\" class=\"btn btn-theme center-block\">\n");
      out.write("                                             </div>\n");
      out.write("                                        </div>\n");
      out.write("                            </form>\n");
      out.write("                            </div>\t   \n");
      out.write("                    </div>\n");
      out.write("                    </div><!-- col-lg-12-->      \n");
      out.write("                    </div><!-- /row -->\n");
      out.write("\t\t</section><! --/wrapper -->\n");
      out.write("      </section><!-- /MAIN CONTENT -->\n");
      out.write("\n");
      out.write("      <!--main content end-->\n");
      out.write("      \n");
      out.write("  </section>\n");
      out.write("    <script src=\"assets/js/jquery.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-ui-1.9.2.custom.min.js\"></script>\t   \n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--common script for all pages-->\n");
      out.write("    <script src=\"assets/js/common-scripts.js\"></script>\n");
      out.write("    <script src=\"assets/DataTables-1.10.6/media/js/jquery.dataTables.min.js\"></script>\n");
      out.write("            \n");
      out.write(" <script>\n");
      out.write("        $(document).ready( function () {\n");
      out.write("    $('#what').DataTable({\n");
      out.write("      \n");
      out.write("        \"scrollCollapse\": true,\n");
      out.write("        \"jQueryUI\":       false\n");
      out.write("    });\n");
      out.write("    } );\n");
      out.write("    </script>\n");
      out.write("\t\n");
      out.write("\t<!--custom tagsinput-->\n");
      out.write("\t<script src=\"assets/js/jquery.tagsinput.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!--custom checkbox & radio-->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"assets/js/bootstrap-inputmask/bootstrap-inputmask.min.js\"></script>\n");
      out.write("\t\n");
      out.write("  <script>\n");
      out.write("  $(document).ready(function() {\n");
      out.write("    $('#datepicker').datepicker({\n");
      out.write("\t\tminDate: 0,\t\t\t\t\t\t\n");
      out.write("        beforeShowDay: noSunday\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      function noSunday(date){\n");
      out.write("          var day = date.getDay();\n");
      out.write("                      return [(day > 0 && day < 6), ''];\n");
      out.write("      }; \n");
      out.write("\t\n");
      out.write("  });\n");
      out.write("  </script>\t\n");
      out.write("\t<script src=\"assets/js/form-component.js\"></script>    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.customerTin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.companyAddress}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Customer.companyAddress}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    <tr>\n");
          out.write("                                                                        <td><input type=\"checkbox\" name=\"checkedRows\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"var input = document.getElementById('");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("'); if(this.checked){ input.disabled = false; input.focus();}else{input.disabled=true;}\"></td>\n");
          out.write("                                                                        <td><input type=\"number\" name=\"orderquantity\" id = \"");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\"disabled/></td>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td> \n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                                                        <td>");
          if (_jspx_meth_c_out_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>    \n");
          out.write("                                                                    </tr>\n");
          out.write("                                                                ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productCode}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.packageType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.netweight}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.MSRP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }
}
