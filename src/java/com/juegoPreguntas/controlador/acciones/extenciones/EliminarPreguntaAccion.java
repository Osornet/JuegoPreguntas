/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.persistencia.daos.PreguntaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class EliminarPreguntaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String preguntaId = request.getParameter("preguntaId");
        int id = Integer.parseInt(preguntaId);
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        Pregunta pregunta = new Pregunta(id);
        preguntaDAO.Eliminar(pregunta);
        preguntaDAO.cerrarSession();
        
        
        return "MostrarListadoPreguntas.pre?accion=eliminar";
    }
    
}
