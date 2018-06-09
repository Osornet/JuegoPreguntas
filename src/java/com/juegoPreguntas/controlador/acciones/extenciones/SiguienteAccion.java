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
        if (preguntaActual.getRespuesta() == respuesta) {
            
            if (juego.getJugadorActual().setPosicion(juego.getJugadorActual().getPosicion() + numeroDado)) {
                return "victoria.jsp";
            }
            mensaje = "correcta";
        }
        
        request.getSession().setAttribute("mensaje", mensaje);       
        
        System.out.println("El mensaje de respuesta es: "+request.getSession().getAttribute("mensaje"));
        juego.CambiarTurno();
        String cambioNivel = null;
        if (nivelAnterior != juego.getJugadorActual().getNivel()) 
            cambioNivel = "!! "+juego.getJugadorActual().getNombre()+"\nHas alcanzado el nivel " + juego.getJugadorActual().getNivel()+" ¡¡";
        request.setAttribute("cambioNivel", cambioNivel);
        request.getSession().setAttribute("preguntaActual", juego.getJugadorActual().getPreguntaActual());
        
        
        return "juego.jsp";
    }

}
