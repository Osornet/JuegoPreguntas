/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.PreguntaDAO;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.HibernateHelper;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.PreguntaDAOImp;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author osorn
 */
public class Principal {


    public static void main(String[] args) {
       
        PreguntaDAO preguntaDAO = new PreguntaDAOImp();
        
        Pregunta pre = preguntaDAO.seleccionarPreguntarAleatoria();
        
        System.out.println(pre.getDescripcion());
        
        preguntaDAO.cerrarSession();
        
        
        
    }


}
