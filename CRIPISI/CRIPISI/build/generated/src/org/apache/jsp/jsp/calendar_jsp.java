package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.devdaily.calendar.Month;
import java.util.*;
import util.*;
import java.io.*;
import java.sql.*;
import com.devdaily.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/calendarCommon.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

  // get the current year/month/day
  Calendar theCal = Calendar.getInstance();
  int currentYearInt  = theCal.get(Calendar.YEAR);
  int currentMonthInt = theCal.get(Calendar.MONTH);
  int currentDayInt   = theCal.get(Calendar.DATE);
  String currentYearString  = new Integer(currentYearInt).toString();
  String currentMonthString = new Integer(currentMonthInt).toString();

  // get parameters the user might have sent by clicking fwd or back
  String newMonth = request.getParameter("month");
  String newYear  = request.getParameter("year");

  // reset the month and year if necessary
  if ( newMonth != null )
  {
    currentMonthString = newMonth;
  }
  if ( newYear != null )
  {
    currentYearString = newYear;
  }

  // determine the next/previous month and year
  int intMonth = new Integer(currentMonthString).intValue();
  int intYear  = new Integer(currentYearString).intValue();

  // determine the name of the current intMonth
  String monthNames[] = {"January",
                         "February",
                         "March",
                         "April",
                         "May",
                         "June",
                         "July",
                         "August",
                         "September",
                         "October",
                         "November",
                         "December" };

  String monthName = monthNames[intMonth];

  // determine the next/previous month and year.
  // this is really only needed by calendar.jsp, but i moved it here
  // to simplify calendar.jsp.
  int nextYear = intYear;
  int prevYear = intYear;
  int prevMonth = intMonth-1;
  if ( prevMonth==-1 )
  {
    prevMonth=11;
    prevYear--;
  }
  int nextMonth = intMonth+1;
  if ( nextMonth==12 )
  {
    nextMonth = 0;
    nextYear++;
  }


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>devdaily.com calendar</title>\r\n");
      out.write("  <link rel=\"StyleSheet\" href=\"/blog/calendar.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"regular_page\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"calendar_main_div\">\r\n");
      out.write("<table border=\"1\" cellspacing=\"0\" cellpadding=\"4\" id=\"calendar_table\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"100%\" colspan=\"7\" class=\"month_year_header\">\r\n");
      out.write("      ");
      out.print(monthName);
      out.write(',');
      out.write(' ');
      out.print(intYear);
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr class=\"week_header_row\">\r\n");
      out.write("    <th width=\"14%\" class=\"th_day_cell day\">Sun</th>\r\n");
      out.write("    <th width=\"14%\" class=\"th_day_cell day\">Mon</th>\r\n");
      out.write("    <th width=\"14%\" class=\"th_day_cell day\">Tue</th>\r\n");
      out.write("    <th width=\"14%\" class=\"th_day_cell day\">Wed</th>\r\n");
      out.write("    <th width=\"14%\" class=\"th_day_cell day\">Thu</th>\r\n");
      out.write("    <th width=\"15%\" class=\"th_day_cell day\">Fri</th>\r\n");
      out.write("    <th width=\"15%\" class=\"th_day_cell day\">Sat</th>\r\n");
      out.write("  </tr>\r\n");

{
  Month aMonth = Month.getMonth( Integer.parseInt(currentMonthString), Integer.parseInt(currentYearString) );
  int [][] days = aMonth.getDays();
  for( int i=0; i<aMonth.getNumberOfWeeks(); i++ )
  {
    
      out.write("<tr class=\"week_data_row\">");

    for( int j=0; j<7; j++ )
    {
      if( days[i][j] == 0 )
      {
        
      out.write("<td class=\"empty_day_cell\">&nbsp;</td>");

      }
      else
      {
        // this is "today"
        if( currentDayInt == days[i][j] && currentMonthInt == aMonth.getMonth() && currentYearInt == aMonth.getYear() )
        {
          
      out.write("<td class=\"today_cell\">");
      out.print(days[i][j]);
      out.write("</td>");

        }
        else
        {
          
      out.write("<td class=\"day_cell\">");
      out.print(days[i][j]);
      out.write("</td>");

        }
      } // end outer if
    } // end for
    
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("  ");
}
}

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- navigation links -->\r\n");
      out.write("\r\n");
      out.write("<table id=\"calendar_nav_table\" border=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td id=\"prev_link\">\r\n");
      out.write("      <form method=\"post\">\r\n");
      out.write("        <input type=\"submit\" name=\"PREV\" value=\" << \">\r\n");
      out.write("        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(prevMonth);
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"year\" value=\"");
      out.print(prevYear);
      out.write("\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td id=\"link_to_month_view\">\r\n");
      out.write("      <form action=\"calendarMonthPrintView.jsp\" method=\"post\">\r\n");
      out.write("        <input type=\"submit\" value=\"  Full-Screen Print View  \" class=\"submit_button\">\r\n");
      out.write("        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(intMonth);
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"year\"  value=\"");
      out.print(intYear);
      out.write("\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td id=\"next_link\">\r\n");
      out.write("      <form method=\"post\">\r\n");
      out.write("        <input type=\"submit\" name=\"NEXT\" value=\" >> \">\r\n");
      out.write("        <input type=\"hidden\" name=\"month\" value=\"");
      out.print(nextMonth);
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"year\" value=\"");
      out.print(nextYear);
      out.write("\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("  <!-- navigation links end -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
}
