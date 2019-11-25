/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;


import Juego.ControlTablero;
import Juego.botonLinea;
import ObjetosTimbiriche.Cuadrado;
import ObjetosTimbiriche.Jugador;
import ObjetosTimbiriche.Linea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Daniel Rojas
 */
public class Timbiriche extends javax.swing.JFrame {

//    PnlTablero pnltablero;
    ArrayList<Jugador> jugadores;
    private JButton botonesHorizontales[][];
    private JButton botonesVerticales[][];
    private ArrayList<Cuadrado> cuadrados = new ArrayList<>();
    private ControlTablero tablero;
    int tamaño,turno = 1;

    /**
     * 
     * @param jugadores 
     */
    public Timbiriche(ArrayList<Jugador> jugadores) {
        initComponents();
        this.jugadores = jugadores;
        
           switch (jugadores.size()) {
            case 2:
                labelJ1.setText(jugadores.get(0).getNombre());
                labelJ2.setText(jugadores.get(1).getNombre());
                icono1.setIcon(jugadores.get(0).getAvatar());
                icono2.setIcon(jugadores.get(1).getAvatar());
                tamaño = 10;
                tablero = new ControlTablero(2);
                try {
                    tablero.agregarJugador(jugadores.get(0));
                    tablero.agregarJugador(jugadores.get(1));
                } catch (Exception ex) {
                       Logger.getLogger(Timbiriche.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   break;

               case 3:
                   labelJ1.setText(jugadores.get(0).getNombre());
                   labelJ2.setText(jugadores.get(1).getNombre());
                   labelJ3.setText(jugadores.get(2).getNombre());
                   icono1.setIcon(jugadores.get(0).getAvatar());
                   icono2.setIcon(jugadores.get(1).getAvatar());
                   icono3.setIcon(jugadores.get(2).getAvatar());
                   tamaño = 20;
                   tablero = new ControlTablero(3);

                try {
                    tablero.agregarJugador(jugadores.get(0));
                    tablero.agregarJugador(jugadores.get(1));
                    tablero.agregarJugador(jugadores.get(2));
                } catch (Exception ex) {
                    Logger.getLogger(Timbiriche.class.getName()).log(Level.SEVERE, null, ex);
                }
                   break;

               case 4:
                   labelJ1.setText(jugadores.get(0).getNombre());
                   labelJ2.setText(jugadores.get(1).getNombre());
                   labelJ3.setText(jugadores.get(2).getNombre());
                   labelJ4.setText(jugadores.get(3).getNombre());
                   icono1.setIcon(jugadores.get(0).getAvatar());
                   icono2.setIcon(jugadores.get(1).getAvatar());
                   icono3.setIcon(jugadores.get(2).getAvatar());
                   icono4.setIcon(jugadores.get(3).getAvatar());
                   tamaño = 40;
                   tablero = new ControlTablero(4);

                   try {
                       tablero.agregarJugador(jugadores.get(0));
                       tablero.agregarJugador(jugadores.get(1));
                       tablero.agregarJugador(jugadores.get(2));
                       tablero.agregarJugador(jugadores.get(3));
                   } catch (Exception ex) {
                       Logger.getLogger(Timbiriche.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   break;

        }
        crearTablero();
        
    }
    
    public Timbiriche() {
        initComponents();
    }
    
    public void crearTablero() {
        botonesHorizontales = new botonLinea[tamaño][tamaño + 1];
        botonesVerticales = new botonLinea[tamaño + 1][tamaño];

        for (int y = 0; y < tamaño; y++) {
            for (int x = 0; x < tamaño + 1; x++) {
                botonLinea boton = new botonLinea();
                boton.setVisible(true);
                boton.setBackground(Color.gray);
                boton.addActionListener(new ButtonListener());

//                 Botones horizontales
                switch (tamaño) {
                    case 10:
                        boton.setSize(65, 26);
                        boton.setLocation((95 * y) + 26, (94 * x) );
                        break;
                    case 20:
                        boton.setSize(30, 10);
                        boton.setLocation((47 * y) + 14 + (y / 2), (47 * x) + (x / 2));
                        break;
                    case 40:
                        boton.setSize(20, 12);
                        boton.setLocation((24 * y) + 9, (24 * x));
                        break;
                    default:
                        break;
                }

                boton.setx(x);
                boton.sety(y);
                boton.setPosicion("Horizontal");
                botonesHorizontales[y][x] = boton;
                labelTablero.add(boton);
            }
        }
        
        for (int i = 0; i < tamaño+1; i++) {
            for (int j = 0; j < tamaño; j++) {
                Cuadrado cuadrado=new Cuadrado(null,i,j);
                cuadrados.add(cuadrado);
                botonLinea boton2 = new botonLinea();
                boton2.setVisible(true);
                boton2.setBackground(Color.GRAY);
                boton2.addActionListener(new ButtonListener());

//                botones verticales
                switch (tamaño) {
                    case 10:
                        boton2.setSize(26, 65);
                        boton2.setLocation((95 * i), (94 * j) + 26);
                        break;
                    case 20:
                        boton2.setSize(10, 30);
                        boton2.setLocation((47 * i) + (i / 2), (47 * j) + 14 + (j / 2));
                        break;
                    case 40:
                        boton2.setSize(12, 20);
                        boton2.setLocation((24 * i), (24 * j) + 9);
                        break;
                    default:
                        break;
                }
                
                boton2.setx(j);
                boton2.sety(i);
                boton2.setPosicion("Vertical");
                botonesVerticales[i][j] = boton2;
                labelTablero.add(boton2);
            }
        }

    }
    
    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            botonLinea botonActivado = (botonLinea) evento.getSource();
            botonActivado.setEnabled(true);
            botonActivado.setBackground(Color.RED);
            Linea linea = new Linea(Color.RED,botonActivado.getx(),botonActivado.gety());
            
            if (botonActivado.getPosicion().equalsIgnoreCase("horizontal")) {
                linea.setPosicion("Horizontal");
                
                if (botonActivado.gety() == 0) {
                    for (Cuadrado cuadrado : cuadrados) {
                        if (cuadrado.getX() == linea.getX() && cuadrado.getY() == linea.getY()) {
                            cuadrado.agregarLinea(linea);
                        }
                    }
                } else {
                    for (Cuadrado cuadrado : cuadrados) {
                        if (cuadrado.getX() == linea.getX() && cuadrado.getY() == linea.getY()) {
                            cuadrado.agregarLinea(linea);
                        }
                        if (cuadrado.getY() == linea.getY()-1 && cuadrado.getX() == linea.getX()) {
                            cuadrado.agregarLinea(linea);
                        }
                    }
                }
                
                
            } else if (botonActivado.getPosicion().equalsIgnoreCase("vertical")) {
                linea.setPosicion("Vertical");
                
                if (botonActivado.getx() == 0) {
                    for (Cuadrado cuadrado : cuadrados) {
                        if (cuadrado.getX() == linea.getX() && cuadrado.getY() == linea.getY()) {
                            cuadrado.agregarLinea(linea);
                        }
                    }
                } else {
                    for (Cuadrado cuadrado : cuadrados) {
                        if (cuadrado.getX() == linea.getX() && cuadrado.getY() == linea.getY()) {
                            cuadrado.agregarLinea(linea);
                        }
                        if (cuadrado.getY() == linea.getY() && cuadrado.getX() == linea.getX()-1) {
                            cuadrado.agregarLinea(linea);
                        }
                    }
                }
            }
            
            
            
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelJ1 = new javax.swing.JLabel();
        labelJ2 = new javax.swing.JLabel();
        labelJ3 = new javax.swing.JLabel();
        labelJ4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelPuntos1 = new javax.swing.JLabel();
        labelPuntos2 = new javax.swing.JLabel();
        labelPuntos3 = new javax.swing.JLabel();
        labelPuntos4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        icono1 = new javax.swing.JLabel();
        icono2 = new javax.swing.JLabel();
        icono3 = new javax.swing.JLabel();
        icono4 = new javax.swing.JLabel();
        labelTablero = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelJ1.setText("Jugador 1");

        labelJ2.setText("Jugador 2");

        labelJ3.setText("Jugador 3");

        labelJ4.setText("Jugador 4");

        jButton1.setText("Abandonar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelPuntos1.setText("0");

        labelPuntos2.setText("0");

        labelPuntos3.setText("0");

        labelPuntos4.setText("0");

        jLabel1.setText("Puntos");

        jLabel5.setText("Puntos");

        jLabel6.setText("Puntos");

        jLabel7.setText("Puntos");

        icono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        icono2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        icono3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        icono4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Azul", "Amarillo", "Verde" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Azul", "Amarillo", "Verde" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Azul", "Amarillo", "Verde" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Azul", "Verde", "Amarillo" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(icono4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icono3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icono2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelJ1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelJ2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelJ3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelJ4, javax.swing.GroupLayout.Alignment.TRAILING))))))
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(labelPuntos1)
                            .addComponent(jLabel5)
                            .addComponent(labelPuntos2)
                            .addComponent(jLabel6)
                            .addComponent(labelPuntos3)
                            .addComponent(jLabel7)
                            .addComponent(labelPuntos4))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(icono2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJ1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPuntos1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelJ2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPuntos2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(labelJ3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPuntos3)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(icono3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(labelJ4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPuntos4)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(icono4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Timbiriche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timbiriche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timbiriche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timbiriche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timbiriche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icono1;
    private javax.swing.JLabel icono2;
    private javax.swing.JLabel icono3;
    private javax.swing.JLabel icono4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelJ1;
    private javax.swing.JLabel labelJ2;
    private javax.swing.JLabel labelJ3;
    private javax.swing.JLabel labelJ4;
    private javax.swing.JLabel labelPuntos1;
    private javax.swing.JLabel labelPuntos2;
    private javax.swing.JLabel labelPuntos3;
    private javax.swing.JLabel labelPuntos4;
    private javax.swing.JLabel labelTablero;
    // End of variables declaration//GEN-END:variables
}
