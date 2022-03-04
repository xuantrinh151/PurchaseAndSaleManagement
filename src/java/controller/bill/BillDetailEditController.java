/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.bill;

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
public class BillDetailEditController extends HttpServlet {

    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_pId = request.getParameter("pId");
        String raw_bId = request.getParameter("bId");
        int pId = Integer.parseInt(raw_pId);
        int bId = Integer.parseInt(raw_bId);
        request.setAttribute("bId", bId);
        request.setAttribute("pId", pId);
        ProductDBContext pdbc = new ProductDBContext();
        ArrayList<Product> products = pdbc.getAllProduct();
        request.setAttribute("products", products);
        BillDBContext bdbc = new BillDBContext();
        BillDetail bd = bdbc.getBillDetail(pId, bId);
        request.setAttribute("bd", bd);
        request.getRequestDispatcher("/view/bill/billDetailEdit.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_bdId = request.getParameter("billDetail_id");
        String raw_bId = request.getParameter("bill_id");
        String raw_pId = request.getParameter("products");
        String raw_quantity = request.getParameter("quantity");
        int pId = Integer.parseInt(raw_pId);
        int quantity = Integer.parseInt(raw_quantity);
        int bId = Integer.parseInt(raw_bId);
        int bdId = Integer.parseInt(raw_bdId);
        ProductDBContext pdbc = new ProductDBContext();
        Product p = pdbc.getProduct(pId);
        BillDetail bd = new BillDetail();
        BillDBContext bdbc = new BillDBContext();
        Bill b = bdbc.getBillById(bId);
        bd.setBill(b);
        bd.setProduct(p);
        bd.setQuantity(quantity);
        bd.setBdId(bdId);
        bdbc.editBillDetail(bd);
        response.sendRedirect("bill-detail?bid=" + bId);
    }

}
