package com.nruharish.spring6.webapp.bootstrap;


import com.nruharish.spring6.webapp.domain.Author;
import com.nruharish.spring6.webapp.domain.Book;
import com.nruharish.spring6.webapp.repositories.AuthorRepository;
import com.nruharish.spring6.webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain driven design");
        ddd.setIsbn("1234");

        Author savedEric = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Jhonson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE development without EJB");
        noEJB.setIsbn("34566");

        Author savedRod = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        savedEric.getBooks().add(dddSaved);
        savedRod.getBooks().add(noEJBSaved);
        authorRepository.save(savedEric);
        authorRepository.save(savedRod);

        System.out.println("In bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());

    }
}
