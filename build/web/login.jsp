<!DOCTYPE html> 
 
<html>
<head><title>Login Page</title>
    
    <style>
        

#main h1
{
	font-size:40px;
	font-family:Comic Sans MS;
	color:red;
	padding-top:10px;
	text-align:center;
	text-shadow: 2px 2px 4px grey;
}
#fieldset
{
    height:auto;
    width:80%;
    background-color: #f5f5f0; 
    margin-left:10%;
}
#fieldset .forms
{
	margin-top:2%;
	
	margin-bottom:6%;
	padding:16px;
	padding-left:20px;
	padding-right:30px;
	height:300px;
	width:950px;
      
        font-family:Arial;
	font-size:14px;
	font-weight:bold;
	line-height:10px;
	color:red;
	border:2px;
}
#form2{
    float:right;
 }


#f1
{
    height:50%;
    width: 50%;
    float:left;
}
#f2
{
    height:50%;
    width: 50%;
    float:right;
    text-align: center;
    font-size: 30px;  
}
#fieldset #form1
{
    height:auto;
    width:50%;
    float:left;
}
#fieldset #form2
{
    height:auto;
    width:50%;
    foat:right;     
}
.forms h1
{
        padding-bottom:3%;
	padding-left:15%;
	font-size:25px; 
    
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
	padding:10px;
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
	margin-left:150px;
	float:left;
	margin-top:30px;
	margin-bottom:10px;
}
.forms .button2
{
	width:170px;
	height:40px;
	background:red;
	border-radius:15px;
	font-size:15px;
	font-weight:bold;
	color:#FFFFFF;
	margin-left:165px;
	float:left;
	margin-top:30px;
	margin-bottom:20px;
}
#container
{
height:650px;
width: 850px;
position:relative;
margin:5px 250px;
margin-top:5%;
margin-bottom:1px ;
}
#leftpane
{
height:500px;
width:100px;
position:absolute;
left:0;
top:0;
}
#rightpane
{
height:500px;
width:100px;
position:absolute;
right:0;
top:0;
}
#img
{
height:400px;
width:1000px;
}
.arrow
{
font-family:Arial;
font-size:60px;
color:red;
margin:200px 280px 280px 100px;
font-weight:40px;
}

</style>
<script>
var start=0;
var arr=["card1.png","card2.jpg","card3.jpg","card4.jpg"];
var end=arr.length-1;
function show(inc)
{
var image= document.getElementById("img");
start = start+inc;
if(start<0)
{
start = end;
}
if(start>end)
{
start = 0;
}
image.src=arr[start];
}
window.setInterval(function show()
{
var image= document.getElementById("img");
start = start+1;
if(start<0)
{
start = end;
}
if(start>end)
{
start = 0;
}
image.src=arr[start];
},2000)
</script>	
</head>
<body>
    <jsp:include page="/headerfile1.jsp" />
<div id="main">
<h1>Welcome to Online Banking</h1>
</div>

<fieldset id="fieldset">
    <div id="form1">
        <form  action="LoginServlet" method="post" class="forms">
<h1>Login-in Here</h1>

<label><b>Card Number</b></label>
<input type="text" placeholder="Enter Card Number" name="cardnumber" required><br>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pswd" required ><br>

<input type="submit" value="Sign In"  class="button" >
</form>
    </div>
      <div id="form2">
            <form action="activate.jsp" method="post" class="forms">
            <h2>Activate Online & Mobile Banking</h2>
<input type="submit" value="Activate Now"  class="button2" >
</form>
          </div>
        
</fieldset>

        <!--image gallery-->

<div id="container">
<img id="img" src="card1.png">
<div id="leftpane">
<h1 class="arrow" onclick="show(-1);"><</h1>
</div>
<div id="rightpane">
<h1 class="arrow" onclick="show(1);">></h1>
</div>
</div>
       
     <jsp:include page="/headerfile2.jsp" />
</body>
</html>