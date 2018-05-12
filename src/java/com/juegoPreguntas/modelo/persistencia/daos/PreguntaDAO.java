/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.persistencia.daos.hibernate.HibernateHelper;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface PreguntaDAO {

    public void abrirSession();
    public void cerrarSession();
    public void insertar(Pregunta pregunta);
    public void Editar(Pregunta pregunta);
    public void Eliminar(Pregunta pregunta);
    public Pregunta obtenerPorClave(int id);
    public Pregunta seleccionarPreguntarAleatoria();
    public List<Pregunta> listarTodos();
    
    
}
