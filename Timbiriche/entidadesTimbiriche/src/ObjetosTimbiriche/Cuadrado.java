/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Daniel Rojas
 */
public class Cuadrado extends Figura{
    private ArrayList<Figura> lineas = new ArrayList<Figura>();
    
    
    public Cuadrado(Color color, int x, int y) {
        super(color,x,y);
    }

    @Override
    public void agregarLinea(Figura figura) {
        if (!lineas.contains(figura) && lineas.size()<4) {
            lineas.add(figura);
        }
    }

    @Override
    public void eliminarLinea(Figura figura) {
        if (lineas.contains(figura)) {
            lineas.remove(figura);
        }
    }


    
    
    
}
