<%-- 
    Document   : Preguntas
    Created on : 12/05/2018, 05:04:23 PM
    Author     : osorn
--%>
<script src="../JS/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="../JS/Preguntas.js" type="text/javascript"></script>
<script src="../CSS/materialize/js/materialize.min.js" type="text/javascript"></script>
<script src="../JS/sweetalert2.all.min.js" type="text/javascript"></script>
<link href="../CSS/sweetalert2.css" rel="stylesheet" type="text/css"/>
<link href="../CSS/fondopreguntas.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab" rel="stylesheet">
<link href="../CSS/materialize/css/materialize.css" rel="stylesheet" type="text/css"/>
<link href="../CSS/palette.css" rel="stylesheet" type="text/css"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-CO">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Preguntas</title>
    </head>
    <body id="fondo">

        <div>
            <div class="col s12 m12">
                <nav class="default-primary-color">
                    <div class="nav-wrapper">

                        <ul class="center hide-on-med-and-down">
                            <li><a href=""><i class="material-icons left">add_circle</i>Añadir Pregunta</a></li>
                            <li><a id="cargarpreguntas"><i class="material-icons left">view_module</i>Mostrar Preguntas</a></li>
                        </ul>
                    </div>
                </nav>
            </div>

        </div><br>
        
        <div class="row" id="preguntas">
            <div class="col S6 m6 offset-m3 offset-s3">

                <div class="card-panel">

                    <div class="card-content">
                        <h4>
                            <span class="card-title black-text">AÑADIR PREGUNTA</span>
                        </h4>
                        <form action="InsertarPregunta.pre" method="post">
                            <div class="input-field">
                                <i class="material-icons prefix">help</i>
                                <textarea id="pregunta" name = "pregunta" class="materialize-textarea"></textarea>
                                <label for="preguntaDescripcion">ESCRIBA LA PREGUNTA</label>
                            </div>
                            <h4>OPCIONES DE RESPUESTA</h4>

                            <a class="btn-floating pulse" id="añadir"><i class="material-icons">add</i></a>
                            <div id = "opciones">                               

                            </div><br>

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
