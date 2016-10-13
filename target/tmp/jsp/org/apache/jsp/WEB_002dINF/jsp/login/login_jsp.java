package org.apache.jsp.WEB_002dINF.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Super Admin Responsive Template</title>\r\n");
      out.write("            \r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link href=\"../../../assert/global/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/form.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../../assert/global/css/generics.css\" rel=\"stylesheet\"> \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("        \t.red{\r\n");
      out.write("        \t\tcolor:red;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t.margin-top-10{\r\n");
      out.write("        \t\tmargin-top:10px;\r\n");
      out.write("        \t}\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"skin-blur-violate\">\r\n");
      out.write("        <section id=\"login\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <h1>管理系统</h1>\r\n");
      out.write("                <p>鹅，鹅，鹅，曲项向天歌。白毛浮绿水，红掌拨清波。</p>\r\n");
      out.write("            </header>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"clearfix\"></div>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Login -->\r\n");
      out.write("            <form class=\"box tile animated active\" id=\"box-login\" action=\"/login\" method=\"post\">\r\n");
      out.write("                <h2 class=\"m-t-0 m-b-15\">登录帐号</h2>\r\n");
      out.write("                <input type=\"text\" class=\"login-control m-b-10\" placeholder=\"请输入用户名\" name=\"username\">\r\n");
      out.write("                <input type=\"password\" class=\"login-control\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("                <input type=\"text\" class=\"login-control m-b-10 margin-top-10\" placeholder=\"请输入验证码\" name=\"image\">\r\n");
      out.write("                <img src=\"/login/image\" id=\"code\" onclick=\"reloadcode()\" style=\"cursor: pointer; margin-top: 15px;\" alt=\"看不清楚,换一张\" name=\"看不清楚,换一张\" />\r\n");
      out.write("\t\t\t\t<p class=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fail }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <button class=\"btn btn-sm m-r-5\">登录</button>\r\n");
      out.write("                \r\n");
      out.write("                <!-- <small>\r\n");
      out.write("                    <a class=\"box-switcher\" data-switch=\"box-register\" href=\"\">Don't have an Account?</a> or\r\n");
      out.write("                    <a class=\"box-switcher\" data-switch=\"box-reset\" href=\"\">Forgot Password?</a>\r\n");
      out.write("                </small> -->\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("            <!-- Register -->\r\n");
      out.write("            <!-- <form class=\"box animated tile\" id=\"box-register\">\r\n");
      out.write("                <h2 class=\"m-t-0 m-b-15\">Register</h2>\r\n");
      out.write("                <input type=\"text\" class=\"login-control m-b-10\" placeholder=\"Full Name\">\r\n");
      out.write("                <input type=\"text\" class=\"login-control m-b-10\" placeholder=\"Username\">\r\n");
      out.write("                <input type=\"email\" class=\"login-control m-b-10\" placeholder=\"Email Address\">    \r\n");
      out.write("                <input type=\"password\" class=\"login-control m-b-10\" placeholder=\"Password\">\r\n");
      out.write("                <input type=\"password\" class=\"login-control m-b-20\" placeholder=\"Confirm Password\">\r\n");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-sm m-r-5\">Register</button>\r\n");
      out.write("\r\n");
      out.write("                <small><a class=\"box-switcher\" data-switch=\"box-login\" href=\"\">Already have an Account?</a></small>\r\n");
      out.write("            </form> -->\r\n");
      out.write("            \r\n");
      out.write("            <!-- Forgot Password -->\r\n");
      out.write("            <!-- <form class=\"box animated tile\" id=\"box-reset\">\r\n");
      out.write("                <h2 class=\"m-t-0 m-b-15\">Reset Password</h2>\r\n");
      out.write("                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla eu risus. Curabitur commodo lorem fringilla enim feugiat commodo sed ac lacus.</p>\r\n");
      out.write("                <input type=\"email\" class=\"login-control m-b-20\" placeholder=\"Email Address\">    \r\n");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-sm m-r-5\">Reset Password</button>\r\n");
      out.write("\r\n");
      out.write("                <small><a class=\"box-switcher\" data-switch=\"box-login\" href=\"\">Already have an Account?</a></small>\r\n");
      out.write("            </form> -->\r\n");
      out.write("        </section>                      \r\n");
      out.write("        \r\n");
      out.write("        <!-- Javascript Libraries -->\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/jquery.min.js\"></script> <!-- jQuery Library -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/bootstrap.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!--  Form Related -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/icheck.js\"></script> <!-- Custom Checkbox + Radio -->\r\n");
      out.write("        \r\n");
      out.write("        <!-- All JS functions -->\r\n");
      out.write("        <script src=\"../../../assert/global/js/functions.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction reloadcode() {\r\n");
      out.write("\t\t\t\tvar verify = document.getElementById('code');\r\n");
      out.write("\t\t\t\tverify.setAttribute('src', '/login/image/'\r\n");
      out.write("\t\t\t\t\t\t+ parseInt(Math.random() * 100000));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
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
