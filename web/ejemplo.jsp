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
        <script src="JS/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="JS/ejemplo.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>

        Jugador: <c:out value="${sessionScope.juego.jugadorActual.nombre}"/>
        posicion: <c:out value="${sessionScope.juego.jugadorActual.posicion}"/>
        <form action="Siguiente.pre">
            Pregunta: <c:out value="${sessionScope.juego.jugadorActual.preguntaActual.descripcion}"/><br>

            A: <input type="radio" name="respuesta" value="1"/>
            B: <input type="radio" name="respuesta" value="2"/>
            C: <input type="radio" name="respuesta" value="3"/>
            D: <input type="radio" name="respuesta" value="4"/>
            
            <input type="hidden" name="numeroDado" value="10"/>
            <input type="submit" value="contestar"/>
        </form>

            <input type="hidden" id="res" value="${mensaje}"/>   

    </body>
</html>
