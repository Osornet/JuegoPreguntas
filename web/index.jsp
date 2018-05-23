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

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego Preguntas</title>
    </head>

    <body id="fondo">

        <audio preload="auto" controls autoplay loop>

            <source src="Sonidos/juego-de-tronos-truth.mp3" type="audio/mpeg">
            Your browser does not support the audio element.
        </audio>


       
            <div class="section"> </div>
            <div class="section"> </div>
            <div class="row">

                <div class="col s12 m12">

                    <div class="font-effect-fire-animation">
                        <h1 class="center-align">BIENVENIDO AL JUEGO DE LAS SECUENCIAS
                        </h1>
                    </div>
                </div>
            </div>

            <div class="section"> </div>
            <div class="section"> </div>
            <div class="row center-align">         
                <div class="font-effect-fire-animation">>
                    <button class="font-effect-fire-animation red btn-large black-text" id="jugador1"><i class="material-icons right" id="jugador1">sentiment_very_satisfied</i><strong>1 JUGADOR</strong></button>                
                    >
                    <button class="font-effect-fire-animation red btn-large black-text" id="jugador2"><i class="material-icons right" id="jugador2">sentiment_very_satisfied</i><strong>2 JUGADORES</strong></button> 
                    >                
                    <button class="font-effect-fire-animation red btn-large black-text" id="jugador3"><i class="material-icons right" id="jugador3">sentiment_very_satisfied</i><strong>3 JUGADORES</strong></button>          
                    >
                    <button class="font-effect-fire-animation red btn-large black-text" id="jugador4"><i class="material-icons right" id="jugador4">sentiment_very_satisfied</i><strong>4 JUGADORES</strong></button> 

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
