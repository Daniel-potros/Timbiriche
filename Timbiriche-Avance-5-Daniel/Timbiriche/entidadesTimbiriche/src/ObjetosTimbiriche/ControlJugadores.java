/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import ObjetosTimbiriche.Jugador;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel Rojas
 */
public class ControlJugadores {
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    
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

    public ImageIcon obtenerAvatar(int numero) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (i == numero) {
                return jugadores.get(i).getAvatar();
            }
        }
        return null;
    }

    public int cantidadJugadores() {
        return jugadores.size();
    }
}
