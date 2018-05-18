/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones.extenciones;

import com.juegoPreguntas.controlador.acciones.Accion;
import com.juegoPreguntas.modelo.persistencia.daos.RespuestaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.RespuestaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osorn
 */
public class InsertarRespuestaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        int preguntaId = Integer.parseInt(request.getParameter("preguntaId"));
        String descripcion = request.getParameter("descripcion");
        String correctaString = request.getParameter("correcta");
        int correcta = correctaString.equals("1")?1:0;
        
        RespuestaDAO respuestaDAO = new RespuestaDAOImp();
        Pregunta pregunta = new Pregunta(preguntaId);
        Respuesta respuesta = new Respuesta(descripcion,correcta,pregunta);
        if(correcta == 1){
            List<Respuesta> respuestas = respuestaDAO.listarPorPregunta(pregunta);
            for(Respuesta resp : respuestas){
                resp.setCorrecta(0);
                respuestaDAO.Editar(resp);
            }
        }
        respuestaDAO.insertar(respuesta);
              
        respuestaDAO.cerrarSession();
        
       return "FormularioEditarPregunta.pre?preguntaId="+preguntaId; 
    }
    
}
