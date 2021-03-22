<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.03.2021
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<nav>
    <ul>
        <li><a href="<c:url value="/"/>"><img src="img/logo.png" alt="logo"></a></li>
        <li><a href="<c:url value="/employees"/>">Сотрудники</a></li>
        <li><a href="<c:url value="/news"/>">Новости</a></li>
        <li><a href="<c:url value="/documents"/>">Документы</a></li>
        <li><a href="<c:url value="/knowledge"/>">База знаний</a></li>
        <li><a href="<c:url value="/vacancies"/>">Вакансии</a></li>
        <li><a href="<c:url value="/gallery"/>">Медиагалерея</a></li>
        <li><a href="<c:url value="/tradeUnion"/>">Профсоюз</a></li>
        <li><a href="<c:url value="/about"/>">О компании</a></li>
        <security:authorize access="hasRole('ADMINISTRATOR')">
            <li><a href="<c:url value="/administrator"/>">Администрирование</a></li>
        </security:authorize>
    </ul>
</nav>


