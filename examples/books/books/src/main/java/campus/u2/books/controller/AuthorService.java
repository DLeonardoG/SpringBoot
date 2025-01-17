
package campus.u2.books.controller;

import campus.u2.books.model.repository.AuthorRepository;
import campus.u2.books.model.entities.*;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {
    
    private final AuthorRepository authorRepository;
    
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    
    @Transactional
    public Author saveAuthorWithBooks(String authorName, List<String> booksNames){
        Author author = new Author(authorName);
        for (String booksName : booksNames) {
            //Validamos el nombre
            Book book = new Book(booksName);
            author.addBooks(book);
        }
        return authorRepository.save(author);
    }
}
