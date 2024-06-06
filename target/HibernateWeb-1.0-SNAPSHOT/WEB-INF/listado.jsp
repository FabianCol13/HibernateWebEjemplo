<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <caption>Listado de usuarios</caption>
            <tr>
                <th>Id Usuario</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Teléfono</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.idUser}</td>
                    <td>${user.nameUser}</td>
                    <td>${user.lastnameUser}</td>
                    <td>${user.emailUser}</td>
                    <td>${user.phoneUser}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
