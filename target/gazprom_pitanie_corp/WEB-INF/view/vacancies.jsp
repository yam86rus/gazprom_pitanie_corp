<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.03.2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Вакансии</title>
</head>
<body>
<%--Подключаем header--%>
<jsp:include page="header.jsp"/>
<h2>
    Вакансии
</h2>
<table>
    <tr>
        <th>Название вакансии</th>
        <th>Обязаности</th>
        <th>Требования</th>
        <th>Условия</th>
        <th>Контакты</th>
    </tr>
    <c:forEach var="vacancy" items="${allVacancies}">
        <tr>
            <td>${vacancy.vacancy}</td>
            <td>${vacancy.description}</td>
            <td>${vacancy.requirements}</td>
            <td>${vacancy.conditions}</td>
            <td>${vacancy.contacts}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
