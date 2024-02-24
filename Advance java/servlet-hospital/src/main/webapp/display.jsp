<%@page import="com.jsp.service.ServiceHospital"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="display">
		<table>
			<% for(List l :list) %>
		</table>
		<thead>Id</thead>
			<thead>Name</thead>
			<thead>Website</thead>
			<thead>Phone</thead>
	</form>
</body>
</html>