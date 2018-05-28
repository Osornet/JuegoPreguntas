<%-- 
    Document   : juego
    Created on : 22/05/2018, 06:44:17 PM
    Author     : JAVIER
--%>
<script src="JS/Preguntas.js" type="text/javascript"></script>
<link href="CSS/juego.css" rel="stylesheet" type="text/css"/>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUEGO PREGUNTAS</title>
    </head>
    <body id="fondo">
        
        <div class="row center-align">
        <div class="col m5 s5">
            <h2 class="white-text default-primary-color" style="border-radius: 15px">PREGUNTAS</h2>
            <div class="card">
        <div class="card-image">
          <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
          <span class="card-title black-text">Responde:</span>
        </div>
                
        <div class="card-content">
          <p>I am a very simple card. I am good at containing small bits of information.</p>
          <br>
          <div class="row"> 
              <div class="col m2 s2">                 
                  <label>
                      <input name="group1" type="radio" checked />
                      <span></span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          <div class="row"> 
              <div class="col m2 s2">
                  <label>
                      
                      <input name="group1" type="radio"/>
                      <span></span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          <div class="row"> 
              <div class="col m2 s2">
                  <label>
                      
                      <input name="group1" type="radio"/>
                      <span></span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          <div class="row"> 
              <div class="col m2 s2">
                  <label>
                      
                      <input name="group1" type="radio">
                      <span></span>
                  </label>
              </div>
              <div class="col m3 s3">
                  <img src="Imagenes/pregunta1/imagen transparente.png" alt=""/>
              </div>
          </div>
          
          
        </div>
                <div class="card-action right-align" style="background-color: #FF4081">
          <a href="#">Aceptar</a>
        </div>
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
