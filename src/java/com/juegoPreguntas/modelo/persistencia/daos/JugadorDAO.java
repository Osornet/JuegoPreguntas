/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juegoPreguntas.modelo.persistencia.daos;

import com.juegoPreguntas.modelo.pojo.Jugador;
import java.util.List;

/**
 *
 * @author osorn
 */
public interface JugadorDAO {
    public void abrirSession();
    public void cerrarSession();
    public void insertar(Jugador jugador);
    public void Editar(Jugador jugador);
    public void Eliminar(Jugador jugador);
    public Jugador obtenerPorClave(int id);
    public List<Jugador> listarTodos();
}
