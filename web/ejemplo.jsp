<%-- 
    Document   : ejemplo
    Created on : 28/05/2018, 11:52:42 AM
    Author     : osorn
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Jugador: <c:out value="${sessionScope.juego.jugadorActual.nombre}"/>
        
        posicion: <c:out value="${sessionScope.juego.jugadorActual.posicion}"/>
        
        <form>
            Pregunta: <c:out value="${sessionScope.juego.jugadorActual.preguntaActual}"/>
            
            <c:forEach var="pregunta" items="${sessionScope.juego.jugadorActual.preguntaActual.respuestas}">
                <c:out value="${pregunta.descripcion}"/>
            </c:forEach>
        </form>
        
    </body>
</html>
