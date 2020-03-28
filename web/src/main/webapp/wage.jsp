<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1><c:out value="Hello, ${user}!"/></h1>
        <h4>Введите заработок</h4>
        <form id="zarplata" name="zarplata" method="post" action="wage">
            <fieldset>
                <legend>Введите заработок</legend>
                <input type="text" id="zarplata_f1" name="zarplata_f1" required><br>
                <input type="submit" value="Посчитать"><br>
            </fieldset>
        </form><br>



        <c:if test="${your_wage != null}">
        <table width="700" border="1" bordercolor="blue" align="left">
            <col width="50%">
            <tr>
                <td><b>Налог</b></td>
                <td><b>Процент</b></td>
                <td><b>Данные</b></td>
            </tr>
            <tr>
                <td>Налог по ФСЗН</td>
                <td>35%</td>
                <td>${fszn}</td>
            </tr>
            <tr>
                <td>Отчисления в БелГосСтрах</td>
                <td>0.6%</td>
                <td>${belgos}</td>
            </tr>
            <tr>
                <td>Подоходный налог</td>
                <td>13%</td>
                <td>${podohod}</td>
            </tr>
            <tr>
                <td>Процент профсоюза</td>
                <td>1%</td>
                <td>${prof}</td>
            </tr>
        </table>
         <br><br><br>
        <h1> Ваша зарплата: ${your_wage}</h1>
        </c:if>
        <br><br>
<h1><c:out value="Зарегистрированные пользователи:"/></h1><br>
<c:forEach items="${list}" var="item">
<c:out value="${item}"/> <br>
</c:forEach>


</body>
</html>