/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;

/**
 *
 * @author JAVIER
 */
public class PruebaJavier {
    
    public static void main(String[] args) {

        PreguntaDAOImp pre = new PreguntaDAOImp();
        Pregunta p = new Pregunta();    
        p.setId(1);
        p.setDescripcion("Pregunta 1");
        pre.insertar(p);
        

    }
}
