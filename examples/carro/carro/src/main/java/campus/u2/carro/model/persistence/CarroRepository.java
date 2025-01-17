
package campus.u2.carro.model.persistence;

import campus.u2.carro.model.clases.Carro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarroRepository extends JpaRepository<Carro, Long>{
    List<Carro> findByMarca(String marca);
}
