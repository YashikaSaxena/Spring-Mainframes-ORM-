<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${studentlist}" var="studentlist">
         <table border="1px" style="width:100%">
         <tr>
           <th>Fname</th>
           <th>Lname</th>
           <th>Roll Number</th>
           <th>Email</th>
           <th>Password</th>
           <th>Edit/Delete</th>
         <tr>
           <td width="60" align="center">${studentlist.fname}</td>
           <td width="60" align="center">${studentlist.lname}</td>
           <td width="60" align="center">${studentlist.rollnumber}</td>
           <td width="60" align="center">${studentlist.email}</td>
           <td width="60" align="center">${studentlist.password}</td> 
           <td width="60" align="center"><a href="edit/${studentlist.rollnumber}"></a>/<a href="delete/${studentlist.rollnumber}">Delete</a></td>
         </tr>
         </table>
         </c:forEach>
</body>
</html>