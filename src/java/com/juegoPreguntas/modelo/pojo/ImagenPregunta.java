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
@Table(name = "imagen_pregunta")
public class ImagenPregunta implements Serializable{
   @Id
   private int id;
   private String ruta;
   @ManyToOne
   @JoinColumn(name = "id_pregunta")
   private Pregunta pregunta;

    public ImagenPregunta() {
    }
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
   
    //GETTERS

    public int getId() {
        return id;
    }

    public String getRuta() {
        return ruta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }
    
    
   
}
