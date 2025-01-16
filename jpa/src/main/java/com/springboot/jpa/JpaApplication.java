package com.springboot.jpa;

import com.springboot.jpa.controller.ComputerService;
import com.springboot.jpa.model.classes.Computer;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		   ConfigurableApplicationContext context = SpringApplication.run(JpaApplication.class, args);

            ComputerService computerService = context.getBean(ComputerService.class);
            
            
        // Save a Computer
        Computer computer1 = new Computer();
            System.out.println(computer1.getId());
        computer1.setName("computer!");
        computer1.setBrand("Acer");
        computerService.saveComputer(computer1);

        // Obtener todos los gatos
//        List<Computer> gatos = computerService.obtenerTodosLosComputers();
//        System.out.println("Computers en la base de datos:");
//        for (Computer gato : gatos) {
//            System.out.println(gato);
//        }

//        // Buscar gatos por nombre
//        List<Computer> gatosPorName = computerService.buscarPorName("Pepe");
//        System.out.println("Computer con nombre 'Pepe':");
//        for (Computer gato : gatosPorName) {
//            System.out.println(gato);
//        }
	}
}
