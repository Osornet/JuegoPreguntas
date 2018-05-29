<%-- 
    Document   : Victoria
    Created on : 29/05/2018, 12:08:09 AM
    Author     : osorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Jugador: <c:out value="${sessionScope.juego.jugadorActual.nombre}"/>
        Tabla de Posiciones
        <table>
            <tr>
                <th>Nombre Jugador</th><th>Posicion final</th>
            </tr>
            <c:forEach var ="jugador" items = "${sessionScope.juego.listaDeJugadores}">
                <tr>
                    <td><c:out value="${jugador.nombre}"/></td><td>${jugador.posicion}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
