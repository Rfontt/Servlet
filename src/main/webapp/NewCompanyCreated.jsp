<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<c:if test="${not empty companyName }">
		Company ${ companyName } created with sucess!		
	</c:if>
	
	<c:if test="${empty companyName }">
		Error! No company registered.	
	</c:if>
</body>
</html>