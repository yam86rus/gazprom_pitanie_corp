<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 22.03.2021
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>administrator</title>
</head>
<body>
<%--Подключаем header--%>
<jsp:include page="header.jsp"/>
Админка
<ul>
    <li><a href="<c:url value="/users"/>">Пользователи</a></li>
</ul>
</body>
</html>
