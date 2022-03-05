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

/**
 *
 * @author xuant
 */
public class BillDetailDeleteController extends BaseAuthorizationController {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int bdId = Integer.parseInt(request.getParameter("bdId"));
        int bId = Integer.parseInt(request.getParameter("bId"));
        BillDBContext bdbc = new BillDBContext();
        bdbc.deleteBillDetail(bdId);
        response.sendRedirect("bill-detail?bid="+bId);
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    

}
