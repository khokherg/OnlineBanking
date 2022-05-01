<%-- 
    Document   : viewtransfermessage
    Created on : 31-Dec-2017, 4:12:09 PM
    Author     : gurpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="WEB-INF/tlds/taglib.tld" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dear Customer!</h1>
        <form action="homepage.jsp">
    <c:MoneyTransfer from='${from}' to='${to}'> The money has been successfully transferred from </c:MoneyTransfer>
    <input type="submit" value="Ok">
    </form>
        
    </body>
</html>
