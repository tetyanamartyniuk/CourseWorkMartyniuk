<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Things</title>
</head>
<body>
<h2>Search Things</h2>

<hr>
<table>
    <tr>
        <td>Тут знайшли:</td>
    </tr>
    <c:choose>
        <c:when test="${not empty thingByPlaceList}">
            <c:forEach var="thing" items="${thingByPlaceList}">
                <tr>
                    <td>
                        <a href="view-info-servlet?name=${thing.name}&place=${thing.place}&publisher=${thing.publisher}&info=${thing.info}">${thing.name}</a>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td>No active lots found</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</body>
</html>




