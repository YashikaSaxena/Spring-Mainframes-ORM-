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
<form:form action="delete" method="get" modelAttribute="modeldemo">
Enter Roll Number To be Deleted
<form:input path="rollnumber"/> <br><br>
<form:button>Submit</form:button>
</form:form>
<a href="/init">go back</a>
<a href="/show">show</a>
<h3>${msg}</h3>
</body>
</html>