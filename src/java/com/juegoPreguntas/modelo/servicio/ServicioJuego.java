/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.servicio;

import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface ServicioJuego {
    
    public List<Pregunta> mostrarPreguntas();
    
    public List<Respuesta> mostrarRespuesta();
    
    public Respuesta mostrarRespuestaCorrecta();
    
    
}
