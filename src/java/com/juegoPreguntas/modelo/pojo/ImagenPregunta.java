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
@Entity(name = "Imagen_pregunta")
public class ImagenPregunta {
   @Id
   private int id;
   private String ruta;
   @Column(name = "id_pregunta")
   @ManyToOne()
   private Pregunta pregunta;
   
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
