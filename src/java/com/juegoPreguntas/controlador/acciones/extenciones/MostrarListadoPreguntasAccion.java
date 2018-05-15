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
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class MostrarListadoPreguntasAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        PreguntaDAO preguntaDAO = new PreguntaDAOImp(); 
        List<Pregunta> listaDePreguntas = preguntaDAO.listarTodos();
        request.getSession().setAttribute("listaDePreguntas", listaDePreguntas);
        return "MostrarPreguntas.jsp";
    }

    
}
