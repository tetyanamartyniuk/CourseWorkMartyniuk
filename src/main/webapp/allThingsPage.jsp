<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>All Things</title>

    <link rel="stylesheet" type="text/css" href="mainPage.css">
    <link rel="stylesheet" type="text/css" href="allThings.css">

</head>
<body>
<div class="forms-container">
    <div class="button2">
    <a href="MainPage.jsp">Головна</a>
    <a href="createThing.jsp">Створити річ</a>
    <a href="user-page-servlet">Ваші речі</a>
    </div>
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
<div class="container">


    <h1>Наші знахідки - ваші згуби</h1>
</div>
<div class="list">
<ul>

        <c:if test="${not empty allThings}">
            <c:forEach var="thing" items="${allThings}">
                <li><a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}&phoneNumber=${thing.phoneNumber}">${thing.name}</a></li>
            </c:forEach>
        </c:if>
</ul>
</div>
</body>
</html>










