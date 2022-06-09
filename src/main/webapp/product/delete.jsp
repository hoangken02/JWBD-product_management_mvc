<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
  <h1>Delete Form</h1>
  <form method="post">
    <table border="1">
      <tr>
        <td>Name</td>
        <td>${requestScope["product"].getName()}</td>
      </tr>
      <tr>
        <td>Price</td>
        <td>${requestScope["product"].getPrice()}</td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="delete"></td>
      </tr>
    </table>
  </form>
</body>
</html>
