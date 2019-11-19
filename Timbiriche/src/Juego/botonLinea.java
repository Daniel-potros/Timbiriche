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
    int x,y;
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int X) {
        x = X;
    }
    
    public void setY(int Y) {
        y = Y;
    }
}
