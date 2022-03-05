/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.bill;

import controller.authorization.BaseAuthorizationController;
import dal.BillDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;

/**
 *
 * @author xuant
 */
public class BillDeleteController extends BaseAuthorizationController {

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int bId = Integer.parseInt(request.getParameter("bId"));
        BillDBContext bdbc =new BillDBContext();
        Bill b = bdbc.getBillById(bId);
        bdbc.deleteBill(bId);
        response.sendRedirect("bill-list?kRole=" + b.getCustomer().getRole().getrId());
    }

    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
