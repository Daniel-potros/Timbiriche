/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.JButton;

/**
 * 
 * @author Daniel Rojas
 */
public class botonLinea extends JButton {
    int X,Y;
    private String posicion ="";
    
    public int getx() {
        this.getX();
        return X;
    }
    
    public int gety() {
        return Y;
    }
    
    public void setx(int X) {
        this.X = X;
    }
    
    public void sety(int Y) {
        this.Y = Y;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
