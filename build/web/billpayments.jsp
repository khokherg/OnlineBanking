<%-- 
    Document   : homepage
    Created on : 30-Dec-2017, 12:22:00 PM
    Author     : gurpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
  #main1
{
	height:30px;
        width:100%;
        background-color: #474c4b;
        margin-top:3%;
        margin-bottom:3%;
      
}
#main1  h1
{
    color:white;
    font-size:18px;
    font-weigth:bold;
    font-family:Comic Sans MS;
    padding-left:5px;
}
#fieldset
{
    height:30%;
    width:50%;
    background-color: #f5f5f0; 
    margin-bottom:5%;
}



.forms label 
{
	height:30px;
	font-family:Arial;
	font-size:19px;
	padding-left:20px;
        color:red;
	padding-left:2px;
	padding-right:10%;
}
.forms .input
{
	width: 247px;
     padding: 10px;
	margin: 15px ;
     display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
	border-radius:8px;
	font-family:Arial;
	font-size:14px;
}
.forms select
{
               width:250px;
               height:40px;
               width: 250px;
          padding: 10px;
	margin: 10px ;
     display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
	border-radius:8px;
	font-family:Arial;
	font-size:14px;
              
               font-weight:bold;
               color:red;
              
     }
.forms .button
{
	width:170px;
	height:40px;
	background:red;
	border-radius:15px;
	font-size:15px;
	font-weight:bold;
	color:#FFFFFF;
        margin-left:8%;
        margin-top:2%;
        margin-bottom:4%;
	
}

        </style>
    </head>
    <body>
              <jsp:include page="/headerfile3.jsp" />
              <div id="main1">
                  <h1>Bill Payment</h1>   
              </div>
    <center>
              <fieldset id="fieldset">
              
              <form action="BillPaymentServlet" method="post" class="forms" >
                  <label><b>From Account</b></label>&emsp;
              <select name="account">
                <option value="savingAmmount">Saving Account</option>
                <option value="chequingAmmount">Chequing Account</option>
              </select><br><br>
              <label><b>Select Payee</b></label>&emsp;&emsp;&emsp;
              <select name="payee">
                  <option value="Sheridan College">Sheridan College</option>
                <option value="Visa">Visa</option>
                <option value="Rogers">Rogers</option>
              </select><br><br>
              <label><b>Amount</b></label>
              <input type ="text" placeholder="Enter Amount" name="amount" required  class="input"><br><br>
              <label><b>Date</b></label>&emsp;&emsp;
              <input type ="date" value="2018-01-07" required class="input"><br>
              <input type="submit" value="Confirm" class="button">
              </form>
              </fieldset></center>
       <jsp:include page="/headerfile2.jsp" />
    </body>
</html>