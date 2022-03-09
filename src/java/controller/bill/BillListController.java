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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;

/**
 *
 * @author xuant
 */
public class BillListController extends BaseAuthorizationController {

    
    

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String keyWord = request.getParameter("keyWord");
        int kRole = Integer.parseInt(request.getParameter("kRole"));
        request.setAttribute("kRole", kRole);
        BillDBContext bdbc = new BillDBContext();
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
        {
            page = "1";
        }
        int pagesize = 6;
        int pageindex = Integer.parseInt(page);
        ArrayList<Bill> bills = bdbc.getBills(pageindex, pagesize, kRole,keyWord);
        request.setAttribute("bills", bills);
        int numofrecords = bdbc.count(kRole,keyWord);
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pa1gesize", pagesize);
        request.setAttribute("pageindex", pageindex);
         request.setAttribute("keyWord", keyWord);
        request.getRequestDispatcher("/view/bill/billList.jsp").forward(request, response);
    }

    
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String keyWord = request.getParameter("keyWord");
        int kRole = Integer.parseInt(request.getParameter("kRole"));
        request.setAttribute("kRole", kRole);
        BillDBContext bdbc = new BillDBContext();
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
        {
            page = "1";
        }
        int pagesize = 6;
        int pageindex = Integer.parseInt(page);
        ArrayList<Bill> bills = bdbc.getBills(pageindex, pagesize, kRole,keyWord);
        request.setAttribute("bills", bills);
         request.setAttribute("keyWord", keyWord);
        int numofrecords = bdbc.count(kRole,keyWord);
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pa1gesize", pagesize);
        request.setAttribute("pageindex", pageindex);
        
        request.getRequestDispatcher("/view/bill/billList.jsp").forward(request, response);
    }

    

    

}
