<%-- 
    Document   : activate
    Created on : 6-Jan-2018, 9:22:47 AM
    Author     : gurpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>

.forms h1
{
	font-size:40px;
	font-family:Comic Sans MS;
	color:red;
	padding-top:10px;
	text-align:center;
	text-shadow: 2px 2px 4px grey;
}

.forms h2
{
        padding-bottom:2%;
	padding-left:3%;
	font-size:25px; 
    
}
.forms label 
{
	height:30px;
	font-family:Arial;
	font-size:19px;
	padding-left:10px;
        color:red;
}
.forms input
{
	width: 30%;
        padding: 10px;
        margin: 15px ;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
	border-radius:8px;
	font-family:Arial;
	font-size:14px;
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
	
}

            </style>
    </head>
    <body>
              <jsp:include page="/headerfile1.jsp" />
              <center>
                  <form action="ActivateServlet" class="forms">
                     <h1>Activate Here</h1>

<label><b> Card Number</b></label>
<input type="text" placeholder="Enter Card Number" name="cname" required><br>
<label><b> First Name</b></label>
<input type="text" placeholder="Enter First Name" name="fname" required><br>
<label><b> Last Name</b></label>
<input type="text" placeholder="Enter Last Name" name="lname" required><br>
 <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pswd" required ><br>
<label><b> Date of Birth</b></label>
<input type="text" name="dob" required><br>
<label><b> Home Phone Number</b></label>
<input type="text" name="phnNumber" required><br>
<label><b> Mother's Maiden Name</b></label>
<input type="text" name="Mname" required><br>


<input type="submit" value="Activate"  class="button" >
                      </form>
                  </center>
       <jsp:include page="/headerfile2.jsp" />
    </body>
</html>
