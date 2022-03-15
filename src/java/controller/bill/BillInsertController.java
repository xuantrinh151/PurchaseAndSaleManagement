/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.bill;

import controller.authorization.BaseAuthorizationController;
import dal.BillDBContext;
import dal.CustomerDBContext;
import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;
import model.Customer;
import model.User;

/**
 *
 * @author xuant
 */
@MultipartConfig
public class BillInsertController extends BaseAuthorizationController {

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String kRole = request.getParameter("kRole");
                
        String message = request.getParameter("message");
        String alert = request.getParameter("alert");
        if (message != null && alert != null) {
            request.setAttribute("message", message);
            request.setAttribute("alert", alert);
        }
         CustomerDBContext cdbc = new CustomerDBContext();
        ArrayList<Customer> customers = cdbc.getAllCustomer();
        request.setAttribute("customers", customers);
        UserDBContext udbc = new UserDBContext();
        ArrayList<User> users = udbc.getAllUser();
        request.setAttribute("users", users);
        request.setAttribute("kRole", kRole);
        request.getRequestDispatcher("/view/bill/billInsert.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String cId = request.getParameter("customer");
        String uId = request.getParameter("user");
        String date = request.getParameter("time");
        Date time = Date.valueOf(date);
        CustomerDBContext cdbc = new CustomerDBContext();
        Customer c = cdbc.getCustomer(Integer.parseInt(cId));
        UserDBContext udbc = new UserDBContext();
        User u = udbc.getUserById(Integer.parseInt(uId));
        
        Bill b = new Bill();
        b.setCustomer(c);
        b.setUser(u);
        b.setTime(time);
        
        BillDBContext bdbc = new BillDBContext();
        int test = bdbc.addBill(b);
        
        if(test != 0){
            response.sendRedirect("bill-detail?bid=" + test);
        }
        
        
    }
}
