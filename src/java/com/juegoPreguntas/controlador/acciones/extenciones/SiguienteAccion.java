/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.pojo.Juego;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GABY
 */
public class SiguienteAccion extends Accion {

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        int respuesta = Integer.parseInt(request.getParameter("respuesta"));
        int numeroDado = Integer.parseInt(request.getParameter("numeroDado"));

        Juego juego = (Juego) request.getSession().getAttribute("juego");
        int nivelAnterior = juego.getJugadorActual().getNivel();
        String mensaje = "incorrecta";
                       
        Pregunta preguntaActual = (Pregunta)request.getSession().getAttribute("preguntaActual");
       
        System.out.println("El jugador respondio: "+ respuesta);
        if (preguntaActual.getRespuesta() == respuesta) {
            mensaje = "correcta";            
            if (juego.getJugadorActual().setPosicion(juego.getJugadorActual().getPosicion() + numeroDado)) {
                return "victoria.jsp";
            }           
        }
        System.out.println("La respuesta es: "+mensaje);
        request.getSession().setAttribute("mensaje", mensaje);       
        
        String[] cambioNivel = new String[3];    
        cambioNivel[0] = "false";
        request.setAttribute("cambioNivel", cambioNivel[0]);
        if (nivelAnterior != juego.getJugadorActual().getNivel()) {
        cambioNivel[0] = "true";
        cambioNivel[1] = juego.getJugadorActual().getNombre();
        cambioNivel[2] = juego.getJugadorActual().getNivel()+"";
        request.setAttribute("cambioNivel", cambioNivel);
        System.out.println(cambioNivel[1]+" ! Haz subido al nivel: "+cambioNivel[2]);
        }
        
        juego.CambiarTurno();
        System.out.println("--------TURNO--------");
        System.out.println("Jugador: "+juego.getJugadorActual().getNombre()); 
     
        request.getSession().setAttribute("preguntaActual", juego.getJugadorActual().getPreguntaActual());
        
        Pregunta sigpre = (Pregunta)request.getSession().getAttribute("preguntaActual");
        System.out.println("La respuesta es: "+sigpre.getRespuesta());
        
        return "juego.jsp";
    }

}
