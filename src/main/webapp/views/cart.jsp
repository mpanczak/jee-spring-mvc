<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Koszyk</h1>
<p>
    W koszyku jest ${prodQuant} pozycji.<br>
    W koszyku jest ${allProd} produktów.<br>
    Wartość koszyka to: ${total} zł.<br>
</p>
<c:forEach var="item" items="${cartItems}">
    <h4>${item.quantity} | ${item.product.name} w cenie ${item.product.price} zł.</h4>
</c:forEach>
</body>
</html>