/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class mostrarPreguntaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
              
        PreguntaDAOImp dao = new PreguntaDAOImp();
        Pregunta pregunta = dao.seleccionarPreguntarAleatoria();
        request.setAttribute("pregunta", pregunta);
        return "pregunta.jsp";
    }
    
}