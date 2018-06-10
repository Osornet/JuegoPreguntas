/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.controlador.acciones;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GABY
 */
public abstract class Accion {
    
       
    public static Accion getInstance(String urlServlet){
        //extraigo el nombre de la accion
        String nombreAccion = null;
            if(urlServlet.startsWith("/administracion/"))
                nombreAccion = urlServlet.substring(16, urlServlet.length()-4);
            else
                nombreAccion = urlServlet.substring(1, urlServlet.length()-4);
         
        String nombreClaseFull = "com.juegoPreguntas.controlador.acciones.extenciones."+nombreAccion+"Accion";
        Accion accion = null;
        
        try {
            accion = (Accion)Class.forName(nombreClaseFull).newInstance();
        } catch (InstantiationException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return accion;
    }
    
    public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);
}
