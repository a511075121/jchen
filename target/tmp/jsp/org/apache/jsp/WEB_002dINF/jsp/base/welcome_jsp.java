package org.apache.jsp.WEB_002dINF.jsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if IE 9 ]><html class=\"ie9\"><![endif]-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\r\n");
      out.write("        <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"description\" content=\"Violate Responsive Admin Template\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"Super Admin, Admin, Template, Bootstrap\">\r\n");
      out.write("\r\n");
      out.write("        <title>管理系统 | 欢迎页面</title>\r\n");
      out.write("            \r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link href=\"../../../assert/global/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/form.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/calendar.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/icons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/generics.css\" rel=\"stylesheet\"> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"skin-blur-violate\">\r\n");
      out.write("\r\n");
      out.write("        <header id=\"header\" class=\"media\">\r\n");
      out.write("            <a href=\"\" id=\"menu-toggle\"></a> \r\n");
      out.write("            <a class=\"logo pull-left\" href=\"#\">管理系统</a>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"media-body\">\r\n");
      out.write("                <div class=\"media\" id=\"top-menu\">\r\n");
      out.write("                    <!-- <div class=\"pull-left tm-icon\">\r\n");
      out.write("                        <a data-drawer=\"messages\" class=\"drawer-toggle\" href=\"\">\r\n");
      out.write("                            <i class=\"sa-top-message\"></i>\r\n");
      out.write("                            <i class=\"n-count animated\">5</i>\r\n");
      out.write("                            <span>信息</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pull-left tm-icon\">\r\n");
      out.write("                        <a data-drawer=\"notifications\" class=\"drawer-toggle\" href=\"\">\r\n");
      out.write("                            <i class=\"sa-top-updates\"></i>\r\n");
      out.write("                            <i class=\"n-count animated\">9</i>\r\n");
      out.write("                            <span>Updates</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    <div id=\"time\" class=\"pull-right\">\r\n");
      out.write("                        <span id=\"hours\"></span>\r\n");
      out.write("                        :\r\n");
      out.write("                        <span id=\"min\"></span>\r\n");
      out.write("                        :\r\n");
      out.write("                        <span id=\"sec\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- <div class=\"media-body\">\r\n");
      out.write("                        <input type=\"text\" class=\"main-search\">\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("        \r\n");
      out.write("        <section id=\"main\" class=\"p-relative\" role=\"main\">\r\n");
      out.write("            \r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <aside id=\"sidebar\">\r\n");
      out.write("                \r\n");
      out.write("                <!-- Sidbar Widgets -->\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <!-- Side Menu -->\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/left.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </aside>\r\n");
      out.write("        \r\n");
      out.write("            <!-- Content -->\r\n");
      out.write("            <section id=\"content\" class=\"container\">\r\n");
      out.write("            \t<div>欢迎回来</div>\r\n");
      out.write("                \r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <!-- Older IE Message -->\r\n");
      out.write("            <!--[if lt IE 9]>\r\n");
      out.write("                <div class=\"ie-block\">\r\n");
      out.write("                    <h1 class=\"Ops\">Ooops!</h1>\r\n");
      out.write("                    <p>You are using an outdated version of Internet Explorer, upgrade to any of the following web browser in order to access the maximum functionality of this website. </p>\r\n");
      out.write("                    <ul class=\"browsers\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"https://www.google.com/intl/en/chrome/browser/\">\r\n");
      out.write("                                <img src=\"img/browsers/chrome.png\" alt=\"\">\r\n");
      out.write("                                <div>Google Chrome</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://www.mozilla.org/en-US/firefox/new/\">\r\n");
      out.write("                                <img src=\"img/browsers/firefox.png\" alt=\"\">\r\n");
      out.write("                                <div>Mozilla Firefox</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://www.opera.com/computer/windows\">\r\n");
      out.write("                                <img src=\"img/browsers/opera.png\" alt=\"\">\r\n");
      out.write("                                <div>Opera</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://safari.en.softonic.com/\">\r\n");
      out.write("                                <img src=\"img/browsers/safari.png\" alt=\"\">\r\n");
      out.write("                                <div>Safari</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"http://windows.microsoft.com/en-us/internet-explorer/downloads/ie-10/worldwide-languages\">\r\n");
      out.write("                                <img src=\"img/browsers/ie.png\" alt=\"\">\r\n");
      out.write("                                <div>Internet Explorer(New)</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <p>Upgrade your browser for a Safer and Faster web experience. <br/>Thank you for your patience...</p>\r\n");
      out.write("                </div>   \r\n");
      out.write("            <![endif]-->\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Javascript Libraries -->\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/jquery.min.js\"></script> <!-- jQuery Library -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/jquery-ui.min.js\"></script> <!-- jQuery UI -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/jquery.easing.1.3.js\"></script> <!-- jQuery Easing - Requirred for Lightbox + Pie Charts-->\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!--  Form Related -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/icheck.js\"></script> <!-- Custom Checkbox + Radio -->\r\n");
      out.write("\r\n");
      out.write("        <!-- UX -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/scroll.min.js\"></script> <!-- Custom Scrollbar -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Other -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/calendar.min.js\"></script> <!-- Calendar -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/feeds.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- All JS functions -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/functions.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
}
