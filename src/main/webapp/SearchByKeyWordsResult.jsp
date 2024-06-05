<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Keyword Search Results</title>
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
            text-align: left;
        }

        .navigation a {
            display: inline-block;
            margin-right: 10px;
            padding: 10px;
            text-decoration: none;
            color: #333;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .navigation a:hover {
            background-color: #cb274d;
            color: #fff;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        p {
            text-align: center;
            color: #666;
        }
    </style>
</head>
<body>
<h2>Результати пошуку за ключовими словами:</h2>

<div class="navigation">
    <a href="MainPage.jsp">Головна</a>
    <a href="createThing.jsp">Створити річ</a>
</div>

<c:choose>
    <c:when test="${not empty allThings}">
        <ul>
            <c:forEach var="thing" items="${allThings}">
                <li>
                    <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}">
                            ${thing.getName()}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <p>No things found matching the keyword.</p>
    </c:otherwise>
</c:choose>

</body>
</html>

