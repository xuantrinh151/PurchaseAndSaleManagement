/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.bill;

import dal.BillDBContext;
import dal.CustomerDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;
import model.BillDetail;
import model.Customer;

/**
 *
 * @author xuant
 */
public class DetailController extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int bid = Integer.parseInt(request.getParameter("bid"));
        BillDBContext billDBContext = new BillDBContext();
        Bill b = new Bill();
        b = billDBContext.getBillById(bid);
        request.setAttribute("bill", b);
        ArrayList<BillDetail> billDetail = billDBContext.getBillDetail(bid);
        request.setAttribute("billDetail", billDetail);
        int total = billDBContext.getTotalBill(bid);
        request.setAttribute("total", total);
        
        CustomerDBContext customerDBContext = new CustomerDBContext();
        Customer customer = customerDBContext.getCustomerByBid(bid);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("bill.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    

}
