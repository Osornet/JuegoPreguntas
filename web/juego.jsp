<%-- 
    Document   : juego
    Created on : 22/05/2018, 06:44:17 PM
    Author     : JAVIER
--%>

<link href="CSS/materialize/css/materialize.min.css" rel="stylesheet" type="text/css"/>
<link href="CSS/palette.css" rel="stylesheet" type="text/css"/>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,700" rel="stylesheet">
<link href="CSS/juego.css" rel="stylesheet" type="text/css"/>
<script src="JS/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="JS/sweetalert2.all.min.js" type="text/javascript"></script>
<script src="JS/Preguntas.js" type="text/javascript"></script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUEGO PREGUNTAS</title>
    </head>
    <body id="fondo">

        <!--Valida si cambio de nivel el jugador anterior que respondio para mostrar
            Alerta-->


        <input id="nivel" name="nivel" type="hidden" value="<c:out value='${sessionScope.cambioNivel}'/>"/>


        <div class="row center-align">
            <div class="col m4 s4">
                <h2 class="white-text default-primary-color" style="border-radius: 15px">PREGUNTAS</h2>
                <div class="card">
                    <div class="card-image">
                        <img src="<c:out value="${sessionScope.preguntaActual.rutaImagen}"/>" alt=""/>
                        <span class="card-title black-text"></span>
                    </div>
                    <form action="Siguiente.pre" id="responder" method="POST">
                        <input id="enviodado" name="numeroDado" type="hidden"/>

                        <div class="card-content" style="padding: 0px 24px 0px 24px;">
                            <h5><c:out value="${sessionScope.juego.jugadorActual.preguntaActual.descripcion}"/></h5>
                            <br>

                            <div class="row center-align" style="margin-bottom: 0px;"> 
                                <div class="col m4 s4">                 
                                    <label>
                                        <input name="respuesta" type="radio" value="1" checked />
                                        <span>A.</span>
                                    </label>
                                </div>
                                <div class="col m4 s4">                 
                                    <label>
                                        <input name="respuesta" type="radio" value="2"/>
                                        <span>B.</span>
                                    </label>
                                </div>
                                <div class="col m4 s4">                 
                                    <label>
                                        <input name="respuesta" type="radio" value="3"/>
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
                                    <img src="Imagenes/preguntas/imagen transparente.png" alt=""/>
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
                            <button id="enviar" class="btn-large waves-effect accent-color" disabled><h5><strong>RESPONDER</strong></h5></button>
                        </div>
                    </form>


                    <input id="res" name="res" type="hidden" value="${sessionScope.mensaje}"/>
                </div>

            </div>
            <div class="col m3 s3">
                <h2 class="white-text default-primary-color" style="border-radius: 15px">TURNO</h2>
                <div class="card-panel accent-color" style="border-radius: 15px; padding: 0px;">
                    <span>
                        <h3 class="white-text"><c:out value="${sessionScope.juego.jugadorActual.nombre}"/></h3>
                    </span>

                    <h3 class="white-text"><c:out value="Nivel ${sessionScope.juego.jugadorActual.nivel}"/></h3>

                </div><br>
                <!-- <button class="btn-large black-text yellow" id="dado"><i class="material-icons right" id="dado">sentiment_very_satisfied</i><strong>LANZAR DADO</strong></button> -->
                <button class="btn-large waves-effect yellow black-text" id="dado"><h5><strong>LANZAR DADO</strong></h5></button>
                <br><br>
                <div>
                    <img src="" id="imagendado" alt=""/>
                    <span>
                        <h2 class="white-text" id="numero" value=""></h2>
                    </span>
                </div>
            </div>
            <div class="col m5 s5">
                <h2 class="white-text default-primary-color" style="border-radius: 15px">POSICIONES</h2>

                <table class="striped centered" style="background-color: white">
                    <thead>
                        <tr> 
                            <th>POSICIÓN</th>
                            <th>JUGADOR</th>                               
                            <th>CASILLA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var="x" value="${1}"/>
                        <c:forEach var ="jugador" items = "${sessionScope.juego.listaDeJugadores}">
                            <tr>
                                <td><c:out value="${x}"/></td><td><c:out value="${jugador.nombre}"/></td><td>${jugador.posicion}</td>
                            </tr>
                            <c:set var="x" value="${x+1}"/>
                        </c:forEach>
                    </tbody>
                </table><br><br>
                <div class="row"> 
                    <div class="col m4 s4">
                        <!--<img src="Imagenes/tablero.png" alt=""/>
                        <input type="hidden" id="res" value=""/>-->
                        <c:set var="i" value="${0}"/>
                        <c:forEach var="jugador" items="${sessionScope.juego.listaDeJugadores}">
                            <input type="hidden" id="nombre${i}" value="${jugador.nombre}"/> 
                            <input type="hidden" id="posicion${i}" value="${jugador.posicion}"/>
                            <c:set var="i" value="${i+1}"/>
                        </c:forEach>
                        <input type="hidden" id="tope" value="${i}"/>     

                        <table id="tablero" class="celdastablero">
                            <tbody>
                                <tr>
                                    <td class="celdastablero nivel1" id="p1">1<br></td>
                                    <td class="celdastablero nivel1" id="p2">2<br></td>
                                    <td class="celdastablero nivel1" id="p3">3<br></td>
                                    <td class="celdastablero nivel1" id="p4">4<br></td>
                                    <td class="celdastablero nivel1" id="p5">5<br></td>
                                    <td class="celdastablero nivel1" id="p6">6<br></td>
                                    <td class="celdastablero nivel1" id="p7">7<br></td>
                                    <td class="celdastablero nivel1" id="p8">8<br></td>
                                    <td class="celdastablero nivel1" id="p9">9<br></td>
                                    <td class="celdastablero nivel1" id="p10">10<br></td>
                                </tr>
                                <tr>
                                    <td class="celdastablero nivel1" id="p11">11<br></td>
                                    <td class="celdastablero nivel1" id="p12">12<br></td>
                                    <td class="celdastablero nivel1" id="p13">13<br></td>
                                    <td class="celdastablero nivel1" id="p14">14<br></td>
                                    <td class="celdastablero nivel1" id="p15">15<br></td>
                                    <td class="celdastablero nivel2" id="p16">16<br></td>
                                    <td class="celdastablero nivel2" id="p17">17<br></td>
                                    <td class="celdastablero nivel2" id="p18">18<br></td>
                                    <td class="celdastablero nivel2" id="p19">19<br></td>
                                    <td class="celdastablero nivel2" id="p20">20<br></td>
                                </tr>
                                <tr>
                                    <td class="celdastablero nivel2" id="p21">21<br></td>
                                    <td class="celdastablero nivel2" id="p22">22<br></td>
                                    <td class="celdastablero nivel2" id="p23">23<br></td>
                                    <td class="celdastablero nivel2" id="p24">24<br></td>
                                    <td class="celdastablero nivel2" id="p25">25<br></td>
                                    <td class="celdastablero nivel2" id="p26">26<br></td>
                                    <td class="celdastablero nivel2" id="p27">27<br></td>
                                    <td class="celdastablero nivel2" id="p28">28<br></td>
                                    <td class="celdastablero nivel2" id="p29">29<br></td>
                                    <td class="celdastablero nivel2" id="p30">30<br></td>
                                </tr>
                                <tr>
                                    <td class="celdastablero nivel3" id="p31">31<br></td>
                                    <td class="celdastablero nivel3" id="p32">32<br></td>
                                    <td class="celdastablero nivel3" id="p33">33<br></td>
                                    <td class="celdastablero nivel3" id="p34">34<br></td>
                                    <td class="celdastablero nivel3" id="p35">35<br></td>
                                    <td class="celdastablero nivel3" id="p36">36<br></td>
                                    <td class="celdastablero nivel3" id="p37">37<br></td>
                                    <td class="celdastablero nivel3" id="p38">38<br></td>
                                    <td class="celdastablero nivel3" id="p39">39<br></td>
                                    <td class="celdastablero nivel3" id="p40">40<br></td>
                                </tr>
                                <tr>
                                    <td class="celdastablero nivel3" id="p41">41<br></td>
                                    <td class="celdastablero nivel3" id="p42">42<br></td>
                                    <td class="celdastablero nivel3" id="p43">43<br></td>
                                    <td class="celdastablero nivel3" id="p44">44<br></td>
                                    <td class="celdastablero nivel3" id="p45">45<br></td>
                                    <td class="celdastablero nivel4" id="p46">46<br></td>
                                    <td class="celdastablero nivel4" id="p47">47<br></td>
                                    <td class="celdastablero nivel4" id="p48">48<br></td>
                                    <td class="celdastablero nivel4" id="p49">49<br></td>
                                    <td class="celdastablero nivel4" id="p50">50<br></td>
                                </tr>
                                <tr>
                                    <td class="celdastablero nivel4" id="p51">51<br></td>
                                    <td class="celdastablero nivel4" id="p52">52<br></td>
                                    <td class="celdastablero nivel4" id="p53">53<br></td>
                                    <td class="celdastablero nivel4" id="p54">54<br></td>
                                    <td class="celdastablero nivel4" id="p55">55<br></td>
                                    <td class="celdastablero nivel4" id="p56">56<br></td>
                                    <td class="celdastablero nivel4" id="p57">57<br></td>
                                    <td class="celdastablero nivel4" id="p58">58<br></td>
                                    <td class="celdastablero nivel4" id="p59">59<br></td>
                                    <td class="celdastablero nivel4" id="p60">60<br></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                
                    <div class="col m12 s12">
                        <br>
                        <table class="striped centered" style="background-color: white">
                            <thead>
                                <tr> 
                                    <th>NIVEL 1</th>
                                    <th>NIVEL 2</th>  
                                    <th>NIVEL 3</th>
                                    <th>NIVEL 4</th> 
                                </tr>
                            </thead>
                            <tbody>
                                <tr>                                   
                                    <td class="nivel1">                                    
                                    </td>                               
                                    <td class="nivel2">                                    
                                    </td>                                
                                    <td class="nivel3">                                    
                                    </td>                                
                                    <td class="nivel4">                                     
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>                                
                
            </div>
        </div>
    </body>
</html>
