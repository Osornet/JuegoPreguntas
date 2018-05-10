/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author osorn
 */
@Entity
public class Pregunta {
    @Id
    private int id;
    private String descripcion;
    @OneToMany
    private List<Respuesta> Respuestas; 
    @OneToMany
    private List<ImagenPregunta> imgagenes;
    
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRespuestas(List<Respuesta> Respuestas) {
        this.Respuestas = Respuestas;
    }

    public void setImgagenes(List<ImagenPregunta> imgagenes) {
        this.imgagenes = imgagenes;
    }
    
    //GETTERS

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Respuesta> getRespuestas() {
        return Respuestas;
    }

    public List<ImagenPregunta> getImgagenes() {
        return imgagenes;
    }
    
}
