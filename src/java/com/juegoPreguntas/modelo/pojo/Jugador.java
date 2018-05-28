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

public class Jugador {
    
    private String nombre;
    private int posicion;
    private List<Pregunta> preguntas;
    private Pregunta preguntaActual;
    //CONSTRUCTORES

    public Jugador() {
        this.cargarPreguntas(1);
    }

     
    
    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Pregunta getPreguntaActual() {
        return this.preguntas.remove(0);
    }

    public void setPreguntaActual(Pregunta preguntaActual) {
        this.preguntaActual = preguntaActual;
    }

   
       
    public void cargarPreguntas(int nivel){
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        this.preguntas = preguntaDAO.seleccionarPreguntasPorNivel(nivel, 15);
        preguntaDAO.cerrarSession();
    }
   
}
