<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FirstPage</title>
</head>
<style>

    body
    {
    	background-image: url('C:/Users/Zaid Hasan Khan/Desktop/html&css/back.jpg');
    	background-repeat: no-repeat;
 		background-size: 1550px 750px;
    }

	h1{
		text-align: center;
		font-size: 50px;
		font-style: italic;
	}
	
	h3 {
		color: black; 
		font-size: 30px;
	}

	footer
	{
		 position: fixed;
  		left: 0;
 	 	bottom: 0;
  		width: 100%;
  		background-color: red;
  		color: white;
  		text-align: center;	}
</style>
<body>
	<h1>SIGNUP PAGE</h1>
	<form:form action="signup" method="post" modelAttribute="user">
	<h3>Input Name</h3>
	<form:input path="Name"/>
	<h3>Input Age</h3>
	<form:input path="Age"/>
	<h3>Input Email</h3>
	<form:input path="Email"/>
	<h3>Input Phone Number</h3>
	<form:input path="PhoneNo"/>
	<h3>Input Password</h3>
	<form:password path="Password"/>
	<form:button>SIGNUP</form:button>
	</form:form>
	<footer>This page is designed by ZAID KHAN</footer>
	
</body>
</html>