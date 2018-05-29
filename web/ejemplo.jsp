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
        <link href="CSS/ejemplo.css" rel="stylesheet" type="text/css"/>
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
        <c:set var="i" value="${0}"/>
        <c:forEach var="jugador" items="${sessionScope.juego.listaDeJugadores}">
            <input type="hidden" id="nombre${i}" value="${jugador.nombre}"/> 
            <input type="hidden" id="posicion${i}" value="${jugador.posicion}"/>
            <c:set var="i" value="${i+1}"/>
        </c:forEach>
        <input type="hidden" id="tope" value="${i}"/>     

            <table border=1 cellspacing=0 cellpadding=2 bordercolor="black">
                <tr>
                    <td id="p1"></td>
                    <td id="p2"></td>
                    <td id="p3"></td>
                    <td id="p4"></td>
                    <td id="p5"></td>
                    <td id="p6"></td>
                    <td id="p7"></td>
                    <td id="p8"></td>
                    <td id="p9"></td>
                    <td id="p10"></td>
                </tr>
                <tr>
                    <td id="p11"></td>
                    <td id="p12"></td>
                    <td id="p13"></td>
                    <td id="p14"></td>
                    <td id="p15"></td>
                    <td id="p16"></td>
                    <td id="p17"></td>
                    <td id="p18"></td>
                    <td id="p19"></td>
                    <td id="p20"></td>
                </tr>
                <tr>
                    <td id="p21"></td>
                    <td id="p22"></td>
                    <td id="p23"></td>
                    <td id="p24"></td>
                    <td id="p25"></td>
                    <td id="p26"></td>
                    <td id="p27"></td>
                    <td id="p28"></td>
                    <td id="p29"></td>
                    <td id="p30"></td>
                </tr>
                <tr>
                    <td id="p31"></td>
                    <td id="p32"></td>
                    <td id="p33"></td>
                    <td id="p34"></td>
                    <td id="p35"></td>
                    <td id="p36"></td>
                    <td id="p37"></td>
                    <td id="p38"></td>
                    <td id="p39"></td>
                    <td id="p40"></td>
                </tr>
                <tr>
                    <td id="p41"></td>
                    <td id="p42"></td>
                    <td id="p43"></td>
                    <td id="p44"></td>
                    <td id="p45"></td>
                    <td id="p46"></td>
                    <td id="p47"></td>
                    <td id="p48"></td>
                    <td id="p49"></td>
                    <td id="p50"></td>
                </tr>
                <tr>
                    <td id="p51"></td>
                    <td id="p52"></td>
                    <td id="p53"></td>
                    <td id="p54"></td>
                    <td id="p55"></td>
                    <td id="p56"></td>
                    <td id="p57"></td>
                    <td id="p58"></td>
                    <td id="p59"></td>
                    <td id="p60"></td>
                </tr>
            </table>
        </body>
    </html>
