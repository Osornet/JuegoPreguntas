/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos.hibernate;

import com.juegoPreguntas.modelo.persistencia.daos.RespuestaDAO;
import com.juegoPreguntas.modelo.pojo.Pregunta;
import com.juegoPreguntas.modelo.pojo.Respuesta;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author osorn
 */
public class RespuestaDAOImp implements RespuestaDAO{

    private SessionFactory factoria = null;
    private Session session = null;
    
    @Override
    public void abrirSession() {
        if (factoria == null) {
            factoria = HibernateHelper.getSessionfactory();
            if (this.session == null) 
                this.session = this.factoria.openSession();
        }
    }

    @Override
    public void cerrarSession() {
        if (session != null) {
            session.close();
            if(factoria != null)
                factoria.close();
        }
    }
    
    @Override
    public void insertar(Respuesta respuesta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.save(respuesta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
           this.cerrarSession();
        }            
    }

    @Override
    public void Editar(Respuesta respuesta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.update(respuesta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }

    @Override
    public void Eliminar(Respuesta respuesta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.delete(respuesta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }
    //Obtiene una respuesta.
    @Override
    public Respuesta obtenerRespuesta(int id) {
        Respuesta respuesta = null;
        try{
        this.abrirSession();
        respuesta = (Respuesta)this.session.get(Respuesta.class, id);
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return respuesta;
    }
    //Obtiene todas las respuestas de todas las preguntas.
    @Override
    public List<Respuesta> listarTodasRespuestas() {
        List<Respuesta> listaDeRespuestas = null;
        String consultaString = "from Respuesta res";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        listaDeRespuestas = consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDeRespuestas;
    }
    //Obtiene todas las respuestas de una pregunta.
    @Override
    public List<Respuesta> listarPorPregunta(Pregunta pregunta) {
        int id = pregunta.getId();
        List<Respuesta> listaDeRespuestas = null;        
        try{
        this.abrirSession();
        String consultaString = "from Respuesta respuesta where respuesta.pregunta_id=:id";
        Query consulta = this.session.createQuery(consultaString);
        consulta.setInteger("id", id);
        listaDeRespuestas = consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDeRespuestas;
    }
}
