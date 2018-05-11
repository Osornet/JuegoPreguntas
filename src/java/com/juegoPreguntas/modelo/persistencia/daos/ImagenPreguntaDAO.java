/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.pojo.ImagenPregunta;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface ImagenPreguntaDAO {
    public void abrirSession();
    public void cerrarSession();
    public void insertar(ImagenPregunta imagenPregunta);
    public void Editar(ImagenPregunta imagenPregunta);
    public void Eliminar(ImagenPregunta imagenPregunta);
    public ImagenPregunta obtenerPorClave(ImagenPregunta imagenPregunta);
    public List<ImagenPregunta> listarTodos();
    public List<ImagenPregunta> listarPorPregunta(Pregunta pregunta);
}
