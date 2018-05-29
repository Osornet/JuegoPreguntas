<%-- 
    Document   : juego
    Created on : 22/05/2018, 06:44:17 PM
    Author     : JAVIER
--%>

<link href="CSS/juego.css" rel="stylesheet" type="text/css"/>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="JS/Preguntas.js" type="text/javascript"></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUEGO PREGUNTAS</title>
    </head>
    <body id="fondo">
        
        <div class="row center-align">
        <div class="col m4 s4">
            <h2 class="white-text default-primary-color" style="border-radius: 15px">PREGUNTAS</h2>
            <div class="card">
        <div class="card-image">
          <img src="Imagenes/pregunta1/pregunta.png" alt=""/>
          <span class="card-title black-text"></span>
        </div>
        <form id="responder" action="juego.jsp" method="post">
        <div class="card-content" style="padding: 0px 24px 0px 24px;">
          <p>Completa la tabla.</p>
          <br>
          
              <div class="row center-align" style="margin-bottom: 0px;"> 
          <div class="col m4 s4">                 
                  <label>
                      <input name="res" type="radio" checked />
                      <span>A.</span>
                  </label>
              </div>
          <div class="col m4 s4">                 
                  <label>
                      <input name="res" type="radio"/>
                      <span>B.</span>
                  </label>
              </div>
          <div class="col m4 s4">                 
                  <label>
                      <input name="res" type="radio"/>
                      <span>C.</span>
                  </label>
              </div>
          </div>
         
          
          <!--<div class="row center-align" style="margin-bottom: 0px;"> 
              <div class="col m2 s2">                 
                  <label>
                      <input name="res" type="radio" checked />
                      <span>A.</span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          <div class="row" style="margin-bottom: 0px;"> 
              <div class="col m2 s2">
                  <label>
                      
                      <input name="res" type="radio"/>
                      <span>B.</span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          <div class="row" style="margin-bottom: 0px;"> 
              <div class="col m2 s2">
                  <label>
                      
                      <input name="res" type="radio"/>
                      <span>C.</span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          -->
        </div><br>
        <div class="card-action" style="background-color: #FF4081">
            <button id="enviar" class="btn-large waves-effect accent-color"><h5><strong>RESPONDER</strong></h5></button>
        </div>
        </form>
        </div>
            
        </div>
        <div class="col m3 s3">
            <h2 class="white-text default-primary-color" style="border-radius: 15px">TURNO</h2>
            <br><br><div class="card-panel accent-color" style="border-radius: 15px">
        <span>
        <h2 class="white-text">Gabriela</h2>
        </span>
            </div><br>
            <button class="btn-large black-text yellow" id="dado"><i class="material-icons right" id="dado">sentiment_very_satisfied</i><strong>LANZAR DADO</strong></button> 
            <br><br>
            <div class="card-panel accent-color" style="border-radius: 15px">
        <span>
        <h2 class="white-text">#</h2>
        </span>
      </div>
        </div>
            <div class="col m4 s4">
                <h2 class="white-text default-primary-color" style="border-radius: 15px">POSICIONES</h2>
                
                
                <table class="striped centered" style="background-color: white">
                <thead>
                    <tr> 
                
                    <th>JUGADOR</th>                               
                    <th>CASILLA</th>
                    
              
          </tr>
        </thead>
        <tbody>
            <tr>
          
              <td>Juan</td>
              <td>10</td>
              
          </tr>
          <tr>
              <td>Gabriela</td>
              <td>20</td>
          </tr>
          
        </tbody>
                </table><br><br>
                <div class="row"> 
              <div class="col m4 s4">
                  <img src="Imagenes/tablero.png" alt=""/>
              </div>
              
          </div>
                
        </div>
        </div>
        
        
    </body>
</html>
