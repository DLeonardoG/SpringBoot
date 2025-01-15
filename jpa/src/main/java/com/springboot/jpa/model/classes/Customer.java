
package com.springboot.jpa.model.classes;

import javax.annotation.processing.Generated;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Customer( String name) {
        this.name = name;
    }

    public Customer() {
    }
    
    
    
    
    
    
}
