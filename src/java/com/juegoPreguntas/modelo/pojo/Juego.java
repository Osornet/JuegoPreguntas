/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import com.juegoPreguntas.modelo.persistencia.daos.PreguntaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import java.util.List;

/**
 *
 * @author osorn
 */
public class Juego {
    private int turno;
    private List<Jugador> listaDeJugadores;
    private Jugador jugadorActual;
    private List<Pregunta> listaDePreguntas;
    private Pregunta preguntaActual;
    
    
    
    public Juego (List<Jugador> listaDeJugadores){
        this.turno = 0;
        this.listaDeJugadores = listaDeJugadores;
        
    }
    public void CambiarTurno(){
        int numeroJugadores = this.listaDeJugadores.size();
        if(this.turno > (numeroJugadores-1))
            this.turno = 0;
        this.jugadorActual = this.listaDeJugadores.get(turno);
        this.preguntaActual = this.listaDePreguntas.remove(0);
        this.turno++;
    }

    public void subirNivelPreguntas(int nivel) {
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        this.listaDePreguntas = preguntaDAO.seleccionarPreguntasPorNivel(nivel);
        preguntaDAO.cerrarSession();
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

    public List<Pregunta> getListaDePreguntas() {
        return listaDePreguntas;
    }

    public void setListaDePreguntas(List<Pregunta> listaDePreguntas) {
        this.listaDePreguntas = listaDePreguntas;
    }

    public Pregunta getPreguntaActual() {
        return preguntaActual;
    }

    public void setPreguntaActual(Pregunta preguntaActual) {
        this.preguntaActual = preguntaActual;
    }

    
    
    
}
