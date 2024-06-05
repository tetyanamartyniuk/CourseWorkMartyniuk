<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Things</title>
</head>
<body>
<hr>
<table>
    <c:choose>
        <c:when test="${not empty thingList}">
            <td>Здається, ми знайшли щось схоже:</td>
            <c:forEach var="thing" items="${thingList}">
                <tr>
                    <td>
                        <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}">${thing.name}</a>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td>Вашу річ ще ніхто не знайшов</td>
            </tr>
        </c:otherwise>
    </c:choose>

</table>
</body>
</html>




