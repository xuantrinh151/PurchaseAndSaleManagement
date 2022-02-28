package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div id=\"main\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/common/header.jsp", out, false);
      out.write("\n");
      out.write("                <div id=\"body\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/common/left.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <div class=\"overview\">\n");
      out.write("                            <div class=\"hello-admin\">\n");
      out.write("                                <p>\n");
      out.write("                                    Xin Chào Nhà Vườn Phương Viên\n");
      out.write("                                </p>\n");
      out.write("                                <p >\n");
      out.write("                                    Chúc bạn một ngày tốt lành,bán được thật nhiều hàng nhé\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"overview-item totalSales\">\n");
      out.write("                                <div class=\"totalSales-img overview-item-img\">\n");
      out.write("                                    <img class=\"img-responsive\"  src=\"./assets/img/totalNumber.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"totalSales-detail overview-item-detail\">\n");
      out.write("                                    <p class=\"totalSales-title\" style=\"font-weight: 700; font-size: 18px; \">Total Sales</p>\n");
      out.write("                                    <p class=\"totalSales-quantily\"  style=\"font-size: 15px; font-weight: 600\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalSell}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("VND</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"overview-item totalCost\">\n");
      out.write("                            <div class=\"totalCost-img overview-item-img\">\n");
      out.write("                                <img class=\"img-responsive\"  src=\"./assets/img/totalCost3.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"totalCost-detail overview-item-detail\">\n");
      out.write("                                <p class=\"totalCost-title\" style=\"font-weight: 700;font-size: 18px\">Total Cost</p>\n");
      out.write("                                <p class=\"totalCost-quantily \" style=\"font-size: 15px; font-weight: 600\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalCost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"overview-item productSold\">\n");
      out.write("                            <div class=\"productSold-img overview-item-img\">\n");
      out.write("                                <img class=\"img-responsive\" src=\"./assets/img/productSold.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"productSold-detail overview-item-detail\">\n");
      out.write("                                <p class=\"productSold-title\" style=\"font-weight: 700;font-size: 18px\">Product Sold</p>\n");
      out.write("                                <p class=\"productSold-quantily\"  style=\"font-size: 15px; font-weight: 600\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productSold}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Cây</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"topThree\">\n");
      out.write("                        <div class=\"topThree-item topProduct\">\n");
      out.write("                            <p class=\"topThree-title\">Top Product</p>\n");
      out.write("                            <div class=\"topDetail\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"topThree-item topCustomer\">\n");
      out.write("                            <p class=\"topThree-title\">Top Customer</p>\n");
      out.write("                            <div class=\"topDetail\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/common/footer.jsp", out, false);
      out.write("\n");
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
          out.write(" </p>\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"topDetail-item\">\n");
          out.write("                                        <div class=\"img-topDetail\"\n");
          out.write("                                             style=\"background-image: url(./assets/img/account.png);\">\n");
          out.write("                                        </div>\n");
          out.write("                                        <p style=\"font-size: 16px;\n");
          out.write("                                           font-weight: 600;\n");
          out.write("                                           margin-bottom: 5px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.cName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <p style=\"font-size: 14px;\n");
          out.write("                                           font-weight: 500;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.amountBought}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</p>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
