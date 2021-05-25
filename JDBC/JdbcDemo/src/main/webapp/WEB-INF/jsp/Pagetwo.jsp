<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Entry</title>
</head>
<body>
<form:form action="add" method="get" modelAttribute="modeldemo">

Enter Email 
<form:input path="email"/> <br><br>
Enter Password
<form:password path="password"/>  <br><br>
Enter First Name
<form:input path="fname"/> <br><br>
Enter Last Name
<form:input path="lname"/> <br><br>
Enter Roll Number
<form:input path="rollnumber"/> <br><br>


<form:button>Submit</form:button>
<a href="/init">go back</a>
<a href="/show">show</a>
<h3>${msg}</h3>
</form:form>
</body>
</html>