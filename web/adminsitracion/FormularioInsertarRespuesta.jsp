<%-- 
    Document   : FormularioInsertarRespuesta
    Created on : 17/05/2018, 07:08:40 PM
    Author     : osorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario editar Respuesta</title>
    </head>
    <body>
        <div>
            <form action="InsertarRespuesta.pre">
                <input type="hidden" name="preguntaId" value="${param.preguntaId}"/>
                <input type="text" name="descripcion"/>
                <input type="radio" name="correcta" value="1"/>
                <input type="submit" value="Guardar"/>
            </form>
        </div>
    </body>
</html>
