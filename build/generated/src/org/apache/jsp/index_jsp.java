package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Management</title>\n");
      out.write("        ");
      dal.ProductDBContext a = null;
      synchronized (request) {
        a = (dal.ProductDBContext) _jspx_page_context.getAttribute("a", PageContext.REQUEST_SCOPE);
        if (a == null){
          a = new dal.ProductDBContext();
          _jspx_page_context.setAttribute("a", a, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        \n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <div class=\"header-logo\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"./assets/img/logoheader.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-info\">\n");
      out.write("                        <h1 class=\"shopName\">Nhà Vườn Phương Viên</h1>\n");
      out.write("                        <h2 class=\"address\">Địa chỉ : Xuân Quan ,Văn Giang ,Hưng Yên</h2>\n");
      out.write("                        <h2 class=\"phoneNumber\">SDT: 0327051618</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"account\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"body\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <div class=\"management management-overview\">\n");
      out.write("                            <a class=\"changePage\" href=\"index.jsp\"> <i class=\"fas fa-street-view\"></i></a>\n");
      out.write("\n");
      out.write("                            <p>Tổng quan</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"management management-sell\">\n");
      out.write("                            <a class=\"changePage\" href=\"tableSell.jsp\"><i class=\"fab fa-sellsy\"></i></a>\n");
      out.write("\n");
      out.write("                            <p>Quản lý bán hàng</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"management management-import\"><i class=\"fas fa-file-import\"></i>\n");
      out.write("                            <p>Quản lý nhập hàng</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"management management-listProduct\"><i class=\"fab fa-product-hunt\"></i>\n");
      out.write("                            <p>Danh sách mặt hàng</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"management management-listCustomer\"><i class=\"fas fa-user-tie\"></i>\n");
      out.write("                            <p>Danh sách khách hàng</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <div class=\"overview\">\n");
      out.write("                            <div class=\"hello-admin\">\n");
      out.write("                                <p>\n");
      out.write("                                    Hello Nhà Vườn Phương Viên\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    Chúc bạn một ngày tốt lành,bán được thật nhiều hàng nhé\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"overview-item totalSales\">\n");
      out.write("                                <div class=\"totalSales-img overview-item-img\">\n");
      out.write("                                    <img class=\"img-responsive\"  src=\"./assets/img/totalNumber.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"totalSales-detail overview-item-detail\">\n");
      out.write("                                    <p class=\"totalSales-title\" style=\"font-weight: 700;\">Total Sales</p>\n");
      out.write("                                    <p class=\"totalSales-quantily\">Number</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"overview-item totalCost\">\n");
      out.write("                                <div class=\"totalCost-img overview-item-img\">\n");
      out.write("                                    <img class=\"img-responsive\"  src=\"./assets/img/totalCost3.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"totalCost-detail overview-item-detail\">\n");
      out.write("                                    <p class=\"totalCost-title\" style=\"font-weight: 700;\">Total Cost</p>\n");
      out.write("                                    <p class=\"totalCost-quantily\">Number</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"overview-item productSold\">\n");
      out.write("                                <div class=\"productSold-img overview-item-img\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"./assets/img/productSold.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"productSold-detail overview-item-detail\">\n");
      out.write("                                    <p class=\"productSold-title\" style=\"font-weight: 700;\">Product Sold</p>\n");
      out.write("                                    <p class=\"productSold-quantily\">Number</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"topThree\">\n");
      out.write("                            <div class=\"topThree-item topProduct\">\n");
      out.write("                                <p class=\"topThree-title\">Top Product</p>\n");
      out.write("                                <div class=\"topDetail\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"topThree-item topCustomer\">\n");
      out.write("                            <p class=\"topThree-title\">Top Customer</p>\n");
      out.write("                            <div class=\"topDetail\">\n");
      out.write("                                <div class=\"topDetail-item\">\n");
      out.write("                                    <div class=\"img-topDetail\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>Name</p>\n");
      out.write("                                    <p>Số lượng</p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"topDetail-item\">\n");
      out.write("                                    <div class=\"img-topDetail\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>Name</p>\n");
      out.write("                                    <p>Số lượng</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"topDetail-item\">\n");
      out.write("                                    <div class=\"img-topDetail\">\n");
      out.write("                                        <img class=\"img-responsive\" src=\"./assets/img/account.png\" alt=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <p>Name</p>\n");
      out.write("                                    <p>Số lượng</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"text-center center-block\">\n");
      out.write("                    <br />\n");
      out.write("                    <a href=\"https://www.facebook.com/bootsnipp\"><i id=\"social-fb\"\n");
      out.write("                                                                    class=\"fa fa-facebook-square fa-3x social\"></i></a>\n");
      out.write("                    <a href=\"https://twitter.com/bootsnipp\"><i id=\"social-tw\"\n");
      out.write("                                                               class=\"fa fa-twitter-square fa-3x social\"></i></a>\n");
      out.write("                    <a href=\"https://plus.google.com/+Bootsnipp-page\"><i id=\"social-gp\"\n");
      out.write("                                                                         class=\"fa fa-google-plus-square fa-3x social\"></i></a>\n");
      out.write("                    <a href=\"mailto:bootsnipp@gmail.com\"><i id=\"social-em\"\n");
      out.write("                                                            class=\"fa fa-envelope-square fa-3x social\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.topThreeProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"topDetail-item\">\n");
          out.write("                                        <div class=\"img-topDetail\" \n");
          out.write("                                             style=\"background-image: url(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.pImage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\">\n");
          out.write("                                        </div>\n");
          out.write("                                        <p class=\"topDetail-item-name\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <p class=\"topDetail-item-quantitySell\">Số Lượng: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantitySell}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
