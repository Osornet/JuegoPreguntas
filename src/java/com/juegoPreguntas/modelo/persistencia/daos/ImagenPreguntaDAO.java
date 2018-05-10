/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.pojo.ImagenPregunta;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface ImagenPreguntaDAO {
    public void insertar(ImagenPregunta imagenPregunta);
    public void Editar(int id);
    public void Eliminar(int id);
    public ImagenPregunta obtenerPorClave(int id);
    public List<ImagenPregunta> listarTodos();
    public List<ImagenPregunta> listarPorPregunta(Pregunta pregunta);
}
