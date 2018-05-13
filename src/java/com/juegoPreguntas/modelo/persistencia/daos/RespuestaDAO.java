/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface RespuestaDAO {
    public void abrirSession();
    public void cerrarSession();
    public void insertar(Respuesta respuesta);
    public void Editar(Respuesta respuesta);
    public void Eliminar(Respuesta respuesta);
    public Respuesta obtenerRespuesta(int id);
    public List<Respuesta> listarTodasRespuestas();
    public List<Respuesta> listarPorPregunta(Pregunta pregunta);
    
}