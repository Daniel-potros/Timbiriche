/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.awt.Color;


/**
 *
 * @author Daniel Rojas
 */
public class Linea extends Figura {
    private String posicion = "";
    public Linea(Color color, int x, int y) {
        super(color,x,y);
    }

    @Override
    public void agregarLinea(Figura figura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarLinea(Figura figura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
}
