package com.nruharish.spring6.webapp.repositories;

import com.nruharish.spring6.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
