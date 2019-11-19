/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel Rojas
 */
public class Jugador {
    private String Nombre;
    private ImageIcon Avatar;
    private Color color;
    private ArrayList<Figura> figuras;
    private String contraseña;
    
   public Jugador(String nombre, String contraseña) {
       Nombre=nombre;
       this.contraseña = contraseña;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ImageIcon getAvatar() {
        return Avatar;
    }

    public void setAvatar(ImageIcon Avatar) {
        this.Avatar = Avatar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }
    
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }
    
    public void eliminarFigura(Figura figura) {
        figuras.remove(figura);
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    

    
    
    
}
