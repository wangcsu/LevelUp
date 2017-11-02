<%-- 
    Document   : all
    Created on : Nov 1, 2017, 8:03:36 PM
    Author     : Ge Wang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Games</title>
    </head>
    <body>
        <table border="2px" align="center">
            <th>Product ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Category</th>
            <th>Availability</th>
            <th>Price</th>
                <c:forEach var="game" items="${gamesData}">
                <tr>
                    <td>${game.id}</td>
                    <td>${game.name}</td>
                    <td>${game.description}</td>
                    <td>${game.category}</td>
                    <td>${game.copies}</td>
                    <td>${game.price}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
