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
public class SalvarPreguntaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        int preguntaId = Integer.parseInt(request.getParameter("preguntaId"));
        String preguntaDescripcion = request.getParameter("preguntaDescripcion");
        
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        Pregunta pregunta = preguntaDAO.obtenerPorClave(preguntaId);
        pregunta.setDescripcion(preguntaDescripcion);
        preguntaDAO.Editar(pregunta);
        preguntaDAO.cerrarSession();
        return "MostrarListadoPreguntas.pre";
    }
    
}
