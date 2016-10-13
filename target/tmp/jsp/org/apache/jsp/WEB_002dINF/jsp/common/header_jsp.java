package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"side-widgets overflow\">\r\n");
      out.write("\t<!-- Profile Menu -->\r\n");
      out.write("\t<div class=\"text-center s-widget m-b-25 dropdown\" id=\"profile-menu\">\r\n");
      out.write("\t\t<a href=\"\" data-toggle=\"dropdown\"> <img\r\n");
      out.write("\t\t\tclass=\"profile-pic animated\" src=\"../../../assert/global/img/profile-pic.jpg\" alt=\"\">\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<ul class=\"dropdown-menu profile-menu\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">个人资料</a> <i class=\"icon left\">&#61903;</i><i\r\n");
      out.write("\t\t\t\tclass=\"icon right\">&#61815;</i></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">设置</a> <i class=\"icon left\">&#61903;</i><i\r\n");
      out.write("\t\t\t\tclass=\"icon right\">&#61815;</i></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">注销</a> <i class=\"icon left\">&#61903;</i><i\r\n");
      out.write("\t\t\t\tclass=\"icon right\">&#61815;</i></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h4 class=\"m-0\">805222441</h4>\r\n");
      out.write("\t\t@qq.com\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Calendar -->\r\n");
      out.write("\t<div class=\"s-widget m-b-25\">\r\n");
      out.write("\t\t<div id=\"sidebar-calendar\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
