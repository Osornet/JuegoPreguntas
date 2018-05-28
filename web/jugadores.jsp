<%-- 
    Document   : jugadores
    Created on : 28/05/2018, 04:51:03 AM
    Author     : JAVIER
--%>
<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/inicio.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<script src="JS/Preguntas.js" type="text/javascript"></script>
<script src="JS/jquery-3.3.1.min.js" type="text/javascript"></script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUGADORES</title>
    </head>
    <body id="fondo">
        <div class="row">
            <div class="col S6 m6 offset-m3 offset-s3">

                <div class="card-panel">

                    <div class="card-content">
                        <h4>
                            <span class="card-title black-text">NOMBRE DE LOS JUGADORES</span>
                        </h4>
                        <form action="CargarJuego.pre" method="post">

                            <div id="nombres">
                                                         
                            </div>
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
