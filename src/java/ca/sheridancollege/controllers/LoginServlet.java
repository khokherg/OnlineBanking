/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controllers;

import ca.sheridancollege.beans.Account;
import ca.sheridancollege.dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String cardNumber = request.getParameter("cardnumber");
        String password  = request.getParameter("pswd");
        
          String host = getServletContext().getInitParameter("host");
        String user = getServletContext().getInitParameter("username");
      String pass = getServletContext().getInitParameter("password");
      
      
      
      DAO dao = new DAO(host, user, pass);
         
        boolean login = dao.loginVerification(cardNumber, password);
        Account ac1 = dao.getAccountInfo(cardNumber);
        
       session.setAttribute("accountInfo", ac1);
       
        if(login == true)
        {
        response.sendRedirect("homepage.jsp");
        }
        else  if(login == false)
        {
         response.sendRedirect("login.jsp");
        
        }
        
         
         
    }

    
   

}
