/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.util.Objects;

/**
 *
 * @author Daniel Rojas
 */
public class Puntuacion {
    private Jugador jugador;
    private int puntaje;
    
    
    public Puntuacion(){
        
    }
    
    public Puntuacion(Jugador jugador, int puntaje) {
        this.jugador = jugador;
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puntuacion other = (Puntuacion) obj;
        if (!Objects.equals(this.jugador, other.jugador)) {
            return false;
        }
        if (this.puntaje != other.puntaje) {
            return false;
        }
        return true;
    }
}
