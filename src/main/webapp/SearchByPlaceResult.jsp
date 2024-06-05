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

        table {
            width: 100%;
            border-collapse: collapse;
            text-align: center;
            margin-top: 20px;
        }

        td {
            padding: 10px;
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
<h2>Пошук речей за місцем</h2>
<hr>
<table>
    <c:choose>
        <c:when test="${not empty thingByPlaceList}">
            <tr>
                <td colspan="2" class="found-text">Здається, ми знайшли щось схоже:</td>
            </tr>
            <c:forEach var="thing" items="${thingByPlaceList}">
                <tr>
                    <td>
                        <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}&phoneNumber=${thing.phoneNumber}" class="item-link">${thing.name}</a>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td>Вашу річ ще ніхто не знайшов:(</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>





