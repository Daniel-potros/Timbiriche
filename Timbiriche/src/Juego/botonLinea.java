/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.JButton;

/**
 * botón utilizado para representar las líneas del tablero del timbiriche
 * @author Daniel Rojas
 */
public class botonLinea extends JButton {
    int X,Y;
    private String posicion ="";
    
    /**
     * Método que regresa la coordenada X de la linea
     * @return coordenada X de la linea
     */
    public int getx() {
        return X;
    }
    
    /**
     * Método que regresa la coordenada Y de la linea
     * @return coordenada Y de la linea
     */
    public int gety() {
        return Y;
    }
    
    /**
     * Método que establece la coordenada X de la línea
     * @param X coordenada X de la linea
     */
    public void setx(int X) {
        this.X = X;
    }
    
    /**
     * Método que establece la coordenada Y de la línea
     * @param Y coordenada Y de la linea
     */
    public void sety(int Y) {
        this.Y = Y;
    }

    /**
     * Método que regresa la posicion/orientación de la línea
     * @return posicion Horizontal o Vertical de la linea
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Método que establece la posicion/orientación de la linea
     * @param posicion posicion Horizontal o Vertical de la linea
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
