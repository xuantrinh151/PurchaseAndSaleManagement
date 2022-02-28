package org.apache.jsp.view.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <title>Table</title>\n");
      out.write("        ");
      dal.ProductDBContext product = null;
      synchronized (request) {
        product = (dal.ProductDBContext) _jspx_page_context.getAttribute("product", PageContext.REQUEST_SCOPE);
        if (product == null){
          product = new dal.ProductDBContext();
          _jspx_page_context.setAttribute("product", product, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div id=\"main\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\n");
      out.write("                <div id=\"body\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/left.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"right\">\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\" style=\"    margin-top: 160px;\n");
      out.write("                              margin-left: 70px;\" action=\"product-add\" method=\"POST\">\n");
      out.write("                            <fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"product_name\">PRODUCT NAME</label>  \n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input id=\"product_name\" name=\"product_name\" placeholder=\"PRODUCT NAME\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Text input-->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"stock_alert\">PRICE</label>  \n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input id=\"stock_alert\" name=\"stock_alert\" placeholder=\"PRICE\" class=\"form-control input-md\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Select Basic -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"product_categorie\">PRODUCT CATEGORY</label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <label class=\"radio-inline\"><input type=\"radio\" name=\"gender\" value=\"Xuất\" checked>Xuất</label>\n");
      out.write("                                        <label class=\"radio-inline\"><input type=\"radio\" name=\"gender\" value=\"Nhập\">Nhập</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- File Button --> \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4 control-label\" for=\"filebutton\">IMAGE</label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input id=\"filebutton\" name=\"filebutton\" class=\"input-file\" type=\"file\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Button -->\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label  class=\"col-md-4 control-label\" for=\"singlebutton\"></label>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        \n");
      out.write("                                        <button id=\"singlebutton\" name=\"singlebutton\" class=\"btn btn-primary\">AddProduct</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
}
