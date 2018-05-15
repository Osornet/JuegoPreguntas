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
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author osorn
 */
public class InsertarPreguntaAccion extends Accion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String preguntaDescripcion = request.getParameter("pregunta");
        String[] opciones = request.getParameterValues("opciones");
        int  PosicionCorrecta = Integer.parseInt(request.getParameter("correcta"));
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        Pregunta pregunta = new Pregunta(preguntaDescripcion);
        List<Respuesta> listaDeRespuestas = new ArrayList<Respuesta>();
        
        int aux = 1;
        for(String opcion : opciones){
            Respuesta respuesta = new Respuesta(opcion, 0);
            if(aux == PosicionCorrecta)
                respuesta.setCorrecta(1);
            
            listaDeRespuestas.add(respuesta);
            aux++;
        }
        pregunta.setRespuestas(listaDeRespuestas);
        
        preguntaDAO.insertar(pregunta);
        preguntaDAO.cerrarSession();
        
        return "Preguntas.jsp?accionDevuelta=insercion";
        
        
        
    }
    
}
