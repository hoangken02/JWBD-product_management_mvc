<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<h1>Product Information</h1>
<p><a href="/products">Back to list product</a></p>
<p>Name: </p>
<p>${requestScope["product"].getName()}</p>
<p>Price: </p>
<p>${requestScope["product"].getPrice()}</p>
</body>
</html>
