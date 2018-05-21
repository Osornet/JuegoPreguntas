<%-- 
    Document   : FormularioEditarPregunta
    Created on : 16/05/2018, 02:25:19 PM
    Author     : osorn
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Editar Pregunta</title>
    </head>
    <body>
        <div>
            <form action = "SalvarPregunta.pre">
                <label for = "preguntaDescripcion">Pregunta: </label>
                <input type="hidden" name="preguntaId" value="${pregunta.id}"/>
                <textarea name = "preguntaDescripcion">${pregunta.descripcion}</textarea>
                <input type="submit" name="SalvarPregunta" value = "salvar"/>
            </form>
            <h2>Opciones:</h2>
            <div>
                <c:forEach var = "opcion" items="${pregunta.respuestas}">
                    <p>
                        ${opcion.descripcion}
                        <c:if test = "${opcion.correcta eq 1}">
                            Opcion Correcta
                        </c:if>
                    </p>
                    <p>
                        <a href="EditarRespuesta.pre?respuestaId=${opcion.id}">editar</a>
                        <a href="EliminarRespuesta.pre?respuestaId=${opcion.id}">editar</a>
                    </p>
                </c:forEach>
            </div>
            <a href="FormularioInsertarRespuesta.jsp?preguntaId=${pregunta.id}">+ Opcion</a>
        </div>
    </body>
</html>
