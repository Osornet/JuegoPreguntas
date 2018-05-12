/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.RespuestaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;

/**
 *
 * @author JAVIER
 */
public class PruebaJavier {
    
    public static void main(String[] args) {

        RespuestaDAOImp daores = new RespuestaDAOImp();
        Respuesta r = new Respuesta(); 
        Pregunta pregunta = new Pregunta();
        pregunta.setId(1);
        r.setDescripcion("Respuesta correcta");
        r.setCorrecta((byte)1);
        r.setPregunta(pregunta);
        daores.insertar(r);
        

    }
}
