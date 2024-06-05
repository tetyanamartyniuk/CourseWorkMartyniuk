<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="viewInfoForUser.css">
    <title>Thing Details</title>
</head>
<body>
<h2>Детальна інформація про річ: ${thing.name}</h2>

<p><strong>Name:</strong> ${thing.name}</p>
<p><strong>Place:</strong> ${thing.place}</p>
<p><strong>Info: </strong>${thing.info}</p>
<p><strong>Ключові слова:</strong> ${keywords}</p>
<div class="button-container">
    <form action="delete-thing-servlet" method="post">
        <input type="hidden" name="name" value="${thing.name}" />
        <input type="hidden" name="place" value="${thing.place}" />
        <input type="hidden" name="info" value="${thing.info}" />
        <input type="hidden" name="keyWords" value="${fn:join(thing.keyWords, ',')}" />
        <a href="user-page-servlet" class="back-button">Назад</a>
        <input type="submit" value="Видалити" class="delete-button" />
    </form>

</div>

</body>
</html>


