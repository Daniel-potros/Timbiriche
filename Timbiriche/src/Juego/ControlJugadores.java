/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.ArrayList;

/**
 *
 * @author Daniel Rojas
 */
public class ControlJugadores {
    static ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public String obtenerNombre(int numero) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (i == numero) {
                return jugadores.get(i).getNombre();
            }
        }
        return null;
    }
    
        return null;
    }
    
    

