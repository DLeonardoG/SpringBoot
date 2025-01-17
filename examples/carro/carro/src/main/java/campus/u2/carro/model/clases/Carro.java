
package campus.u2.carro.model.clases;

import jakarta.persistence.*;


@Entity
@Table(name = "carros")
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String marca;
    
    @Column(nullable = false, length = 100)
    private String modelo;
    
    @Column(nullable = false)
    private int anio;
    
    @Column(nullable = false)
    private double precio;
    
    public Carro(){
        
    }

    public Carro(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + 
                ", marca=" + marca + 
                ", modelo=" + modelo +
                ", anio=" + anio + 
                ", precio=" + precio 
                + '}';
    }
    
    
}
