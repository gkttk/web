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


        <h4>Регистрация</h4>
        <form id="registration" name="registration" method="get" action="helloUser">
            <fieldset>
                <input type="text" id="login" name="login" required>
                <label for="login"> * логин</label><br>
                <input type="text" id="password" name="password" required>
                <label for="password"> * пароль</label><br>
                <input type="text" id="age" name="age" required>
                                <label for="age"> * возраст</label><br>

                <input type="submit" value="Зарегистрироваться" >
            </fieldset>
        </form>

        <p>${requestScope.get("error")}</p>



</body>
</html>