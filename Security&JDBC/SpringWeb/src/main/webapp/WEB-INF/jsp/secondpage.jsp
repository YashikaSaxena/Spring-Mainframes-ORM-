<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second page</title>
</head>
<style>
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
  	  body
    {
    	background-image: url('C:/Users/Zaid Hasan Khan/Desktop/html&css/back.jpg');
    	background-repeat: no-repeat;
 		background-size: 1550px 750px;
    }
  		
	</style>

<body>

	<h3>Name=${name}</h3>
	<h3>Age=${age}</h3>
	<h3>Email=${email}</h3>
	<h3>PhoneNo=${phoneno}</h3>
	<h3>Password=${password}</h3>
	<footer> This page is designed by ZAID KHAN</footer>
	
</body>
</html>