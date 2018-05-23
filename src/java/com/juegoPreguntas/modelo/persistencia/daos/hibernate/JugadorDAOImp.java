/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos.hibernate;

import com.juegoPreguntas.modelo.persistencia.daos.JugadorDAO;
import com.juegoPreguntas.modelo.pojo.Jugador;
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
public class JugadorDAOImp implements JugadorDAO{

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
    public void insertar(Jugador jugador) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.save(jugador);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }

    @Override
    public void Editar(Jugador jugador) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.update(jugador);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }

    @Override
    public void Eliminar(Jugador jugador) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.delete(jugador);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }
   
    @Override
    public Jugador obtenerPorClave(int id) {
        Jugador jugador = null;
        try{
        this.abrirSession();
        jugador = (Jugador)this.session.get(Jugador.class, id);
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return jugador;
    }
           
    @Override
    public List<Jugador> listarTodos() {
        List<Jugador> listaDePreguntas = null;
        String consultaString = "from Jugador jugador";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        listaDePreguntas = consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDePreguntas;
    }
     

}
