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
import org.omg.CORBA.CODESET_INCOMPATIBLE;

/**
 *
 * @author User 1
 */
public class Tablero {
    private int tamaño;
    ControlJugadores jugadores;
    private JButton botonesHorizontales[][];
    private JButton botonesVerticales[][];
    
    public Tablero(int tamaño, ControlJugadores jugadores ) {
        this.tamaño = tamaño;
        this.jugadores = jugadores;
    }
    
    public void crearTablero() {
        botonesHorizontales = new JButton[tamaño][tamaño + 1];
        botonesVerticales = new JButton[tamaño + 1][tamaño];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño + 1; j++) {
                JButton boton = new JButton();
                boton.setVisible(true);
                boton.setBackground(Color.GRAY);
                boton.addActionListener(new ButtonListener());

                // Botones horizontales
                if (tamaño == 10) {
                    boton.setSize(65, 26);
                    boton.setLocation((95 * i) + 26, (94 * j) );
                } else if (tamaño == 20) {
                    boton.setSize(30, 10);
                    boton.setLocation((47 * i) + 14 + (i / 2), (47 * j) + (j / 2));
                } else if (tamaño == 40) {
                    boton.setSize(20, 12);
                    boton.setLocation((24 * i) + 9, (24 * j));
                }

                botonesHorizontales[i][j] = boton;
            }
        }
        
        for (int i = 0; i < tamaño+1; i++) {
            for (int j = 0; j < tamaño; j++) {
                JButton boton2 = new JButton();
                boton2.setVisible(true);
                boton2.setBackground(Color.GRAY);
                boton2.addActionListener(new ButtonListener());

                //botones verticales
                if (tamaño == 10) {
                    boton2.setSize(26, 65);
                    boton2.setLocation((95 * i), (94 * j) + 26);

                } else if (tamaño == 20) {
                    boton2.setSize(10, 30);
                    boton2.setLocation((47 * i) + (i / 2), (47 * j) + 14 + (j / 2));
                } else if (tamaño == 40) {
                    boton2.setSize(12, 20);
                    boton2.setLocation((24 * i), (24 * j) + 9);
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            JButton botonActivado = (JButton) evento.getSource();
//            botonActivado.setEnabled(false);
            botonActivado.setBackground(Color.RED);
            
            
        }
    }
}
