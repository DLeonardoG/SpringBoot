
package com.springboot.jpa.model.persistence;
package com.springboot.jpa.model.classes.Computer;

import java.util.List;

 
public interface ComputerRepository extends JpaRepository<ComputerRepository, Long>{
    List<Computer> findByBrand(String brand);
}
