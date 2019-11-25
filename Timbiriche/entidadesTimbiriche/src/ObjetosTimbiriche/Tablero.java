/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.util.ArrayList;

/**
 *
 * @author Daniel Rojas
 */
public class Tablero {
    private int tamaño;
    ArrayList<Puntuacion> puntuaciones = new ArrayList<Puntuacion>();
//    private JButton botonesHorizontales[][];
//    private JButton botonesVerticales[][];
    
    public Tablero(int tamaño) {
        this.tamaño = tamaño;
       
    }
    
    public Puntuacion obtenerPuntuacion(Jugador jugador) {
        for (Puntuacion puntuacion : puntuaciones) {
            if (puntuacion.getJugador().equals(jugador)) {
                return puntuacion;
            }
        }
        return null;
    }
    
    public void agregarJugador(Jugador jugador) throws Exception {
        if (puntuaciones.size() < tamaño) {
            Puntuacion puntuacion = new Puntuacion(jugador, 0);
            puntuaciones.add(puntuacion);
        } else {
            throw new Exception("Limite de jugadores alcanzado");
        }
    }
    
    public void eliminarJugador(Jugador jugador) {
        for (Puntuacion puntuacion : puntuaciones) {
            if (puntuacion.getJugador().equals(jugador)) {
                puntuaciones.remove(puntuacion);
            }
        }
    }
 
    public void cambiarPuntuacion(Puntuacion puntuacion) {
        for (int i = 0; i < 4; i++) {
            if (puntuaciones.get(i).equals(puntuacion)) {
                puntuaciones.set(i, puntuacion);
            }
        }

    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
