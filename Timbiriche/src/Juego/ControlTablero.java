/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import ObjetosTimbiriche.Jugador;
import ObjetosTimbiriche.Puntuacion;
import ObjetosTimbiriche.Tablero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Rojas
 */
public class ControlTablero {
    
    Tablero tablero;
    
    public ControlTablero(int tamaño) {
        this.tablero = new Tablero(tamaño);
    }
    
    public void agregarJugador(Jugador jugador ) {
        try {
            tablero.agregarJugador(jugador);
        } catch (Exception ex) {
            Logger.getLogger(ControlTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int obtenerPuntaje (Jugador jugador) {
        Puntuacion puntuacion = tablero.obtenerPuntuacion(jugador);
        return puntuacion.getPuntaje();
    }
    
    public void eliminarJugador(Jugador jugador) {
        tablero.eliminarJugador(jugador);
    }
    
    public void agregarPuntaje(Jugador jugador) {
        Puntuacion puntuacion = tablero.obtenerPuntuacion(jugador);
        puntuacion.setPuntaje(puntuacion.getPuntaje()+1);
        tablero.cambiarPuntuacion(puntuacion);
    }
    
    
    
}
