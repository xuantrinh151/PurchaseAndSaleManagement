/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.product;

import controller.authorization.BaseAuthorizationController;
import dal.ProductDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;

/**
 *
 * @author xuant
 */
public class ProductListController extends BaseAuthorizationController {

    

    
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ProductDBContext productDBContext = new ProductDBContext();
        String keyWord = request.getParameter("keyWord");
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
        {
            page = "1";
        }
        int pagesize = 6;
        int pageindex = Integer.parseInt(page);
        ArrayList<Product> products = productDBContext.getProducts(pageindex,pagesize,keyWord);
        request.setAttribute("products", products);
        request.setAttribute("keyWord", keyWord);
        int numofrecords = productDBContext.count(keyWord);
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pa1gesize", pagesize);
        request.setAttribute("pageindex", pageindex);
        request.getRequestDispatcher("/view/product/productList.jsp").forward(request, response);
    }

   
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ProductDBContext productDBContext = new ProductDBContext();
        String keyWord = request.getParameter("keyWord");
        String page = request.getParameter("page");
        if(page ==null || page.trim().length() ==0)
        {
            page = "1";
        }
        int pagesize = 6;
        int pageindex = Integer.parseInt(page);
        ArrayList<Product> products = productDBContext.getProducts(pageindex,pagesize,keyWord);
        request.setAttribute("products", products);
        request.setAttribute("keyWord", keyWord);
        int numofrecords = productDBContext.count(keyWord);
        int totalpage = (numofrecords % pagesize ==0)?(numofrecords/pagesize)
                :(numofrecords/pagesize) + 1;
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pa1gesize", pagesize);
        request.setAttribute("pageindex", pageindex);
        request.getRequestDispatcher("/view/product/productList.jsp").forward(request, response);
        
    }

    

}
