/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Color;

/**
 *
 * @author Daniel Rojas
 */
public class convertidorColores {
    
    
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("Rojo")) {
            return Color.red;
        }
        if (color.equalsIgnoreCase("Azul")) {
            return Color.BLUE;
        } 
        if (color.equalsIgnoreCase("Verde")) {
            return Color.GREEN;
        }
        if (color.equalsIgnoreCase("Amarillo")) {
            return Color.yellow;
        }
        return null;
    }
}
