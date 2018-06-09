<%-- 
    Document   : MostrarPreguntas
    Created on : 15/05/2018, 01:01:05 AM
    Author     : JAVIER
--%>
<link href="../CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script src="../CSS/materialize/js/materialize.min.js" type="text/javascript"></script>
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
            <table class="striped centered" style="background-color: white">
                <thead>
                    <tr> 
                
                    <th>PREGUNTA</th>
                   
              
                  
              
                    <th>RESPUESTAS</th>
                    <th colspan="2">ACCIÓN</th>
              
          </tr>
        </thead>
        <tbody>
            <c:forEach var="pregunta" items="${sessionScope.listaDePreguntas}">
                  
        
                    <tr>
          
              <td>${pregunta.descripcion}</td>
              <td><a href="" class="btn-floating waves-effect green"><i class="material-icons center">format_list_bulleted</i></a></td>
            <td><a href="EditarPregunta.pre?preguntaId=${pregunta.id}" class="btn-floating waves-effect blue"><i class="material-icons center">create</i></a></td>
            <td><a href="EliminarPregunta.pre?preguntaId=${pregunta.id}" class="btn-floating waves-effect red"><i class="material-icons center">delete_forever</i></a></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
                    <!--
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
                    </div>-->
                </div>
            
        </body>
    
</html>
