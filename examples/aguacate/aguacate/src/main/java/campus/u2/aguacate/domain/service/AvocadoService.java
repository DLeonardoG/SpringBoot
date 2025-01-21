
package campus.u2.aguacate.domain.service;
import java.util.List;
import campus.u2.aguacate.persistence.entity.Avocado;

public interface AvocadoService {
    List<Avocado> getAllAvocados();
    Avocado getAvocadoById(Long id);
    Avocado saveAvocado(Avocado aguacate);
    void deleteAvocado(Long id);
}
