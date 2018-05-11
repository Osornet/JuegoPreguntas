/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descripcion;
    
    @OneToMany(mappedBy = "pregunta")
    private List<Respuesta> respuestas;
    @OneToMany(mappedBy = "pregunta")
    private List<ImagenPregunta> imagenes;
    
    
    //CONSTRUCTORES

    public Pregunta() {
    }
            
    public Pregunta(int id) {
        this.id = id;
    }

    public Pregunta(String descripcion) {
        this.descripcion = descripcion;
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

    public void setImagenes(List<ImagenPregunta> imagenes) {
        this.imagenes = imagenes;
    }
       
    //GETTERS

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Respuesta> getRespuestas() {
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
