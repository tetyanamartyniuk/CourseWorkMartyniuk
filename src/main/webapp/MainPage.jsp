<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - The main page</title>
    <link rel="stylesheet" type="text/css" href="mainPage.css">
</head>
<body>
<div class="container">

    <div class="forms-container">
        <div>
            <form action="search-things-servlet" method="GET">
                <label for="name"></label>
                <input type="text" id="name" name="name" required placeholder="Назва">
                <button type="submit">Знайти</button>
            </form>
        </div>
        <div>
            <form action="search-things-by-place-servlet" method="GET">
                <label for="place"></label>
                <input type="text" id="place" name="place" required placeholder="Місце згуби">
                <button type="submit">Знайти</button>
            </form>
        </div>
        <div>
            <form action="search-things-by-keywords-servlet" method="GET">
                <label for="keyword"></label>
                <input type="text" id="keyword" name="keyword" required placeholder="Пошук за ключовими словами">
                <button type="submit">Знайти</button>
            </form>
        </div>
    </div>
    <h1><%= "Бюро знахідок" %></h1>
    <a href="all-things-page-servlet">Знайдені речі</a>
    <a href="createThing.jsp">Створити знахідку</a>
    <a href="user-page-servlet">Ваші речі</a>
</div>

<div class="img-container">
    <img src="img/snapedit_1717416589294.jpeg" alt="Опис зображення" height="1150px" width="1640px">
</div>
</body>
</html>


