<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<H1>View your information</H1>
<table>
<tr><td>Name</td>  <td>${UserModel.username}</td></tr>
<tr><td>Email</td> <td>${UserModel.useremail}</td></tr>
<tr><td>Password</td>  <td>${UserModel.pswd}</td></tr>
<tr><td>Gender</td> <td>${UserModel.gender}</td></tr>
<tr><td>Date of Birth</td>  <td>${UserModel.dob}</td></tr>
<tr><td>Age</td> <td>${UserModel.age}</td></tr>
<tr><td>Phone Number</td>  <td>${UserModel.phno}</td></tr>
<tr><td>Country </td> <td>${UserModel.country}</td></tr>
<tr><td>State</td>  <td>${UserModel.state}</td></tr>
<tr><td>Address</td> <td>${UserModel.add}</td></tr>
<tr><td>Institution </td> <td>${UserModel.institution}</td></tr>
<tr><td>Course</td> <td> ${UserModel.course}</td></tr>
<tr><td>Skills</td>  
<td><ul>
<c:forEach var="skill" items="${UserModel.skills}">
<li>${skill}</li>
</c:forEach>
</ul></td>
</tr>
</table>
</body>
</html>