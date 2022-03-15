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
public class BillEditController extends BaseAuthorizationController {

   
    

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String kRole = request.getParameter("kRole");
        String raw_bId = request.getParameter("bId");
        int bId = Integer.parseInt(raw_bId);
        BillDBContext bdbc = new BillDBContext();
        Bill b = bdbc.getBillById(bId);
        request.setAttribute("b", b);
         CustomerDBContext cdbc = new CustomerDBContext();
        ArrayList<Customer> customers = cdbc.getAllCustomer();
        request.setAttribute("customers", customers);
        UserDBContext udbc = new UserDBContext();
        ArrayList<User> users = udbc.getAllUser();
        request.setAttribute("kRole", kRole);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/view/bill/billEdit.jsp").forward(request, response);
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cId = request.getParameter("customer");
        String uId = request.getParameter("user");
        String date = request.getParameter("time");
        String bId = request.getParameter("bill_id");
        Date time = Date.valueOf(date);
        CustomerDBContext cdbc = new CustomerDBContext();
        Customer c = cdbc.getCustomer(Integer.parseInt(cId));
        UserDBContext udbc = new UserDBContext();
        User u = udbc.getUserById(Integer.parseInt(uId));
        
        Bill b = new Bill();
        b.setCustomer(c);
        b.setUser(u);
        b.setTime(time);
        b.setbId(Integer.parseInt(bId));
        BillDBContext bdbc = new BillDBContext();
        bdbc.editBill(b);
        response.sendRedirect("bill-list?kRole=" + c.getRole().getrId()); 
        
    }

    

}
