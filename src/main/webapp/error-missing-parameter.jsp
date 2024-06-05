<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Помилка</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
            color: #721c24;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .container {
            padding: 50px;
        }
        .error-message {
            border: 1px solid #f5c6cb;
            background-color: #f8d7da;
            padding: 20px;
            display: inline-block;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Помилка</h1>
    <div class="error-message">
        <p><%= request.getAttribute("errorMessage") %></p>
        <a href="createThing.jsp">Повернутися до створення речі</a>
    </div>
</div>
</body>
</html>

