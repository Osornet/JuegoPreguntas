/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author osorn
 */
@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable{
    @Id
    private int id;
    private String descripcion;
    @OneToMany
    @JoinColumn(name = "id_pregunta")
    private List<Respuesta> respuestas; 
    @OneToMany
    @JoinColumn(name = "id_pregunta")
    private List<ImagenPregunta> imagenes;
    
    //CONSTRUCTORES

    public Pregunta() {
    }
            
    public Pregunta(int id) {
        this.id = id;
    }

    public Pregunta(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Pregunta(int id, String descripcion, List<Respuesta> Respuestas, List<ImagenPregunta> imagenes) {
        this.id = id;
        this.descripcion = descripcion;
        this.respuestas = Respuestas;
        this.imagenes = imagenes;
    }
  
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void setImgagenes(List<ImagenPregunta> imgagenes) {
        this.imagenes = imagenes;
    }
    
    //GETTERS

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Respuesta> getrespuestas() {
        return respuestas;
    }

    public List<ImagenPregunta> getImagenes() {
        return imagenes;
    }

    //HASHCODE and Equals 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Pregunta other = (Pregunta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
  
}
