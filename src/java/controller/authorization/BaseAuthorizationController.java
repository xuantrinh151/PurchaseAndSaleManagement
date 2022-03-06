/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authorization;

import dal.UserDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
            Cookie[] cookies = request.getCookies();
            if (cookies != null) //not login , but some cookie
            {
                String userName = null;
                String passWord = null;
                for (Cookie cooky : cookies) {
                    if (cooky.getName().equals("user")) {
                        userName = cooky.getValue();
                    }
                    if (cooky.getName().equals("pass")) {
                        passWord = cooky.getValue();
                    }
                }
                if (userName == null || passWord == null) {
                    return false;
                } else {
                    UserDBContext userDBContext = new UserDBContext();
                    user = userDBContext.getUser(userName, passWord);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                        return true;
                    } else {
                        return false;
                    }
                }

            } else //not login , not cookie
            {
                return false;
            }
        } else {

            if (user.getRole().getrId() == 1) {
                return true;
            } else {
                if (isLoginRequired(request)) {
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
