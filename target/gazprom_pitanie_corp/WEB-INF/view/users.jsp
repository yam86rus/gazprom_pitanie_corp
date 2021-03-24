<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 24.03.2021
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Пользователи</title>
</head>
<body>
<%--Подключаем header--%>
<jsp:include page="header.jsp"/>
<br>
<h2>
    Пользователи
</h2>
<table>
    <tr>
        <th>username</th>
        <th>password</th>
        <th>enabled</th>
    </tr>
    <c:forEach var="users" items="${allUsers}">
        <tr>
            <td>${users.username}</td>
            <td>${users.password}</td>
            <td>${users.enabled}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
