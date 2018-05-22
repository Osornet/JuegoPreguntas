/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author osorn
 */
@Entity
@Table(name = "jugador")
public class Jugador {
    @Id
    private int cod;
    private String nombre;
    private int puntaje;
    //CONSTRUCTORES

    public Jugador() {
    }

    public Jugador(int cod) {
        this.cod = cod;
    }

    public Jugador(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }
  
    
    //GETTERS AND SETTERS

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    //HASHCODE AND EQUALS

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.cod;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }
    
}
