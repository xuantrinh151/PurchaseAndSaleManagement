package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("    <title>Bill</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <div class=\"d-flex justify-content-center row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"p-3 bg-white rounded\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <h1 class=\"text-uppercase\">Invoice</h1>\n");
      out.write("                            <div class=\"billed\"><span class=\"font-weight-bold text-uppercase\">Billed:</span><span class=\"ml-1\">Jasper Kendrick</span></div>\n");
      out.write("                            <div class=\"billed\"><span class=\"font-weight-bold text-uppercase\">Date:</span><span class=\"ml-1\">May 13, 2020</span></div>\n");
      out.write("                            <div class=\"billed\"><span class=\"font-weight-bold text-uppercase\">Order ID:</span><span class=\"ml-1\">#1345345</span></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 text-right mt-3\">\n");
      out.write("                            <h4 class=\"text-danger mb-0\">Rae jones</h4><span>bbbootstrap.com</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mt-3\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Product</th>\n");
      out.write("                                        <th>Unit</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Custom oil painting (24 X 36 in.)</td>\n");
      out.write("                                        <td>10</td>\n");
      out.write("                                        <td>34</td>\n");
      out.write("                                        <td>340</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Digital illustraion paint(8.5 X 11 in.)</td>\n");
      out.write("                                        <td>12</td>\n");
      out.write("                                        <td>50</td>\n");
      out.write("                                        <td>600</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>Total</td>\n");
      out.write("                                        <td>940</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-right mb-3\"><button class=\"btn btn-danger btn-sm mr-5\" type=\"button\">Pay Now</button></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
