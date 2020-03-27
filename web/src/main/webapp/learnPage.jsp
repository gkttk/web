<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
</head>

${attribute_1}

<c:out value="${attribute_1}" escapeXml="false"/><br>
<c:out value="${attribute_2}" default="Дефаулт 2 нуль" /><br>



<c:set value="123" var="varName"/>
${varName}<br>

<c:out value="${uz}"/><br>
<c:set target="${uz}" property="login" value="Ostap"/>
<c:out value="${uz}"/><br>

<c:if test="${price > 800}">
<h1> Цена больше 800 </h1>
</c:if>

<c:choose>
<c:when test="${price > 1000}">
<h3> Цена больше/равна 1000 </h3>
</c:when>
<c:when test="${price < 1000}">
<h3> Цена меньше 1000 </h3>
</c:when>
<c:otherwise>
<h3> Цена равна 1000 </h3>
</c:otherwise>
</c:choose>

<c:if test="${price > 1000}">
<c:redirect url="https://www.noob-club.ru/index.php?topic=57797.0"/>
</c:if>




</body>
</html>