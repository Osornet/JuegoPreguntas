<%-- 
    Document   : Victoria
    Created on : 29/05/2018, 12:08:09 AM
    Author     : osorn
--%>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="CSS/victoria.css" rel="stylesheet" type="text/css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="victoria">
        <br>  
    <div class="row center-align">
    <div class="col s12 m12">
      
        <div style="border-radius: 15px">
          <img src="Imagenes/podio3.jpg">
          
        </div>
          <div class="">
            <h2>!!! FELICITACIONES JAVIER HAS GANADO ¡¡¡</h2>
            <h3><c:out value="${sessionScope.juego.jugadorActual.nombre}"/></h3>
        </div>
      
    </div>
  </div>
        
                
        <div class="row">
                    
        </div>
        
        Tabla de Posiciones
        <table>
            <tr>
                <th>Nombre Jugador</th><th>Posicion final</th>
            </tr>
            <!--Mostrar podio de todos los jugadores resaltar el ganador-->
            <c:forEach var ="jugador" items = "${sessionScope.juego.listaDeJugadores}">
                <tr>
                    <td><c:out value="${jugador.nombre}"/></td><td>${jugador.posicion}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
