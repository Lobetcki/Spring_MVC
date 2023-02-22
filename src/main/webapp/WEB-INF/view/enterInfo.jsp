<!DOCTYPE html>
<html>
<body>

<%-- Сообщение, в котором мы просим ввести имя --%>

<%-- Тег br означает пропуск строки --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="showInfo" method="get">

    <h1>Введите наименование страны</h1>
    <br>
    <input type="text" name="cantry">
    <br>
    <h1>Введите наименование столицы</h1>
    <br>
    <input type="text" name="city">
    <br>
    <br>

    <input type="submit">
</form>

</body>
</html>