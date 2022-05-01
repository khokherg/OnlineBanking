
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

/**
 *
 * @author gurpreet
 */
public class BillPaymentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String accountName = request.getParameter("account");
        double amount = Double.parseDouble(request.getParameter("amount"));
        double updatedAmount =0;
        DAO dao = new DAO();
       Account ac=  (Account)session.getAttribute("accountInfo");
        if(accountName.equals("savingAmmount"))
        {
         updatedAmount = ac.getSavingamount()-amount;
        ac.setSavingamount(updatedAmount);
        }
        else if(accountName.equals("chequingAmmount"))
        {
            System.out.println("chequing amount " + ac.getChequingamount());
         updatedAmount = ac.getChequingamount()- amount;
        ac.setChequingamount(updatedAmount);
        }
        
        dao.payBill(ac.getCardnumber(), accountName, updatedAmount);
   
        response.sendRedirect("homepage.jsp");
    }

  

}
