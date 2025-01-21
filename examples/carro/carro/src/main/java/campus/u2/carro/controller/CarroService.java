
package campus.u2.carro.controller;

import campus.u2.carro.model.persistence.CarroRepository;
import campus.u2.carro.model.clases.Carro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }
    
    public Carro saveCar( Carro carro){
        return carroRepository.save(carro);
    }
    
    public List<Carro> getAll(){
        return carroRepository.findAll();
    }
    
    public List<Carro> buscarPorMarca(String marca){
        return carroRepository.findByMarca(marca);
    }
    
}
