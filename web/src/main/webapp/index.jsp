<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<fmt:setLocale value="en_US"/>
<fmt:setBundle basename="translations" var="messages"/>
<html>
<body>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
</head>

<tr>
    <td align="left" valign="top">
        <h4>Войти</h4>
        <form id="form" name="form" method="get" action="checkLogPass">
            <fieldset>
                <input type="text" id="login" name="login" required>
                <label for="login"> * <fmt:message key="login.username" bundle="${messages}"/></label><br>
                <input type="text" id="password" name="password" required>
                <label for="password"> * <fmt:message key="login.password" bundle="${messages}"/></label><br>
                <input type="submit" value="Go" >

            </fieldset>
        </form>

        <form id="registration" name="registration" method="get" action="registration.jsp">
                    <button type="submit" value="registration">Регистрация</button>
                </form><br>

        <form id="learn" name="learn" method="get" action="jstl">
                    <button type="submit" value="learn">Обучение</button>
                </form><br>

        <p>${requestScope.get("errorLogPass")}</p>



</body>
</html>