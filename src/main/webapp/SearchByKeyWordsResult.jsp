<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Пошук речей</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
        }

        .navigation {
            margin-top: 20px;
            text-align: center;
            margin-bottom: 20px;
        }

        .navigation a {
            display: inline-block;
            margin-right: 10px;
            padding: 10px;
            background-color: #cb274d;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        .navigation a:hover {
            background-color: #a1003b;
        }

        .found-text {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        ul {
            list-style-type: none;
            padding: 0;
            text-align: center;
        }

        li {
            margin-bottom: 10px;
        }

        a.item-link {
            display: inline-block;
            padding: 10px 20px;
            background-color: #cb274d;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s, transform 0.3s;
        }

        a.item-link:hover {
            background-color: #a1003b;
        }

        p {
            text-align: center;
            color: #666;
        }
    </style>
</head>
<body>

<div class="navigation">
    <a href="MainPage.jsp">Головна</a>
    <a href="createThing.jsp">Створити річ</a>
</div>
<h2>Пошук речей за ключовими словами</h2>
<c:choose>
    <c:when test="${not empty allThings}">
        <div class="found-text">Здається, ми знайшли щось схоже:</div>
        <ul>
            <c:forEach var="thing" items="${allThings}">
                <li>
                    <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}&phoneNumber=${thing.phoneNumber}" class="item-link">${thing.getName()}</a>
                </li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <p>Вашу річ ще ніхто не знайшов:(</p>
    </c:otherwise>
</c:choose>

</body>
</html>





