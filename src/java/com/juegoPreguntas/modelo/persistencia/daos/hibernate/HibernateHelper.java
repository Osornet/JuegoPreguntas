/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author osorn
 */
public class HibernateHelper {
    private static final SessionFactory sessionFactory = buildSessionFactory();


    
    private static SessionFactory buildSessionFactory(){
        try{
            return new Configuration().configure().buildSessionFactory();
        }
        catch(HibernateException e){
            System.out.println("Error creando una factoria de Session. "+e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * @return the sessionfactory
     */
    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }
}
