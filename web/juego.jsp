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
                            <p><c:out value="${sessionScope.juego.jugadorActual.preguntaActual.descripcion}"/></p>
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
                            <th>JUGADOR</th>                               
                            <th>CASILLA</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var ="jugador" items = "${sessionScope.juego.listaDeJugadores}">
                            <tr>
                                <td><c:out value="${jugador.nombre}"/></td><td>${jugador.posicion}</td>
                            </tr>
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

                        <table id="tablero" style="">
                            <tbody>
                            <tr>
                                <td class="celdastablero" id="p1">1</td>
                                <td class="celdastablero" id="p2">2</td>
                                <td class="celdastablero" id="p3">3</td>
                                <td class="celdastablero" id="p4">4</td>
                                <td class="celdastablero" id="p5">5</td>
                                <td class="celdastablero" id="p6">6</td>
                                <td class="celdastablero" id="p7">7</td>
                                <td class="celdastablero" id="p8">8</td>
                                <td class="celdastablero" id="p9">9</td>
                                <td class="celdastablero" id="p10">10</td>
                            </tr>
                            <tr>
                                <td class="celdastablero" id="p11">11</td>
                                <td class="celdastablero" id="p12">12</td>
                                <td class="celdastablero" id="p13">13</td>
                                <td class="celdastablero" id="p14">14</td>
                                <td class="celdastablero" id="p15">15</td>
                                <td class="celdastablero" id="p16">16</td>
                                <td class="celdastablero" id="p17">17</td>
                                <td class="celdastablero" id="p18">18</td>
                                <td class="celdastablero" id="p19">19</td>
                                <td class="celdastablero" id="p20">20</td>
                            </tr>
                            <tr>
                                <td class="celdastablero" id="p21">21</td>
                                <td class="celdastablero" id="p22">22</td>
                                <td class="celdastablero" id="p23">23</td>
                                <td class="celdastablero" id="p24">24</td>
                                <td class="celdastablero" id="p25">25</td>
                                <td class="celdastablero" id="p26">26</td>
                                <td class="celdastablero" id="p27">27</td>
                                <td class="celdastablero" id="p28">28</td>
                                <td class="celdastablero" id="p29">29</td>
                                <td class="celdastablero" id="p30">30</td>
                            </tr>
                            <tr>
                                <td class="celdastablero" id="p31">31</td>
                                <td class="celdastablero" id="p32">32</td>
                                <td class="celdastablero" id="p33">33</td>
                                <td class="celdastablero" id="p34">34</td>
                                <td class="celdastablero" id="p35">35</td>
                                <td class="celdastablero" id="p36">36</td>
                                <td class="celdastablero" id="p37">37</td>
                                <td class="celdastablero" id="p38">38</td>
                                <td class="celdastablero" id="p39">39</td>
                                <td class="celdastablero" id="p40">40</td>
                            </tr>
                            <tr>
                                <td class="celdastablero" id="p41">41</td>
                                <td class="celdastablero" id="p42">42</td>
                                <td class="celdastablero" id="p43">43</td>
                                <td class="celdastablero" id="p44">44</td>
                                <td class="celdastablero" id="p45">45</td>
                                <td class="celdastablero" id="p46">46</td>
                                <td class="celdastablero" id="p47">47</td>
                                <td class="celdastablero" id="p48">48</td>
                                <td class="celdastablero" id="p49">49</td>
                                <td class="celdastablero" id="p50">50</td>
                            </tr>
                            <tr>
                                <td class="celdastablero" id="p51">51</td>
                                <td class="celdastablero" id="p52">52</td>
                                <td class="celdastablero" id="p53">53</td>
                                <td class="celdastablero" id="p54">54</td>
                                <td class="celdastablero" id="p55">55</td>
                                <td class="celdastablero" id="p56">56</td>
                                <td class="celdastablero" id="p57">57</td>
                                <td class="celdastablero" id="p58">58</td>
                                <td class="celdastablero" id="p59">59</td>
                                <td class="celdastablero" id="p60">60</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>

                </div>

            </div>
        </div>


    </body>
</html>
