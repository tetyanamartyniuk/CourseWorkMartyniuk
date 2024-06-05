<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Створення знахідки</title>
    <link rel="stylesheet" type="text/css" href="createThing.css">
</head>
<body>
<div class="button">
<a href="MainPage.jsp">Головна</a>
    <a href="all-things-page-servlet">Список знахідок</a>
<a href="UserThingPage.jsp">Ваші речі</a>

</div>
<div class="container">
    <h1>Створіть знахідку:</h1>
    <form action="create-thing-servlet" method="post">
        <label for="publisher">Автор знахідки:</label>
        <input type="text" id="publisher" name="publisher">

        <label for="name">Назва:</label>
        <input type="text" id="name" name="name">

        <label for="place">Місце знахідки:</label>
        <input type="text" id="place" name="place">

        <label for="info">Опис:</label>
        <input type="text" id="info" name="info">

        <label for="keywords">Ключові слова:</label>
        <input type="text" id="keywords" name="keywords">

        <label for="phoneNumber">Номер телефону автора знахідки:</label>
        <input type="text" id="phoneNumber" name="phoneNumber">

        <input type="submit" value="Створити">
    </form>
</div>
</body>
</html>


