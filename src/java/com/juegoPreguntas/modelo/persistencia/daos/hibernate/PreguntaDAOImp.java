/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos.hibernate;

import com.juegoPreguntas.modelo.persistencia.daos.PreguntaDAO;
import com.juegoPreguntas.modelo.pojo.Pregunta;
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
public class PreguntaDAOImp implements PreguntaDAO {

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
    public void insertar(Pregunta pregunta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.save(pregunta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }

    @Override
    public void Editar(Pregunta pregunta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.update(pregunta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }

    @Override
    public void Eliminar(Pregunta pregunta) {
        Transaction transaccion = null;
        try{
        this.abrirSession();
        transaccion = this.session.beginTransaction();
        
        this.session.delete(pregunta);
        
        transaccion.commit();
        }catch(HibernateException e){
          System.out.println(e.getMessage());
          if(transaccion != null)
            transaccion.rollback();
          this.cerrarSession();
        }
    }
    //Obtiene una pregunta
    @Override
    public Pregunta obtenerPorClave(int id) {
        Pregunta pregunta = null;
        try{
        this.abrirSession();
        pregunta = (Pregunta)this.session.get(Pregunta.class, id);
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return pregunta;
    }
    //Hacer metodo para generar un registro aleatorio
    
    @Override
    public Pregunta seleccionarPreguntarAleatoria(){
        Pregunta pregunta = null;
        String consultaString = "from Pregunta pre order by rand()";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        consulta.setMaxResults(1);
        pregunta =(Pregunta)consulta.list().get(0);
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return pregunta;
    }
    //Llamar desde ese metodo a obtenerporclave y retornar la pregunta
    
    
    //Obtiene todas las preguntas
    @Override
    public List<Pregunta> listarTodos() {
        List<Pregunta> listaDePreguntas = null;
        String consultaString = "from Pregunta pre";
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
    // metodo para tener un puñado de preguntas aleatorias de acuerdo a los parametros
    @Override
    public List<Pregunta> seleccionarPreguntasAleatorias(int numeroPreguntas) {
        List<Pregunta> listaDePreguntas = null;
        String consultaString = "from Pregunta pre order by rand()";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        consulta.setMaxResults(numeroPreguntas);
        listaDePreguntas =(List<Pregunta>)consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDePreguntas;
    }

    @Override
    public List<Pregunta> seleccionarPreguntasPorNivel(int nivel) {
        List<Pregunta> listaDePreguntas = null;
        String consultaString = "from Pregunta pre where nivel=:nivel order by rand()";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        consulta.setInteger("nivel", nivel);
        listaDePreguntas =(List<Pregunta>)consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDePreguntas;
    }

    @Override
    public List<Pregunta> seleccionarPreguntasPorNivel(int nivel, int numeroPreguntas) {
         List<Pregunta> listaDePreguntas = null;
        String consultaString = "from Pregunta pre where nivel=:nivel order by rand()";
        try{
        this.abrirSession();
        Query consulta = this.session.createQuery(consultaString);
        consulta.setInteger("nivel", nivel);
        consulta.setMaxResults(numeroPreguntas);
        listaDePreguntas =(List<Pregunta>)consulta.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            this.cerrarSession();
        }
        return listaDePreguntas;
    }

   

}
