/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.product;

import controller.authorization.BaseAuthorizationController;
import dal.ProductDBContext;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Product;

/**
 *
 * @author xuant
 */
@MultipartConfig
public class AddProductController extends BaseAuthorizationController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String message = request.getParameter("message");
        String alert = request.getParameter("alert");
        if (message != null && alert != null) {
            request.setAttribute("message", message);
            request.setAttribute("alert", alert);
        }
        request.getRequestDispatcher("/view/product/insert.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String pName = request.getParameter("product_name");
        int pPrice = Integer.parseInt(request.getParameter("product_price"));
        String pType = request.getParameter("product_categorie");
        Part file = request.getPart("image");
        String imageFileName = file.getSubmittedFileName();
        if (imageFileName != "") {
            String uploadPath = "C:/Users/xuant/OneDrive/Desktop/PurchaseAndSaleManagement/web/assets/img/" + imageFileName;
            try (FileOutputStream fos = new FileOutputStream(uploadPath)) {
                InputStream is = file.getInputStream();
                byte[] data = new byte[is.available()];
                is.read(data);
                fos.write(data);
            }
        }

        Product p = new Product();
        p.setpName(pName);
        p.setpPrice(pPrice);
        p.setpImage(imageFileName);
        p.setpType(pType);
        ProductDBContext pdbc = new ProductDBContext();
        int test = pdbc.addProduct(p);

        if (test != 0) {
            response.sendRedirect("product-add?message=Create Success&alert=success");
        } else {
            response.sendRedirect("product-add?message=Create Failure&alert=danger");
        }

    }

}
