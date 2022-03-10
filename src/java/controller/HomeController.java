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
import model.Product;


/**
 *
 * @author xuant
 */
public class HomeController extends HttpServlet {

    
 
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String timeProduct = request.getParameter("timeProduct");
        String timeCustomer = request.getParameter("timeCustomer");
        BillDBContext billDBContext = new BillDBContext();
        BigDecimal totalSell = billDBContext.getTotalSells();
        BigDecimal totalCost = billDBContext.getTotalCost();
        request.setAttribute("totalSell", totalSell);
        request.setAttribute("totalCost", totalCost);
         request.setAttribute("timeProduct", timeProduct);
         request.setAttribute("timeCustomer", timeCustomer);
        ProductDBContext productDBContext = new ProductDBContext();
        int productSold = productDBContext.getProductSold();
        ArrayList<Product> products = productDBContext.getTopThreeProduct(timeProduct);
        request.setAttribute("products", products);
        request.setAttribute("productSold", productSold);
        
        CustomerDBContext customerDBContext = new CustomerDBContext();
        ArrayList<Customer> customers = customerDBContext.getTopThreeCustomer(timeCustomer);
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }
    

}
