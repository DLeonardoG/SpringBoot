
package com.springboot.jpa.controller;

import com.springboot.jpa.model.classes.Computer;
import com.springboot.jpa.model.persistence.ComputerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {
    private final ComputerRepository computerRepository;
    
    @Autowired
    public ComputerService(ComputerRepository computerRepository){
        this.computerRepository = computerRepository;
    }
    
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    public List<Computer> getAll() {
        return computerRepository.findAll();
    }

    public List<Computer> findByName(String name) {
        return computerRepository.findByBrand(name);
    }
}
