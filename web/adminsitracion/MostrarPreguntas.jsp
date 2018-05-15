<%-- 
    Document   : MostrarPreguntas
    Created on : 15/05/2018, 01:01:05 AM
    Author     : osorn
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preguntas a Mostrar</title>
    </head>
    <body>
        <div>
            <c:forEach var="pregunta" items="${sessionScope.listaDePreguntas}">
                <div>
                    <h3>Pregunta:</h3>
                    <p>
                        ${pregunta.descripcion}
                    </p>
                    <p>
                    <a href="EditarPregunta.pre?$preguntaId=${pregunta.id}">Editar</a>
                    <a href="EliminarPregunta.pre?$preguntaId=${pregunta.id}">borrar</a>
                    </p>
                    <div>
                        <h4>Opciones: </h4>
                        <c:forEach var="opciones" items="${pregunta.respuestas}">
                            <p>
                                ${opciones.descripcion}
                            </p>
                            <c:if test="${opciones.correcta eq 1}">
                                <input type="radio" checked="checked" contenteditable="false"/>
                            </c:if>
                            <c:if test="${opciones.correcta eq 0}">
                                <input type="radio"  contenteditable="false"/>
                            </c:if>
                            <p>
                            <a href="EditarPregunta.pre?$preguntaId=${opciones.id}">Editar</a>
                            <a href="EliminarPregunta.pre?$preguntaId=${opciones.id}">borrar</a>
                            </p>
                        </c:forEach>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
</html>
