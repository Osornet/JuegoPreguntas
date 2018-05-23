/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.util.List;

/**
 *
 * @author osorn
 */
public class Juego {
    private List<Jugador> jugadores;
    private int cantidadJugadores;
    private List<Pregunta> preguntas;
    private int turno;
    private int preguntaIndex;

    public Juego(List<Jugador> jugadores, int cantidadJugadores, List<Pregunta> preguntas) {
        this.jugadores = jugadores;
        this.cantidadJugadores = cantidadJugadores;
        this.preguntas = preguntas;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }
    
    public int cambioDeTurno(){
        this.turno++;
        this.preguntaIndex++;
        if(turno % (cantidadJugadores-1)> 0){
            this.turno = 0;
        }
        return this.turno;
    }
    
    public Jugador JugadorActual(){
        return jugadores.get(turno);
    }
    public Pregunta preguntaActual(){
        return preguntas.get(preguntaIndex++);
    }
    
    
    
    
    
    
}
