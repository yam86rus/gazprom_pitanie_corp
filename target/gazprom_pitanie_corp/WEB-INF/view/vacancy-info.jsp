<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 20.02.2021
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <%@ page isELIgnored="false" %>
<%--    <meta charset="UTF-8">--%>
    <title>Title</title>
</head>
<body>
<h2>Информация по вакансии</h2>
<br>
<form:form action="/saveVacancy" modelAttribute="vacancy">
    <form:hidden path="id"/>

    Название вакансии <form:input path="vacancy"/>
    <br>
    <br>
    Описание <form:input path="description"/>
    <br>
    <br>
    Требования <form:input path="requirements"/>
    <br>
    <br>
    Условия <form:input path="conditions"/>
    <br>
    <br>
    Контакты <form:input path="contacts"/>

    <input type="submit" value="ОК">

</form:form>
</body>
</html>
