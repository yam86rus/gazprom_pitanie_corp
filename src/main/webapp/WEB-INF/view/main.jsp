<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 10.03.2021
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Газпром питание</title>
</head>
<body>
<div class="container">

    <%--Подключаем header--%>
    <jsp:include page="header.jsp"/>

    <h3>Главная</h3>
    <br><br>


    <security:authorize access="hasAnyRole('HR','ADMINISTRATOR')">
        <input type="button" value="Salary" onclick="window.location.href='hr_info'"> Only for HR staff
    </security:authorize>
    <br><br>
    <security:authorize access="hasRole('MANAGER')">
        <input type="button" value="Performance" onclick="window.location.href='manager_info'"> Only for Managers
        <br><br>
    </security:authorize>

</div>
</body>
</html>
