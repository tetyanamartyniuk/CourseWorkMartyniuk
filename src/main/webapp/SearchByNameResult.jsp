<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Пошук речей</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
            text-align: center;
        }

        hr {
            border: none;
            border-top: 2px solid #ccc;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 0 auto;
        }

        td {
            padding: 10px;
            text-align: center;
        }

        a.button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #b3004b;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s, transform 0.3s;
            margin: 10px;
        }

        a.button:hover {
            background-color: #950037;
        }
    </style>
</head>
<body>

<a href="MainPage.jsp" class="button">Головна</a>
<a href="all-things-page-servlet" class="button">Знайдені речі</a>
<h2>Пошук речей за назвою</h2>
<hr>
<table>
    <c:choose>
        <c:when test="${not empty thingList}">
            <tr>
                <td colspan="2">Здається, ми знайшли щось схоже:</td>
            </tr>
            <c:forEach var="thing" items="${thingList}">
                <tr>
                    <td>
                        <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}" class="button">${thing.name}</a>
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





