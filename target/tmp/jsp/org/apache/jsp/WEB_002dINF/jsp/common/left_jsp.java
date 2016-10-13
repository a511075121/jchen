package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<ul class=\"list-unstyled side-menu\">\r\n");
      out.write("\t<li class=\"active\"><a class=\"sa-side-home\" href=\"#\">\r\n");
      out.write("\t\t\t<span class=\"menu-item\">主页</span>\r\n");
      out.write("\t</a></li>\r\n");
      out.write("\t<li class=\"dropdown\"><a class=\"sa-side-form\" href=\"#\"> <span\r\n");
      out.write("\t\t\tclass=\"menu-item\">现场购买</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\t<ul class=\"list-unstyled menu-item\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">购买列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li class=\"dropdown\"><a class=\"sa-side-typography\" href=\"#\"> <span\r\n");
      out.write("\t\t\tclass=\"menu-item\">网上购买</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\t<ul class=\"list-unstyled menu-item\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">订单列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">客户购买清单列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li class=\"dropdown\"><a class=\"sa-side-ui\" href=\"#\"> <span\r\n");
      out.write("\t\t\tclass=\"menu-item\">基础信息</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\t<ul class=\"list-unstyled menu-item\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">批次列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">商品列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">商品sku列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">商品货源列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">员工列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">客户列表</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li class=\"dropdown\"><a class=\"sa-side-page\" href=\"#\"> <span\r\n");
      out.write("\t\t\tclass=\"menu-item\">系统设置</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\t\t<ul class=\"list-unstyled menu-item\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">用户列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">角色列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">资源列表</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">系统日志</a></li>\r\n");
      out.write("\t\t</ul></li>\r\n");
      out.write("\t<li>\r\n");
      out.write("        <a class=\"sa-side-table\" href=\"#\">\r\n");
      out.write("            <span class=\"menu-item\">数据统计</span>\r\n");
      out.write("   \t \t</a>\r\n");
      out.write("    </li>\r\n");
      out.write("</ul>");
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
