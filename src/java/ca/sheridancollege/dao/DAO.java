/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.dao;

import ca.sheridancollege.beans.Account;
import ca.sheridancollege.beans.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gurpreet
 */
public class DAO {
    public  String userName;
    public  String password;
    public  String host;
    
    public DAO(String host, String userName, String password)
    {
        this.userName = userName;
        this.password = password;
        this.host = host;
    }
    
    public DAO()
    {
    
    }
     public  boolean  AddCustomer(Customer customer)
    {
        boolean addcust = false;
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
          
	    String database = "bankcustomer";
            try
            {
                con = DriverManager.getConnection
			(host + database, userName, password);
            
            }catch(Exception e)
            {
                con = DriverManager.getConnection
                (host, userName, password);
                Statement st = con.createStatement();
                st.executeUpdate("CREATE DATABASE " + database);
                con = DriverManager.getConnection
			(host + database, userName, password);
                
                
            }
            
            try{
            String add = "INSERT into customerlist(cardnumber, firstname, lastname, mothername, password, phoneNumber, dateofbirth  )values"
                    + "('"+customer.getCardNumber()+"','"+customer.getFirstName()+"','"+customer.getLastName()+"'"
                    + ", '"+customer.getMotherName()+"' ,'"+customer.getPassword()+"' , '"+customer.getPhnNumber()+"'"
                    + " , '"+customer.getDob()+"')";
          
            Statement st = con.createStatement();
          
            
                 st.executeUpdate(add);
                 
       String cNum  = "SELECT firstname from customerlist where cardnumber = '"+customer.getCardNumber()+"' ";
        
       ResultSet rs = st.executeQuery(cNum);
         ResultSetMetaData rsmd = rs.getMetaData();
        
        int numColumns = rsmd.getColumnCount();
        
        while(rs.next())
            //In Database first index is 1
        {
                                                                                                                                                                                    
       String fname = rs.getString("firstname");
       
       if(fname==null)
       {
       addcust = false;
       }
       else
       {
       addcust = true;
       }
           // Statement st = con.createStatement();
            //Add the new contact into the SQL table.
        }
            }catch(Exception e)
            {
               System.out.println(e);
                }
            
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
         
         return addcust;
    }
    public boolean loginVerification (String card, String password)
                 
                 {
                    
                boolean login =false;
       try
        {
            //Creating connection to our JDBC Drive
        Class.forName("com.mysql.jdbc.Driver");
        
        //Connection to SQL Server
        //Databae,, user, password
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bankcustomer","root", "Gurpreet896$");
        
        
        Statement st  = con.createStatement();
          String Query  = "SELECT cardnumber, password from customerlist";
              
         ResultSet rs = st.executeQuery(Query);
         ResultSetMetaData rsmd = rs.getMetaData();
        
        int numColumns = rsmd.getColumnCount();
        
        while(rs.next())
            //In Database first index is 1
        {
                                                                                                                                                                                    
       String cNumber = rs.getString("cardnumber");
       String pswd = rs.getString("password");
       if(cNumber.equals(card) && pswd.equals(password))
       {
       login = true;
       }
        }
      
        }catch(Exception e )
                {
                
                System.out.println(e);
                }
   
    return login;
   
   
                 }
    public Account getAccountInfo(String cardNum)
    {
    
        
       Account account =  new Account();
        
        try
          {
            
           
            Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bankcustomer","root", "Gurpreet896$");
        
        
        Statement st  = con.createStatement();
                 
        String Query  = "SELECT * from accountInfo where cardnumber = '"+cardNum+"'";
              
        ResultSet rs = st.executeQuery(Query);
        
        
        ResultSetMetaData rsmd = rs.getMetaData();
        
        int numColumns = rsmd.getColumnCount();
        
        while(rs.next())
           
        {
        
        account = new Account(rs.getString(1),Double.parseDouble(rs.getString(2)), Double.parseDouble(rs.getString(3))
                ,Double.parseDouble(rs.getString(4)));
       
       // System.out.println(account.toString());
        }
            
            
            con.close();

                    
        }catch(Exception e)
        {
            System.out.println(e);
        }
     return account;
    }
    
    public void updateAmount(String cardnumber, double samount, double camount)
    {
    try
        {
            //Creating connection to our JDBC Drive
        Class.forName("com.mysql.jdbc.Driver");
        
        //Connection to SQL Server
        //Databae,, user, password
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bankcustomer","root", "Gurpreet896$");
        
        
        Statement st  = con.createStatement();
          String setAmount  = "UPDATE accountInfo SET savingAmmount = "+samount+", chequingAmmount = "+camount+""
                  + "where cardnumber = '"+cardnumber+"'";
              
         st.executeUpdate(setAmount);
     
      con.close();
        }catch(Exception e )
                {
                
                System.out.println(e);
                }
   
    
    }
    
    public void payBill(String card, String account, double amount)
            
    {
     try
        {
            //Creating connection to our JDBC Drive
        Class.forName("com.mysql.jdbc.Driver");
        
        //Connection to SQL Server
        //Databae,, user, password
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bankcustomer","root", "Gurpreet896$");
        
        
        Statement st  = con.createStatement();
          String setAmount  = "UPDATE accountInfo SET  "+account+" = "+amount+" where cardnumber = '"+card+"'";
              
         st.executeUpdate(setAmount);
     
      con.close();
        }catch(Exception e )
                {
                
                System.out.println(e);
                }
   
    
    }
}
