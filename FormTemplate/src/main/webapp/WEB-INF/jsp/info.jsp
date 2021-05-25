<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Original+Surfer&family=Quicksand&display=swap" rel="stylesheet">
<link href="resources\css\info_css.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<div class="con"></div>

 <div class= "bg-text"> 

<h1>REGISTERATION</h1>
<p>Fill your details carefully!</p>
<table>
<form:form action="details" method="post" modelAttribute="UserModel">
<tr>
<td>Name</td> 
<td><form:input path="username"/></td>
<td><form:errors path="username" cssClass="error" /></td>
</tr>
<tr>
<td>Email </td>
<td><form:input type="email" path="useremail"/></td>
<td><form:errors path="useremail" cssClass="error" /></td>
</tr>
<tr>
<td>Password</td> 
<td><form:input type="password" path="pswd"/></td>
<td><form:errors path="pswd" cssClass="error" /></td>
</tr>
<tr>
<td>Gender</td> 
<td>
<form:radiobutton path="gender" value="M" label="Male"/>
<form:radiobutton path="gender" value="F" label="Female"/>
</td> 
<td><form:errors path="gender" cssClass="error" /></td>
</tr>
<tr>
<td>DOB </td>
<td><form:input type="date" path="dob"/></td>
<td><form:errors path="dob" cssClass="error" /></td>
</tr>
<tr>
<td>Age</td> 
<td><form:input path="age"/></td>
<td><form:errors path="age" cssClass="error" /></td>
</tr>
<tr>
<td>Phone Number</td> 
<td><form:input path="phno"/></td>
<td><form:errors path="phno" cssClass="error" /></td>
</tr>
<tr>
<td>Country</td> 
<td>
<form:select path="country">
<form:option value="None" label="Select"/>
<form:options items="${countryList}"/>
</form:select>
</td>
<td><form:errors path="country" cssClass="error" /></td>
</tr>
<tr>
<td>State</td> 
<td><form:input path="state"/></td>
<td><form:errors path="state" cssClass="error" /></td>
</tr>
<tr>
<td>Address</td> 
<td><form:textarea path="add" rows="5" col="15"/></td>
<td><form:errors path="add" cssClass="error" /></td>
</tr>
<tr>
<td>Institution</td> 
<td><form:input path="institution"/></td>
<td><form:errors path="institution" cssClass="error" /></td>
</tr>
<tr>
<td>Course</td> 
<td><form:input path="course"/></td>
<td><form:errors path="course" cssClass="error" /></td>
</tr>
<tr>
<td>Skills</td> 
<td><form:checkboxes items="${skillsList}" path="skills" /></td>
<td><form:errors path="skills" cssClass="error" /></td>
</tr>
<tr>
<td><form:button class="button">REGISTER</form:button></td>
</tr>
<tr>
</form:form>
</table>

</div>



</body>
</html>