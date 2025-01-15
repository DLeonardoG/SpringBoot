
package com.springboot.jpa.model.classes;

import javax.annotation.processing.Generated;

@Entity
public class Computer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String price;
    private String brand;

    public Computer() {
    }

    public Computer(String name, String price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + '}';
    }
    
}