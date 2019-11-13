/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;


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
        botonesHorizontales = new JButton[tamaño+1][tamaño+1];
        botonesVerticales = new JButton[tamaño+1][tamaño+1];
        
        
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
                } else if (tamaño == 40){
                    boton.setSize(30, 22);
                    boton.setLocation((32 * i) + 12, (32 * j));
                }
                
                botonesHorizontales[i][j] = boton;
                
                JButton boton2 = new JButton();
                boton2.setVisible(true);
                boton2.setBackground(Color.BLACK);
                boton2.addActionListener(new ButtonListener());
                
                //botones verticales
                if (tamaño == 10) {
                    boton2.setLocation((63 * i), (63 * j) + 14);
                    boton2.setSize(8, 55);

                } else if (tamaño == 20) {
                    boton2.setSize(8, 24);
                    boton2.setLocation((31 * i) + (i / 2), (31 * j) + 14 + (j / 2));
                } else if (tamaño == 40) {
                    boton2.setSize(22, 30);
                    boton2.setLocation((32 * i), (32 * j) + 12);
                }
                
                botonesVerticales[i][j] = boton2;

                
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
