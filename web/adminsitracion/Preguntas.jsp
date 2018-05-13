<%-- 
    Document   : Preguntas
    Created on : 12/05/2018, 05:04:23 PM
    Author     : osorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-CO">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../JS/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../JS/Preguntas.js" type="text/javascript"></script>
        <title>Preguntas</title>
    </head>
    <body>
        <form  action="InsertarPregunta.pre" method="post">
            <p><label for="descripcion">Descripcion:</label></p>
            <p><textarea name = "descripcion" id="descripcion">Escriba la descripcion aqui ...</textarea></p>
            <p id = "opcion">+ Opcion</p>
            <div id = "opciones"></div>
            <p><label for="descripcionRespuesta">Opcion: </p>
            <p>
                <input type="text" name="descripcionRespuesta"/> 
                <label for = "esCorrecta">es correcta</label>
                <input type="radio" name = "esCorrecta" value = "1"/>
            </p>    
            <h3 hidden="hidden">Opciones</h3>
            
            
            <input type="submit" value="Guardar">
        </form>
    </body>
</html>
