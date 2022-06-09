<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Edit Product</h1>
<p><a href="/products">Back to list product</a></p>
<p><c:if test='${requestScope["message"]!= null}'>
    <span>${requestScope["message"]}</span>
</c:if></p>
<form method="post">
    <table border="1">
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${requestScope["product"].getName()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" value="${requestScope["product"].getPrice()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="update"></td>
        </tr>
    </table>
</form>
</body>
</html>
