/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authorization;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author xuant
 */
public abstract class BaseAuthorizationController extends HttpServlet {
    
    private static final String[] requiredURLs = {
            "edit", "add", "delete"
    };
    
     private boolean isLoginRequired(HttpServletRequest request) {
         String url = request.getServletPath();
         for (String requiredURL : requiredURLs) {
             if (url.contains(requiredURL)) {
                return true;
            }
         }
        return false;
    }
    
    public boolean isAuth(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return false;
        } else {
            
            if(user.getRole().getrId()==1 ){
                return true;
            }
            else {
                if(isLoginRequired(request)){
                   return false;
                }
            }
        }
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (isAuth(request)) {
            //business
            processGet(request, response);
        } else {
            response.sendRedirect("login?action=login&message=Not Permission&alert=danger");
        }
    }

    protected abstract void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;

    protected abstract void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (isAuth(request)) {
            //business
            processPost(request, response);
        } else {
            response.sendRedirect("login?action=login&message=Not Permission&alert=danger");
        }
    }

}
