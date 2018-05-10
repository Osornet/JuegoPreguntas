/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author osorn
 */
@Entity
public class Respuesta {
    @Id
    private int id;
    private String descripcion;
    private byte correcta;
    @Column(name = "id_pregunta")
    @ManyToOne()
    private Pregunta pregunta;
    
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
    
}
