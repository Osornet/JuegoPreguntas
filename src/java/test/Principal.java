/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.*;
import com.juegoPreguntas.modelo.pojo.*;
import com.juegoPreguntas.modelo.persistencia.daos.hibernate.*;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author osorn
 */
public class Principal {

    public static void main(String[] args) {
        List<Jugador> listaDeJugadores = new ArrayList<Jugador>();
        Jugador j1 = new Jugador();
        j1.setNombre("Alejandro");
        Jugador j2 = new Jugador();
        j2.setNombre("Pedro");
        listaDeJugadores.add(j1);
        listaDeJugadores.add(j2);
        Juego juego = new Juego(listaDeJugadores);
        
        juego.CambiarTurno();
        System.out.println(juego.getJugadorActual().getNombre());
        juego.CambiarTurno();
        System.out.println(juego.getJugadorActual().getNombre());
        juego.CambiarTurno();
        System.out.println(juego.getJugadorActual().getNombre());
    }

}
