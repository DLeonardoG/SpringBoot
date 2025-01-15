
package com.springboot.jpa.controller;

@Service
public class ComputerService {
    private final ComputerRepository computerRepository;
    
    @Autowired
    public ComputerService(ComputerRepositpry computerRepository){
        this.computerRepository = computerRepository;
    }
    
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    public List<Computer> getAll() {
        return computerRepository.findAll();
    }

    public List<Computer> findByName(String name) {
        return computerRepository.findByName(name);
    }
}
