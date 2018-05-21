/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.persistencia.daos.PreguntaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.RespuestaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.RespuestaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author osorn
 */
public class FormularioEditarPreguntaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        int preguntaId = Integer.parseInt(request.getParameter("preguntaId"));
        
        
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        Pregunta pregunta = preguntaDAO.obtenerPorClave(preguntaId);
        request.getSession().setAttribute("pregunta", pregunta);
        preguntaDAO.cerrarSession();
        
        return "FormularioEditarPregunta.jsp";
    }
    
}
