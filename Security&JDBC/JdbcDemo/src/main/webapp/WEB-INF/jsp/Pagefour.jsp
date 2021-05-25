<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="update" method="get" modelAttribute="modeldemo">

Enter Roll Number of which data is to be updated

<form:input path="rollnumber"/>  <br><br>

Enter New Email 
<form:input path="email"/>  <br><br>
Enter New Password
<form:password path="password"/>  <br><br>
Enter New First Name
<form:input path="fname"/>  <br><br>
Enter New Last Name
<form:input path="lname"/> <br><br>

<form:button>Submit</form:button>
</form:form>
<a href="/init">go back</a>
<a href="/show">show</a>
<h3>${msg}</h3>
</body>
</html>