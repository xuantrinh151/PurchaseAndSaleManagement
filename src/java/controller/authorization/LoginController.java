/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.authorization;

import dal.UserDBContext;
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author xuant
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("login")) {
            String message = request.getParameter("message");
            String alert = request.getParameter("alert");
            if (message != null && alert != null) {
                request.setAttribute("message", message);
                request.setAttribute("alert", alert);
            }
            request.getRequestDispatcher("loginAndRegister.jsp").forward(request, response);
        }else if(action != null && action.equals("logout")){
            request.getSession().removeAttribute("user");
            response.sendRedirect("home");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        UserDBContext userDBContext = new UserDBContext();
        User user = userDBContext.getUser(userName, passWord);

        if (user != null) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("home");
        } else {
            response.sendRedirect("login?action=login&message=Username or Password is invalid&alert=danger");
        }
    }

}
