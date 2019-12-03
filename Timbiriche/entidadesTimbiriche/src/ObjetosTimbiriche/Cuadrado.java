/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Daniel Rojas
 */
public class Cuadrado extends Figura{
    private ArrayList<Figura> lineas = new ArrayList<Figura>();
    
    
    public Cuadrado(Color color, int x, int y) {
        super(color,x,y);
    }

    /**
     * Método que agrega una línea a la lista de lineas del cuadrado
     * @param figura linea a agregar
     */
    @Override
    public void agregarLinea(Figura figura) {
        if (!lineas.contains(figura) && lineas.size()<4) {
            lineas.add(figura);
        }
    }

    /**
     * Método que elimina una línea de la lista de lineas del cuadrado
     * @param figura linea a eliminar
     */
    @Override
    public void eliminarLinea(Figura figura) {
        if (lineas.contains(figura)) {
            lineas.remove(figura);
        }
    }

    /**
     * Método que regresa la lista de lineas del cuadrado
     * @return lista de lineas del cuadrado
     */
    public ArrayList<Figura> getLineas() {
        return lineas;
    }

    /**
     * Método que establece la lista de lineas del cuadrado
     * @param lineas lista de lineas
     */
    public void setLineas(ArrayList<Figura> lineas) {
        this.lineas = lineas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Cuadrado other = (Cuadrado) obj;
        if (!Objects.equals(this.lineas, other.lineas)) {
            return false;
        }
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        return true;
    }


    
    
    
}