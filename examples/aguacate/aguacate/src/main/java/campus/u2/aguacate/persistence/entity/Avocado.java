
package campus.u2.aguacate.persistence.entity;

import jakarta.persistence.*;

@Entity
public class Avocado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String variety;
    private Double weight; // Peso en gramos
    private Boolean ripe; // Si está maduro o no

    public Avocado() {
    }

    public Avocado(String variety, Double weight, Boolean ripe) {
        this.variety = variety;
        this.weight = weight;
        this.ripe = ripe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getRipe() {
        return ripe;
    }

    public void setRipe(Boolean ripe) {
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Avocado{" + "id=" + id + ", variety=" + variety + ", weight=" + weight + ", ripe=" + ripe + '}';
    }
    
    
}
