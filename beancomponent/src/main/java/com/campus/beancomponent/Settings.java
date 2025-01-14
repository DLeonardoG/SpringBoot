/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus.beancomponent;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Settings {
    @Bean
    public Human patient(){
        Patient patient = new Patient("camilo","no puede camer");
        return patient;
    }
    
    @Bean
    public Human doctor(){
        Doctor doctor = new Doctor("Juaneds");
        return doctor;
    }
    
    @Bean
    public MedicalAppointment medicalApoAppointment(){
        MedicalAppointment medicalAppointment = new MedicalAppointment();
        return medicalAppointment;
    }
    
}
