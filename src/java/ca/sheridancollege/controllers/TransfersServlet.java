
package ca.sheridancollege.controllers;

import ca.sheridancollege.beans.Account;
import ca.sheridancollege.dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransfersServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        DAO dao = new DAO();
       
        String fromAccountType = request.getParameter("fromAccount");
         String toAccountType = request.getParameter("toAccount");
         double amount = Double.parseDouble(request.getParameter("amount"));
        
         double updatedChequingAmount;
         double updatedSavingAmount;
         Account account = (Account)session.getAttribute("accountInfo");
         double savingAmount = account.getSavingamount(); 
         double chequingAmount = account.getChequingamount(); 
         String card = account.getCardnumber();
         
          
         System.out.println("card: " + account.getCardnumber() + " saving amount " + savingAmount + " chequing amount: " + chequingAmount );
         if(!fromAccountType.equals(toAccountType))
         {
         System.out.println("Before the method !!");
       if(fromAccountType.equals("chequing"))
       {
          
           if(account.getChequingamount()>=amount)
           {
          
          updatedChequingAmount = chequingAmount-amount;
          account.setChequingamount(updatedChequingAmount);
          account.setSavingamount(savingAmount + amount);
          
           
       }
           else
           {
           System.out.println("Please Enter valid amount!!");
           
           }
       }
    else if(fromAccountType.equals("saving"))
         {
              
            if(account.getSavingamount()>=amount)
             {
            
            updatedSavingAmount = savingAmount - amount;
            account.setSavingamount(updatedSavingAmount);
            account.setChequingamount(chequingAmount + amount);
          
   
              }
             else
             {
             
             System.out.println("Please Enter valid amount!!");}
           }
         } else
         {
         System.out.println("Please select valid account types!!");
         }
      
       session.setAttribute("accountInfo",account );
       session.setAttribute("from" ,fromAccountType );
       session.setAttribute("to" ,toAccountType );
       dao.updateAmount(card ,account.getSavingamount(), account.getChequingamount() );
       response.sendRedirect("transfermessage.jsp");
    }
          
}
