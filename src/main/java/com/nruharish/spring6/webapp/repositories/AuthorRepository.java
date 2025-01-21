package com.nruharish.spring6.webapp.repositories;

import com.nruharish.spring6.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
