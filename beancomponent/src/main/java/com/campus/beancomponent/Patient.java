/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.beancomponent;

/**
 *
 * @author camper
 */
public class Patient implements Human{
    private String name;
    private String disease;
    
    public Patient(String name, String disease){
        this.name=name;
        this.disease = disease;
    }
    
    public String getName(){
        return name;
    }

    public String getDisease(){
        return disease;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", disease=" + disease + '}';
    }

    @Override
    public String speak() {
       return "I'm "+ name +" and I'm patient" ;
    }
}
