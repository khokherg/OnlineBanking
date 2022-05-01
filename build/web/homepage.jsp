<%-- 
    Document   : homepage
    Created on : 30-Dec-2017, 12:22:00 PM
    Author     : gurpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
#banking 
{
  height:200px;
width:100%;  
 margin-left:5%;
 margin-right: 5%;
}

#visa
{
  height:auto;
width:100%;  
 margin-left:5%;
  margin-right: 5%;
}
#main1 , #main2
{
	height:30px;
        width:100%;
        background-color: #474c4b;
        margin-top:10px;
        
      
}

#main1  h1 , #main2  h1 
{
    color:white;
    font-size:18px;
    font-weigth:bold;
    font-family:Comic Sans MS;
    padding-left:5px;
   
}



#main3 , #main5 , #main7
{
	height:100px;
        width:50%;
        float:left;
}
#main4 , #main6 , #main8
{
	height:100px;
        width:50%;
        float:right;
        text-align:center;
}


h4
{
    
}
        </style>
    </head>
    <body>
              <jsp:include page="/headerfile3.jsp" />
              
              
                  
              <div id="main1"> 
                  <h1>Banking</h1> 
                  </div>
              <div id="banking">
              <div id="main3">
                 <h2>Chequing Account</h2>
                 <c:out value='${accountInfo.cardnumber}'></c:out>
                         
                         
                       </div>
              <div id="main4">
                  <h2>Amount</h2>
                  <c:out value='${accountInfo.chequingamount}'></c:out>
                         
                         
                       
              </div>
                
                  <div id="hr"><hr></div>
             
                <div id="main5">
                 <h2>Savings Account<h2>
                        
                         <c:out value='${accountInfo.cardnumber}'></c:out>
                       </div>
              <div id="main6">
                  <h2>Amount</h2>
                   <c:out value='${accountInfo.savingamount}'></c:out>
                       
                         
              </div>
               
              </div>
              <div id="main2"> 
                 <h1>Borrowing</h1> 
                 </div>
              <div id="visa">
                  
                      <div id="main7">
                 <h2>Scene Visa Account<h2>
                         <h4>Card number</h4>
                       </div>
              <div id="main8">
                          <h3>Amount</h3>
                          <c:out value='${accountInfo.visaamount}'></c:out>
                       
                         
              </div>
              </div>
              
                          
                  
                  <%-- <hr>
                  <p>
                  <h2>Savings Account<h2>
                          <h3>ammount</h3>
                          </p>
                  <h4>cardnumber</h4>
                  </div>
             
              <div id="main2"> 
                 <h1>Borrowing</h1> 
                 </div>
              <h2>Visa Card<h2>
                  <p>ammount</p>
                  <h3>cardnumber</h3> --%>
             
       <jsp:include page="/headerfile2.jsp" />
    </body>
</html>