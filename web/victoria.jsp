<%-- 
    Document   : Victoria
    Created on : 29/05/2018, 12:08:09 AM
    Author     : osorn
--%>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="CSS/victoria.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Rancho&effect=fire-animation"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Rancho&effect=shadow-multiple"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Rancho&effect=distressed"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="Imagenes/cohete.png" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>!Ganador¡</title>
    </head>
    <body id="victoria">
        <audio preload="auto" autoplay loop>
            <source src="Sonidos/triunfo.mp3" type="audio/mpeg">
            Your browser does not support the <code>audio</code> tag.
        </audio>
        <br>  
        <div class="row center-align">
            <div class="col s12 m12">

                <div>
                    <img src="Imagenes/podio1.jpg" style="border-radius: 20px; height: 250px; width: 500px">

                </div>
                <div class="font-effect-fire-animation">
                    <h2 style="font-family: Rancho">!!! FELICITACIONES <c:out value="${sessionScope.juego.jugadorActual.nombre}"/> HAS GANADO ¡¡¡</h2>
                </div>

            </div>
        </div>

        <div class="row center-align">
            <div class="col s3 m3 offset-s4 offset-m4">
                <h2 class="font-effect-shadow-multiple" style="font-family: Rancho">Tabla de Posiciones</h2>
                <table class="striped highlight centered" style="background-color: white">
                    
                    <tbody>
                        <!--Mostrar podio de todos los jugadores resaltar el ganador-->
                        <c:set var="i" value="${1}"/>
                        <c:forEach var ="jugador" items = "${sessionScope.juego.listaDeJugadores}">
                            <tr>
                                <td class="font-effect-fire-animation"><h6 style="color: red"><strong><c:out value="${i}"/>° lugar</strong></h6></td><td class="font-effect-fire-animation"><h6><strong style="color: black"><c:out value="${jugador.nombre}"/></strong></h6></td>
                            </tr>
                            <c:set var="i" value="${i+1}"/>
                        </c:forEach>                       
                    </tbody>
                </table>
            </div>
            <a class="btn-large dark-primary-color" href="index.jsp" style="color: white"><strong>Nuevo Juego</strong><i class="material-icons right">gamepad</i></a> 
        </div>


    </body>
</html>
