<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="item" items="${student}">
	<h2>Id : ${item.getId()}<br>
	Name :${item.getName()}<br>
	Age :${item.getAge()}<br></h2>
	<br>
	
	</c:forEach>
</body>
</html>