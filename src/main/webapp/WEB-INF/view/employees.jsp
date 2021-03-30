<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.03.2021
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <title>Сотрудники</title>
</head>
<body>
<%--Подключаем header--%>
<jsp:include page="header.jsp"/>
<h2>
    Сотрудники
</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <security:authorize access="hasAnyRole('SECRETARY','ADMINISTRATOR')">
            <td>
                <input type="button" value="Изменить" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Удалить" onclick="window.location.href='${deleteButton}'"/>
            </td>
            </security:authorize>
        </tr>
    </c:forEach>
</table>

<security:authorize access="hasAnyRole('SECRETARY','ADMINISTRATOR')">
<input type="button" value="Добавить"
       onclick="window.location.href = 'addNewEmployee'">
</security:authorize>
</body>
</html>
