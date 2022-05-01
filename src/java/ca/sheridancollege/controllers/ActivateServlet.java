/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controllers;

import javax.swing.JOptionPane;
import ca.sheridancollege.beans.Customer;
import ca.sheridancollege.dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ActivateServlet extends HttpServlet {

 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
   String cardNumber = request.getParameter("cname");
    String firstName = request.getParameter("fname");
     String lastName = request.getParameter("lname");
      String dateofbirth = request.getParameter("dob");
       String password = request.getParameter("pswd");
        String pNumber = request.getParameter("phnNumber");
         String motherName = request.getParameter("Mname");
         
         Customer customer = new Customer(cardNumber, firstName, lastName,motherName , password, pNumber,dateofbirth );
         
               String host = getServletContext().getInitParameter("host");
      String user = getServletContext().getInitParameter("username");
      String pass = getServletContext().getInitParameter("password");
      
      
      DAO dao = new DAO(host, user, pass);
         
         
         boolean add = dao.AddCustomer(customer);
        if(add)
         {
        // System.out.println("Customer is added!!");
              //JOptionPane.showMessageDialog(null, "You have activated", "InfoBox: " + "blah blah!", JOptionPane.INFORMATION_MESSAGE);
           response.sendRedirect("login.jsp");
         }
         else
         {
         // System.out.println("Customer is not added!!");
             
              PrintWriter out = response.getWriter();  
            response.setContentType("text/html");  
             out.println("<script type=\"text/javascript\">");  
           out.println("alert('You do not have account with us OR You have already activted online banking!');");  
           out.println("</script>");
           //response.sendRedirect("login.jsp");
         }
         System.out.println(customer.toString());
       
         
    
        
         
    }

}
