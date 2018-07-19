<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>
	<h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
	<h2>${message}</h2>
	
	<form action="<spring:url value="/logout"/>" method="post">
		<input value="Logout" type="submit">
	</form>
</body>
</html>