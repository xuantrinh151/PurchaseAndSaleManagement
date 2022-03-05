/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.bill;

import controller.authorization.BaseAuthorizationController;
import dal.BillDBContext;
import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;
import model.BillDetail;
import model.Product;

/**
 *
 * @author xuant
 */
public class BillDetailInsertController extends BaseAuthorizationController {

    
    

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDBContext pdbc = new ProductDBContext();
        ArrayList<Product> products = pdbc.getAllProduct();
        request.setAttribute("products", products);
        int bId = Integer.parseInt(request.getParameter("bId"));
        request.setAttribute("bId", bId);
        request.getRequestDispatcher("/view/bill/billDetailInsert.jsp").forward(request, response);
        
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_bId = request.getParameter("bill_id");
        String raw_pId = request.getParameter("products");
        String raw_quantity = request.getParameter("quantity");
        int pId = Integer.parseInt(raw_pId);
        int quantity = Integer.parseInt(raw_quantity);
        int bId = Integer.parseInt(raw_bId);
        ProductDBContext pdbc = new ProductDBContext();
        Product p = pdbc.getProduct(pId);
        BillDetail bd = new BillDetail();
        BillDBContext bdbc = new BillDBContext();
        Bill b = bdbc.getBillById(bId);
        bd.setBill(b);
        bd.setProduct(p);
        bd.setQuantity(quantity);
        bdbc.addBillDetail(bd);
        response.sendRedirect("bill-detail?bid=" + bId);
        
                
    }

    
    
}
