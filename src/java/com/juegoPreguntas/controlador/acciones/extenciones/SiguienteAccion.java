/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.persistencia.daos.RespuestaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.RespuestaDAOImp;
import com.juegoPreguntas.modelo.pojo.Juego;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class SiguienteAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        int idRespuesta = Integer.parseInt(request.getParameter("idRespuesta"));
        int numeroDado = Integer.parseInt(request.getParameter("numeroDado"));
        Respuesta respuesta = null;
        RespuestaDAO respuestaDao = new RespuestaDAOImp();
        respuesta = respuestaDao.obtenerRespuesta(idRespuesta);
        respuestaDao.cerrarSession();
        
        Juego juego = (Juego)request.getSession().getAttribute("juego");
        String mensaje = "has fallado";
        if(respuesta.getCorrecta()==1){
            if(juego.getJugadorActual().setPosicion(juego.getJugadorActual().getPosicion()+numeroDado)){
                return "Victoria.jsp";
            }
           mensaje = "Has contestado Bien";
        }
         request.getSession().setAttribute("mensaje", mensaje);
        juego.CambiarTurno();
        
             
           
        
        
        return "ejemplo.jsp";        
    }
    
}
