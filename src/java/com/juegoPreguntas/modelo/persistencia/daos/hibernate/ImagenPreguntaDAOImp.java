/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos.hibernate;

import com.juegoPreguntas.modelo.persistencia.daos.ImagenPreguntaDAO;
import com.juegoPreguntas.modelo.pojo.ImagenPregunta;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import java.util.List;

/**
 *
 * @author osorn
 */
public class ImagenPreguntaDAOImp implements ImagenPreguntaDAO{

    @Override
    public void insertar(ImagenPregunta imagenPregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Editar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImagenPregunta obtenerPorClave(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImagenPregunta> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImagenPregunta> listarPorPregunta(Pregunta pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
