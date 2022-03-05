/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import controller.authorization.BaseAuthorizationController;
import dal.CustomerDBContext;
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
import model.Customer;
import model.Role;

/**
 *
 * @author xuant
 */
@MultipartConfig
public class EditCustomerController extends BaseAuthorizationController {

    
   

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int cId = Integer.parseInt(request.getParameter("cId"));
        CustomerDBContext cdbc = new CustomerDBContext();
        Customer customer = cdbc.getCustomer(cId);
        request.setAttribute("customer", customer);
         String message = request.getParameter("message");
        String alert = request.getParameter("alert");
        if (message != null && alert != null) {
            request.setAttribute("message", message);
            request.setAttribute("alert", alert);
        }
        request.getRequestDispatcher("/view/customer/edit.jsp").forward(request, response);
    }

    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.setCharacterEncoding("UTF-8");
        CustomerDBContext cdbc = new CustomerDBContext();
        String cId = (request.getParameter("customer_id"));
     
        String cName = request.getParameter("customer_name");
        int cPhone = Integer.parseInt(request.getParameter("customer_phone"));
        String cAddress = request.getParameter("customer_address");
        int roleId = Integer.parseInt(request.getParameter("customer_role"));
        Part file = request.getPart("image");
        String imageFileName = file.getSubmittedFileName();
        String uploadPath = "C:/Users/xuant/OneDrive/Desktop/PurchaseAndSaleManagement/web/assets/img/" + imageFileName;
        try (FileOutputStream fos = new FileOutputStream(uploadPath)) {
            InputStream is = file.getInputStream();
            byte[] data = new byte[is.available()];
            is.read(data);
            fos.write(data);
        }

        Customer customer = new Customer();
        customer.setcId(Integer.parseInt(cId));
        customer.setcName(cName);
        customer.setcSdt(cPhone);
        customer.setcAddress(cAddress);
        Role r = new Role();
        r.setrId(roleId);
        customer.setRole(r);
        customer.setcImage(imageFileName);
        cdbc.editCustomer(customer);
        response.sendRedirect("customer-list");
    }

    
}
