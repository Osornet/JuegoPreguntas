/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.pojo.Juego;
import com.juegoPreguntas.modelo.pojo.Jugador;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class CargarJuegoAccion extends Accion {

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        //Guardado de Jugadores

        String[] nombreJugadores = request.getParameterValues("jugadores");
        System.out.println("LLEGO");
        for(String nombre: nombreJugadores)
        System.out.println(nombre);
        List<Jugador> listaDeJugadores = new ArrayList<Jugador>();
        for (String nombre : nombreJugadores) {
            Jugador jugador = new Jugador();
            jugador.setNombre(nombre);
            listaDeJugadores.add(jugador);
        }
        
        Juego juego = new Juego(listaDeJugadores);
        juego.CambiarTurno();
        request.getSession().setAttribute("juego", juego);
        request.getSession().setAttribute("preguntaActual", juego.getJugadorActual().getPreguntaActual());
        request.getSession().setAttribute("mensaje", "");
        System.out.println("El mensaje de respuesta es: "+request.getSession().getAttribute("mensaje"));
        
        //request.setAttribute("cambioNivel", "no");
        
        return "juego.jsp";
    }

}
