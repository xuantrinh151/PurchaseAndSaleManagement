package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==\"\n");
      out.write("        crossorigin=\"anonymous\">\n");
      out.write("    <title>Management</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div class=\"header-logo\">\n");
      out.write("                <img class=\"img-responsive\" src=\"./assets/img/logoheader.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-info\">\n");
      out.write("                <h1 class=\"shopName\">Nhà Vườn Phương Viên</h1>\n");
      out.write("                <h2 class=\"address\">Địa chỉ : Xuân Quan ,Văn Giang ,Hưng Yên</h2>\n");
      out.write("                <h2 class=\"phoneNumber\">SDT: 0327051618</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"account\">\n");
      out.write("                <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"management management-overview\"><i class=\"fas fa-street-view\"></i>\n");
      out.write("                    <p>Tổng quan</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"management management-sell\"><i class=\"fab fa-sellsy\"></i>\n");
      out.write("                    <p>Quản lý bán hàng</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"management management-import\"><i class=\"fas fa-file-import\"></i>\n");
      out.write("                    <p>Quản lý nhập hàng</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"management management-listProduct\"><i class=\"fab fa-product-hunt\"></i>\n");
      out.write("                    <p>Danh sách mặt hàng</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"management management-listCustomer\"><i class=\"fas fa-user-tie\"></i>\n");
      out.write("                    <p>Danh sách khách hàng</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"overview\">\n");
      out.write("                    <div class=\"hello-admin\">\n");
      out.write("                        <p>\n");
      out.write("                            Hello Nhà Vườn Phương Viên\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            Chúc bạn một ngày tốt lành,bán được thật nhiều hàng nhé\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overview-item totalSales\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"totalSales-img overview-item-img\">\n");
      out.write("                            <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"totalSales-detail overview-item-detail\">\n");
      out.write("                            <p class=\"totalSales-title\">Total Sales</p>\n");
      out.write("                            <p class=\"totalSales-quantily\">Number</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overview-item totalCost\">\n");
      out.write("                        <div class=\"totalCost-img overview-item-img\">\n");
      out.write("                            <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"totalCost-detail overview-item-detail\">\n");
      out.write("                            <p class=\"totalCost-title\">Total Cost</p>\n");
      out.write("                            <p class=\"totalCost-quantily\">Number</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overview-item productSold\">\n");
      out.write("                        <div class=\"productSold-img overview-item-img\">\n");
      out.write("                            <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"productSold-detail overview-item-detail\">\n");
      out.write("                            <p class=\"productSold-title\">Product Sold</p>\n");
      out.write("                            <p class=\"productSold-quantily\">Number</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"topThree\">\n");
      out.write("                    <div class=\"topThree-item topProduct\">\n");
      out.write("                        <p class=\"topThree-title\">Top Product</p>\n");
      out.write("                        <div class=\"topDetail\">\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"topThree-item topCustomer\">\n");
      out.write("                        <p class=\"topThree-title\">Top Customer</p>\n");
      out.write("                        <div class=\"topDetail\">\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"topDetail-item\">\n");
      out.write("                                <div class=\"img-topDetail\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <p>Name</p>\n");
      out.write("                                <p>Số lượng</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"text-center center-block\">\n");
      out.write("                <br />\n");
      out.write("                <a href=\"https://www.facebook.com/bootsnipp\"><i id=\"social-fb\"\n");
      out.write("                        class=\"fa fa-facebook-square fa-3x social\"></i></a>\n");
      out.write("                <a href=\"https://twitter.com/bootsnipp\"><i id=\"social-tw\"\n");
      out.write("                        class=\"fa fa-twitter-square fa-3x social\"></i></a>\n");
      out.write("                <a href=\"https://plus.google.com/+Bootsnipp-page\"><i id=\"social-gp\"\n");
      out.write("                        class=\"fa fa-google-plus-square fa-3x social\"></i></a>\n");
      out.write("                <a href=\"mailto:bootsnipp@gmail.com\"><i id=\"social-em\"\n");
      out.write("                        class=\"fa fa-envelope-square fa-3x social\"></i></a>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
