<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.manager.servlet.Company" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List company</title>
</head>
<body>
	<h1>Company lists:</h1>
	
	<ul>
		<c:forEach items="${listCompanys}" var="company">
			<li>${company.name}</li>
			<li>
				<fmt:formatDate pattern="dd//MM/yyyy" value="${company.openingDate}"/>
			</li>
		</c:forEach>
	</ul>
</body>
</html>