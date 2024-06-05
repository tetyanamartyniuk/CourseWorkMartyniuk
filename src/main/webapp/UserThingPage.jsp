<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <title>Речі користувача</title>
    <link rel="stylesheet" type="text/css" href="userThings.css">
</head>
<body>
<div class="container">
    <a href="MainPage.jsp">Головна</a>
    <h1>Ваші речі:</h1>
    <a href="createThing.jsp">Створити знахідку</a>
    <ul>
        <c:forEach var="thing" items="${userThings}">
            <li>
                <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}&keyWords=${fn:join(thing.keyWords, ',')}">
                        ${thing.name}
                </a>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>







