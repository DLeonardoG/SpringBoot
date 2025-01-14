package com.campus.beancomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeancomponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeancomponentApplication.class, args);
                
                ApplicationContext context = new AnnotationConfigApplicationContext(Settings.class);
                MedicalAppointment medicalAppointment = context.getBean(MedicalAppointment.class);
                System.out.println(medicalAppointment);
	}

}
