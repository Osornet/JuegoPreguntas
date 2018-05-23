/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.*;
import com.juegoPreguntas.modelo.pojo.*;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.*;

import java.util.List;


/**
 *
 * @author osorn
 */
public class Principal {


    public static void main(String[] args) {
       JugadorDAO jugadorDAO = new JugadorDAOImp();
       Jugador jugador = jugadorDAO.obtenerPorClave(28);
       jugador.setPuntaje(20);
       jugadorDAO.Editar(jugador);
       jugadorDAO.cerrarSession();
    }


}
