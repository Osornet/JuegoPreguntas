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
 * @author GABY
 */

public class Jugador implements Comparable<Jugador>{
    
    private String nombre;
    private int posicion;
    private List<Pregunta> preguntas;
    private Pregunta preguntaActual;
    private int nivel;
    //CONSTRUCTORES

    public Jugador() {
        this.setPosicion(0);
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

    public boolean setPosicion(int posicion) {
        this.posicion = posicion;
        if(this.posicion >=0 && this.posicion <=15 && this.nivel!=1){
            this.setNivel(1);
        }
        else if(this.posicion >=16 && this.posicion <=30 && this.nivel!=2){
            this.setNivel(2);
        }
        else if(this.posicion >=31 && this.posicion <=45 && this.nivel!=3){
            this.setNivel(3);
        }
        else if(this.posicion >=46 && this.posicion <=59 && this.nivel!=4){
            this.setNivel(4);
        }
        if(this.posicion >= 60){
            this.posicion = 60;
            return true;
        }    
        return false;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        this.cargarPreguntas(this.nivel);
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Pregunta getPreguntaActual() {
        this.preguntaActual = this.preguntas.remove(0);
        this.preguntas.add(this.preguntaActual);
        return this.preguntaActual;
    }

    public void setPreguntaActual(Pregunta preguntaActual) {
        this.preguntaActual = preguntaActual;
    }
 
       
    public void cargarPreguntas(int nivel){
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        
        if(nivel != 1)
        this.preguntas = preguntaDAO.seleccionarPreguntasPorNivel(nivel, 30);
        else if(nivel == 1)
        this.preguntas = preguntaDAO.seleccionarPreguntasPorNivel(nivel, 40);
        preguntaDAO.cerrarSession();
    }

    @Override
    public int compareTo(Jugador jugador) {
      return jugador.getPosicion()-this.posicion;
    }
   
}
