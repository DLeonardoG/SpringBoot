/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.beancomponent;

/**
 *
 * @author camper
 */
public class Doctor implements Human{
    private String name;
    
    public Doctor(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + '}';
    }

    @Override
    public String speak() {
       return "I'm "+ name +" and I'm doctor" ;
    }
}
