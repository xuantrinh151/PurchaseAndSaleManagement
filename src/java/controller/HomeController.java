/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BillDBContext;
import dal.CustomerDBContext;
import dal.ProductDBContext;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;


/**
 *
 * @author xuant
 */
public class HomeController extends HttpServlet {

    
 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BillDBContext billDBContext = new BillDBContext();
        BigDecimal totalSell = billDBContext.getTotalSells();
        BigDecimal totalCost = billDBContext.getTotalCost();
        request.setAttribute("totalSell", totalSell);
        request.setAttribute("totalCost", totalCost);
        
        ProductDBContext productDBContext = new ProductDBContext();
        int productSold = productDBContext.getProductSold();
        request.setAttribute("productSold", productSold);
        
        CustomerDBContext customerDBContext = new CustomerDBContext();
        ArrayList<Customer> customers = customerDBContext.getTopThreeCustomer();
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    

}
