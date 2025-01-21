
package campus.u2.aguacate.domain.service;

import campus.u2.aguacate.domain.repository.AvocadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import campus.u2.aguacate.persistence.entity.Avocado;

@Service
public class AvocadoServiceImpl implements AvocadoService {

    private final AvocadoRepository avocadoRepository;

    @Autowired
    public AvocadoServiceImpl(AvocadoRepository avocadoRepository) {
        this.avocadoRepository = avocadoRepository;
    }

    @Override
    public List<Avocado> getAllAvocados() {
        return avocadoRepository.findAll();
    }

    @Override
    public Avocado getAvocadoById(Long id) {
        Optional<Avocado> optionalAvocado = avocadoRepository.findById(id);
        return optionalAvocado.orElse(null);
    }

    @Override
    public Avocado saveAvocado(Avocado avocado) {
        return avocadoRepository.save(avocado);
    }

    @Override
    public void deleteAvocado(Long id) {
        avocadoRepository.deleteById(id);
    }
}
