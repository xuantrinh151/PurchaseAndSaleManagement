package org.apache.jsp.view.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/css/styleTableSell.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/fonts/fontawesome-free-5.15.4-web/css/all.min.css\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("                <div id=\"body\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"right\">\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"right-header\">\n");
      out.write("                                    <h4>List of products</h4>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-add\">Add Product</button>\n");
      out.write("                                </div>\n");
      out.write("                                <form>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <div class=\"inputSearch col-xs-3\">\n");
      out.write("                                            <label for=\"ex1\">Search:</label>\n");
      out.write("                                            <input class=\"form-control\" id=\"ex1\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <table id=\"mytable\" class=\"table table-bordred table-striped\">\n");
      out.write("\n");
      out.write("                                        <thead>\n");
      out.write("                                        <th>Mã Sản Phẩm</th>\n");
      out.write("                                        <th>Tên Sản Phẩm</th>\n");
      out.write("                                        <th>Giá</th>\n");
      out.write("                                        <th>Loại</th>\n");
      out.write("                                        \n");
      out.write("                                        <th>Edit</th>\n");
      out.write("\n");
      out.write("                                        <th>Delete</th>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                                <ul class=\"pagination pull-right\">\n");
      out.write("                                    <li class=\"disabled\"><a href=\"#\"><span\n");
      out.write("                                                class=\"glyphicon glyphicon-chevron-left\"></span></a></li>\n");
      out.write("                                    <li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("                                    <li><a href=\"#\">2</a></li>\n");
      out.write("                                    <li><a href=\"#\">3</a></li>\n");
      out.write("                                    <li><a href=\"#\">4</a></li>\n");
      out.write("                                    <li><a href=\"#\">5</a></li>\n");
      out.write("                                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-chevron-right\"></span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal fade\" id=\"edit\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"edit\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span\n");
      out.write("                                        class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span></button>\n");
      out.write("                                <h4 class=\"modal-title custom_align\" id=\"Heading\">Edit Your Detail</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input class=\"form-control \" type=\"text\" placeholder=\"Mohsin\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <input class=\"form-control \" type=\"text\" placeholder=\"Irshad\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <textarea rows=\"2\" class=\"form-control\"\n");
      out.write("                                              placeholder=\"CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan\"></textarea>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer \">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-warning btn-lg\" style=\"width: 100%;\"><span\n");
      out.write("                                        class=\"glyphicon glyphicon-ok-sign\"></span> Update</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.modal-content -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.modal-dialog -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"modal fade\" id=\"delete\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"edit\" aria-hidden=\"true\">\n");
      out.write("                    <div class=\"modal-dialog\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span\n");
      out.write("                                        class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span></button>\n");
      out.write("                                <h4 class=\"modal-title custom_align\" id=\"Heading\">Delete this entry</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\"><span class=\"glyphicon glyphicon-warning-sign\"></span> Are\n");
      out.write("                                    you sure you want to delete this Record?</div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer \">\n");
      out.write("                                <button type=\"button\" class=\"btn btn-success\"><span\n");
      out.write("                                        class=\"glyphicon glyphicon-ok-sign\"></span> Yes</button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\"><span\n");
      out.write("                                        class=\"glyphicon glyphicon-remove\"></span> No</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.modal-content -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.modal-dialog -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.allProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                \n");
          out.write("                                                <td>\n");
          out.write("                                                    <p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Edit\"><button\n");
          out.write("                                                            class=\"btn btn-primary btn-xs\" data-title=\"Edit\" data-toggle=\"modal\"\n");
          out.write("                                                            data-target=\"#edit\"><span\n");
          out.write("                                                                class=\"glyphicon glyphicon-pencil\"></span></button></p>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td>\n");
          out.write("                                                    <p data-placement=\"top\" data-toggle=\"tooltip\" title=\"Delete\"><button\n");
          out.write("                                                            class=\"btn btn-danger btn-xs\" data-title=\"Delete\"\n");
          out.write("                                                            data-toggle=\"modal\" data-target=\"#delete\"><span\n");
          out.write("                                                                class=\"glyphicon glyphicon-trash\"></span></button></p>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
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
