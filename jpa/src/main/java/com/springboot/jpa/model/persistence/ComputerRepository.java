
package com.springboot.jpa.model.persistence;

import java.util.List;

import com.springboot.jpa.model.classes.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface ComputerRepository extends JpaRepository<Computer, Long>{
    List<Computer> findByBrand(String brand);
}
