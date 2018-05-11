/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author osorn
 */
@Entity
@Table(name = "respuesta")
public class Respuesta implements Serializable{
    @Id
    private int id;
    private String descripcion;
    private byte correcta;
    @ManyToOne
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;

    public Respuesta() {
    }

    public Respuesta(int id) {
        this.id = id;
    }

    public Respuesta(int id, String descripcion, byte correcta, Pregunta pregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.correcta = correcta;
        this.pregunta = pregunta;
    }
    
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCorrecta(byte correcta) {
        this.correcta = correcta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    
    //GETTERS

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public byte getCorrecta() {
        return correcta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }
    
    //HASH Y EQUALS

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
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
        final Respuesta other = (Respuesta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
