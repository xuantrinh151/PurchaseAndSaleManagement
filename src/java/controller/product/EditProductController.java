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
public class EditProductController extends BaseAuthorizationController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int pId = Integer.parseInt(request.getParameter("pId"));
        ProductDBContext pdbc = new ProductDBContext();
        Product product = pdbc.getProduct(pId);
        request.setAttribute("product", product);
        
        request.getRequestDispatcher("/view/product/edit.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int pId = Integer.parseInt(request.getParameter("product_id"));
        String pName = request.getParameter("product_name");
        int pPrice = Integer.parseInt(request.getParameter("product_price"));
        String pType = request.getParameter("product_categorie");
        Part file = request.getPart("image");
        ProductDBContext pdbc = new ProductDBContext();
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
        
        Product p = pdbc.getProduct(pId);
        p.setpId(pId);
        p.setpName(pName);
        p.setpPrice(pPrice);
        if (imageFileName != "") {
            p.setpImage(imageFileName);
        }

        p.setpType(pType);

        pdbc.editProduct(p);
        response.sendRedirect("product-list");

    }

}
