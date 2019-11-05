/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author User 1
 */
public class Tablero {
    int tamaño;
    ControlJugadores jugadores;
    private JButton botonesHorizontales[][];
    private JButton botonesVerticales[][];
    
//    public Tablero(int tamaño, ControlJugadores jugadores ) {
//        this.tamaño = tamaño;
//        this.jugadores = jugadores;
//    }
    
    public void crearTablero(int tamaño) {
        botonesHorizontales = new JButton[tamaño][tamaño];
        botonesVerticales = new JButton[tamaño][tamaño];
        
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                
                JButton boton = new JButton();
                boton.setVisible(true);
                boton.setBackground(Color.BLACK);
                boton.addActionListener(new ButtonListener());
                
                // Botones horizontales
                if (tamaño == 10) {
                    boton.setSize(55, 8);
                    boton.setLocation((63 * i) + 8, (63 * j) + 6);
                } else if (tamaño == 20) {
                    boton.setSize(24, 8);
                    boton.setLocation((31 * i) + 8 + (i / 2), (31 * j) + 6 + (j / 2));
                } else {
                    boton.setSize(10, 6);
                    boton.setLocation((16 * i) + 6, (16 * j));
                }
                
                botonesHorizontales[i][j] = boton;
                
                //botones verticales
                if (tamaño == 10) {
                    boton.setSize(8, 55);
                    boton.setLocation((63 * i), (63 * j) + 14);

                } else if (tamaño == 20) {
                    boton.setSize(8, 24);
                    boton.setLocation((31 * i) + (i / 2), (31 * j) + 14 + (j / 2));
                } else {
                    boton.setSize(6, 10);
                    boton.setLocation((16 * i), (16 * j) + 6);
                }
                
                botonesVerticales[i][j] = boton;

                
            }
        }
        
    }

    public JButton[][] getBotonesHorizontales() {
        return botonesHorizontales;
    }

    public JButton[][] getBotonesVerticales() {
        return botonesVerticales;
    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
    
        }
    }
}
