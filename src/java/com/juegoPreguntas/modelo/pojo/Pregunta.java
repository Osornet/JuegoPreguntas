/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descripcion;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    private int nivel;
    private int respuesta;
       
    
    //CONSTRUCTORES

    public Pregunta() {
    }
            
    public Pregunta(int id) {
        this.id = id;
    }

    public Pregunta(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }
    public Pregunta(String descripcion, String rutaImagen) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    public Pregunta(String descripcion, String rutaImagen, int nivel, int respuesta) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.nivel = nivel;
        this.respuesta = respuesta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
   
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
    //GETTERS

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public String getRutaImagen() {
        return rutaImagen;
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
