/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campus.u2.potaxie;

/**
 *
 * @author juanmarino
 */
public class Potaxie implements Usuario{
    private String nombre;
    
    public Potaxie(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    @Override
    public String hablar() {
        return "Hola munde mi amer!!";
    }
    
    
    
}
