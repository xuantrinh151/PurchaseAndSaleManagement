package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginAndRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/styleLogin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-page\">\n");
      out.write("            \n");
      out.write("            <div class=\"form\">\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <div class=\"alert alert-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </c:if>\n");
      out.write("                <form class=\"register-form\">\n");
      out.write("                    <input type=\"text\" placeholder=\"name\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"password\" />\n");
      out.write("                    <input type=\"text\" placeholder=\"email address\" />\n");
      out.write("                    <button>create</button>\n");
      out.write("                    <p class=\"message\">Already registered? <a href=\"#\">Sign In</a></p>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <form class=\"login-form\" action=\"login\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\" placeholder=\"username\" name=\"username\" />\n");
      out.write("                    <input type=\"password\" placeholder=\"password\" name=\"password\" />\n");
      out.write("\n");
      out.write("                    <div style=\"display: flex;\n");
      out.write("                         align-items: center;\n");
      out.write("                         margin-bottom: 15px;\">\n");
      out.write("                        <input class=\"remember\" type=\"checkbox\" value=\"remember\" name =\"remember\" style=\"    margin-bottom: 0px;\n");
      out.write("                               width: 14px;\n");
      out.write("                               margin-right: 10px;\"/> \n");
      out.write("                        <div style=\"font-size: 14px;\">Remember me</div>\n");
      out.write("                    </div>  \n");
      out.write("                    <button>login</button>\n");
      out.write("                    <p class=\"message\">Not registered? <a href=\"#\">Create an account</a></p>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $('.message a').click(function () {\n");
      out.write("                $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
