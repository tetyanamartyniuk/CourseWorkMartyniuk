<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Детальна інформація</title>
    <link rel="stylesheet" type="text/css" href="viewInfo.css">
</head>
<body>
<div class="container">
    <h1>Детальна інформація про річ</h1>
    <a href="all-things-page-servlet">Назад до списку</a>
    <p><strong>Назва:</strong> ${thing.name}</p>
    <p><strong>Автор публікації:</strong> ${thing.publisher}</p>
    <p><strong>Місце знахідки:</strong> ${thing.place}</p>
    <p><strong>Інформація:</strong> ${thing.info}</p>
    <p><strong>Ключові слова:</strong> ${keywords}</p>
</div>
</body>
</html>





