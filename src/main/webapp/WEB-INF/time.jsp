<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time-Page</title>
<link rel="stylesheet" type="text/css" href="css/Time_style.css">
</head>
<body>
	<p><c:out value="${time}"></c:out><a href="/">Go Back</a></p>
	<script type="text/javascript" src="js/time.js"></script>
</body>
</html>