<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 07.05.2023
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>

<table>
    <c:forEach var="entry" items="${array}">
        <tr>
            <c:forEach var="el" items="${entry}">
                <td>${el}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>

</body>
</html>