package campus.u2.aguacate.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import campus.u2.aguacate.persistence.entity.Avocado;

public interface AvocadoRepository extends JpaRepository<Avocado, Long> {
}
