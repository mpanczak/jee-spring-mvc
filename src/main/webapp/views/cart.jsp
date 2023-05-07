<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Koszyk</h1>
<c:forEach var="item" items="${cartItems}">
    <h1>${item.quantity} | ${item.product.name} w cenie ${item.product.price}</h1>
</c:forEach>
</body>
</html>