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
    private int turno;
    private List<Jugador> listaDeJugadores;
    private Jugador jugadorActual;
   
    
    
    
    public Juego (List<Jugador> listaDeJugadores){
        this.turno = 0;
        this.listaDeJugadores = listaDeJugadores;
        
    }
    public void CambiarTurno(){
        int numeroJugadores = this.listaDeJugadores.size();
        if(this.turno > (numeroJugadores-1))
            this.turno = 0;
        this.jugadorActual = this.listaDeJugadores.get(turno);
        
        this.turno++;
    }

    
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }

    public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
        this.listaDeJugadores = listaDeJugadores;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

}
