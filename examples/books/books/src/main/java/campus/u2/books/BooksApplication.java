package campus.u2.books;

import campus.u2.books.controller.AuthorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BooksApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BooksApplication.class, args);

        AuthorService authorService = context.getBean(AuthorService.class);

        List<String> books1 = new ArrayList<>();
        books1.add("The Institute");
        books1.add("It");
        books1.add("Doctor Sleep");
        books1.add("Carrie");

        authorService.saveAuthorWithBooks("Stephen King", books1);

        List<String> books = new ArrayList<>();
        books.add("Game Of Thrones");
        books.add("Ice and fire");
        authorService.saveAuthorWithBooks("Robert R. MArtin", books);
    }

}
