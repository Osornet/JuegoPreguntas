<%-- 
    Document   : jugador4
    Created on : 28/05/2018, 11:11:27 AM
    Author     : JAVIER
--%>
<link href="CSS/inicio.css" rel="stylesheet" type="text/css"/>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<script src="JS/Preguntas.js" type="text/javascript"></script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="fondo">
        <div class="row"></div>
        <div class="row"></div>
        <div class="row center-align">
            <div class="col S5 m5 offset-m3 offset-s3">

                <div class="card-panel">

                    <div class="card-content">
                        <h4>
                            <span class="card-title black-text">Escribe el nombre del jugador</span>
                        </h4>                      
                        
                        <form action="CargarJuego.pre" method="post" style="margin: 0">
                                <div class="input-field">

                                    <i class='material-icons prefix'>accessibility</i>
                                    <input type='text' id='jugador1' name = 'jugadores' placeholder='Jugador 1' maxlength="20" required>
                                </div>
                                <div class="input-field">

                                    <i class='material-icons prefix'>accessibility</i>
                                    <input type='text' id='jugador2' name = 'jugadores' placeholder='Jugador 2' maxlength="20" required>
                                </div>
                            <div class="input-field">

                                    <i class='material-icons prefix'>accessibility</i>
                                    <input type='text' id='jugador3' name = 'jugadores' placeholder='Jugador 3' maxlength="20" required>
                                </div>
                            <div class="input-field">

                                    <i class='material-icons prefix'>accessibility</i>
                                    <input type='text' id='jugador4' name = 'jugadores' placeholder='Jugador 4' maxlength="20" required>
                            </div>
                            
                                <a class="btn waves-effect red" href="index.jsp" style="color: white">Atrás<i class="material-icons right">arrow_back</i></a>  
                            
                            <button class="btn waves-effect accent-color" type="submit" name="action">Guardar
                                    <i class="material-icons right">save</i>
                            </button>

                            </form>
                        
                    </div>

                </div>
            </div>



        </div>

    </body>
</html>
