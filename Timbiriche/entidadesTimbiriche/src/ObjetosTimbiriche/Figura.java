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
public abstract class Figura  {
    private Color color;
    private int x;
    private int y;
    
    public Figura (Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    
    public abstract void agregarLinea(Figura figura);
    public abstract void eliminarLinea(Figura figura);

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    /**
     * Método que establece el color de la figura
     * @param color color de la figura
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    /**
     * Método que regresa el color de la figura
     * @return color color de la figura
     */
    public Color getColor() {
        return color;
    }

    /**
     * Método que regresa la coordenada X de la figura
     * @return coordenada X de la figura
     */
    public int getX() {
        return x;
    }

    /**
     * Método que establece la coordenada X de la figura
     * @param x coordenada X de la figura
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Método que regresa la coordenada Y de la figura
     * @return coordenada Y de la figura
     */
    public int getY() {
        return y;
    }

    /**
     * Método que establece la coordenada Y de la figura
     * @param y coordenada Y de la figura
     */
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    
    
}
