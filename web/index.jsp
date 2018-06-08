<%-- 
    Document   : index
    Created on : 10/05/2018, 03:06:05 PM
    Author     : osorn
--%>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/inicio.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Rancho&effect=fire-animation"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="CSS/sweetalert2.css" rel="stylesheet" type="text/css"/>
<script src="JS/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="JS/sweetalert2.all.min.js" type="text/javascript"></script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego Preguntas</title>
    </head>

    <body id="fondo">

        <audio preload="auto" autoplay loop>
            <source src="Sonidos/juego-de-tronos-truth.mp3" type="audio/mpeg">
            Your browser does not support the audio element.
        </audio>

<!--juego.pre-->
       
            <div class="section"> </div>
            <div class="section"> </div>
            <div class="row">

                <div class="col s12 m12">

                    <div class="font-effect-fire-animation">
                        <h1 class="center-align">SECUENCIAS EN EL ESPACIO
                        </h1>
                    </div>
                </div>
            </div>

            <div class="section"> </div>
            <div class="section"> </div>
            <br>
            <br><br>
            
            <div class="row center-align">         
                <div class="font-effect-fire-animation">>
                    <a href="jugador1.jsp" class="font-effect-fire-animation red btn-large black-text" id="jugador1"><i class="material-icons right" id="jugador1">sentiment_very_satisfied</i><strong>1 JUGADOR</strong></a>                
                    >
                    <a href="jugador2.jsp" class="font-effect-fire-animation red btn-large black-text" id="jugador2"><i class="material-icons right" id="jugador2">sentiment_very_satisfied</i><strong>2 JUGADORES</strong></a> 
                    >                
                    <a href="jugador3.jsp" class="font-effect-fire-animation red btn-large black-text" id="jugador3"><i class="material-icons right" id="jugador3">sentiment_very_satisfied</i><strong>3 JUGADORES</strong></a>          
                    >
                    <a href="jugador4.jsp" class="font-effect-fire-animation red btn-large black-text" id="jugador4"><i class="material-icons right" id="jugador4">sentiment_very_satisfied</i><strong>4 JUGADORES</strong></a> 

                </div>
            </div>
            <!--<div class="row">
                <div class="col s12 m6">
                    <div class="card dark-primary-color">
                        <div class="card-content dark-primary-color">
                            <span class="card-title text-primary-color">Card Title</span>
                            <p>Pregunta</p>
                        </div>
                        <div class="card-action">
                            <a class="" href="#">Respuesta 1</a>
                            <a href="#">Respuesta 2</a>
                        </div>
                    </div>
                </div>
            </div>-->


      
    </body>
</html>
