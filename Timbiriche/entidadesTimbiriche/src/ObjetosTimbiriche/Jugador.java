/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosTimbiriche;

import java.awt.Color;
import java.util.ArrayList;
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
    
   public Jugador(String nombre) {
       Nombre=nombre;
       
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        if (!Objects.equals(this.Avatar, other.Avatar)) {
            return false;
        }
        if (!Objects.equals(this.figuras, other.figuras)) {
            return false;
        }
        return true;
    }

   
    
  

    

    
    
    
}
