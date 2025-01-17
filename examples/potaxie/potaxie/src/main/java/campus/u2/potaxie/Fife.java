/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus.u2.potaxie;

/**
 *
 * @author juanmarino
 */
public class Fife implements Usuario{
    
    private String nombre;
    
    public Fife(){
        this.nombre = "Nombre genérico de fife, guacala!!";
    }
    
    @Override
    public String hablar() {
        return "Uga Uga";
    }

    @Override
    public String toString() {
        return "Fife{" + "nombre=" + nombre + '}';
    }
    
    
}
