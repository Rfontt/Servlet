<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/newCompany" var="linkServletNewCompany" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNewCompany}" method="POST">
		Name: <input id="name" name="name" />
		Opening date: <input id="openingDate" name="openingDate" />
		
		<input type="submit"/>
	</form>
</body>
</html>