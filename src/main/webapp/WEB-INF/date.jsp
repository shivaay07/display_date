<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/Date_style.css">
<title>Date-paga</title>

</head>
<body>
	<div id="date">
	<p><c:out value="${date}"></c:out><a href="/">Go Back</a></p>
	</div>
	<script type="text/javascript" src="js/date.js"></script>
</body>
</html>