/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import controller.authorization.BaseAuthorizationController;
import dal.CustomerDBContext;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;

/**
 *
 * @author xuant
 */
public class CustomerListController extends BaseAuthorizationController {

    
    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String keyWord = request.getParameter("keyWord");
        CustomerDBContext cdbc = new CustomerDBContext();
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
        {
            page = "1";
        }
        int pagesize = 6;
        int pageindex = Integer.parseInt(page);
        ArrayList<Customer> customers = cdbc.getCustomers(pageindex,pagesize,keyWord);
        request.setAttribute("customers", customers);
        
        int numofrecords = cdbc.count(keyWord);
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pa1gesize", pagesize);
        request.setAttribute("pageindex", pageindex);
        request.getRequestDispatcher("/view/customer/customerList.jsp").forward(request, response);
    }

    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }


}
