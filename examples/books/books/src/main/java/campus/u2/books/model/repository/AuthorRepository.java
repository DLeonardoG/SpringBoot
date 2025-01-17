
package campus.u2.books.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import campus.u2.books.model.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
