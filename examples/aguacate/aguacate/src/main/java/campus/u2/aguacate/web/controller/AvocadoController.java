
package campus.u2.aguacate.web.controller;

import campus.u2.aguacate.domain.service.AvocadoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import campus.u2.aguacate.persistence.entity.Avocado;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/avocado")
public class AvocadoController {
    
    private final AvocadoServiceImpl avocadoServiceImpl;
    
    @Autowired
    public AvocadoController(AvocadoServiceImpl avocadoServiceImpl){
        this.avocadoServiceImpl = avocadoServiceImpl;
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Avocado> getAllAvocados(){
        return avocadoServiceImpl.getAllAvocados();
    }
    
    @GetMapping("/{id}")
    public Avocado getAvocadoById(@PathVariable Long id){
        return avocadoServiceImpl.getAvocadoById(id);
    }
    
    @PostMapping
    public Avocado createAvocado(@RequestBody Avocado avocado){
        return avocadoServiceImpl.saveAvocado(avocado);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAvocado(@PathVariable Long id){
        avocadoServiceImpl.deleteAvocado(id);
    }
    
    @PutMapping("/{id}")
    public Avocado updateAvocado(@PathVariable Long id, @RequestBody Avocado avocado){
        avocado.setId(id);
        return avocadoServiceImpl.saveAvocado(avocado);
    }
    
}
