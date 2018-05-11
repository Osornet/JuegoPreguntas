/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
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
        SessionFactory factoria = new Configuration().configure().buildSessionFactory();
        Session session = factoria.openSession();
        Transaction transaccion = session.beginTransaction();
       
        Pregunta pre = (Pregunta)session.get(Pregunta.class, 1);
        
        for(Respuesta resp: pre.getRespuestas())
            System.out.println(resp.getDescripcion());
        
        
        transaccion.commit();
        session.close();
        factoria.close();
        
        
        
    }

}
