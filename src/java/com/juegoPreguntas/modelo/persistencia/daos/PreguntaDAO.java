/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.pojo.Pregunta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface PreguntaDAO {

    public void insertar(Pregunta pregunta);
    public void Editar(int id);
    public void Eliminar(int id);
    public Pregunta obtenerPorClave(int id);
    public List<Pregunta> listarTodos();
    
    
}
