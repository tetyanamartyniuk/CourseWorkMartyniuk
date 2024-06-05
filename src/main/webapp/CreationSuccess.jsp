<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>View Thing</title>
    <link rel="stylesheet" type="text/css" href="creationSuccess.css">
</head>
<body>
<div class="container">
    <h1>Ви успішно додали річ!</h1>
    <div class="info-container">
        <p><strong>Автор знахідки: </strong> <c:out value="${publisher}"/></p>
        <p><strong>Назва: </strong> <c:out value="${name}"/></p>
        <p><strong>Місце знахідки: </strong> <c:out value="${place}"/></p>
        <p><strong>Додаткова інформація: </strong> <c:out value="${info}"/></p>
        <p><strong>Ключові слова: </strong> <c:out value="${keywordsString}"/></p>
        <p><strong>Номер телефону автора знахідки:</strong><c:out value="${phoneNumber}"/></p>
    </div>
    <a href="user-page-servlet" class="button">Ваші речі</a>
</div>
</body>
</html>





