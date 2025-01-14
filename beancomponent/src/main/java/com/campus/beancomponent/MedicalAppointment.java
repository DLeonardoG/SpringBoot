/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.beancomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MedicalAppointment {


    @Autowired
    private Human doctor;
    
    @Autowired
    private Human patient;
    
    
    public MedicalAppointment(){
       
    }

    public Human getDoctor() {
        return doctor;
    }

    public Human getPatient() {
        return patient;
    }



    @Override
    public String toString() {
        return "MedicalAppointment{" + "doctor=" + doctor + ", patient=" + patient + '}';
    }
    
}
