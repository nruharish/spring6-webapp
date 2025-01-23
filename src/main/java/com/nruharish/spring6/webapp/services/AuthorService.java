package com.nruharish.spring6.webapp.services;

import com.nruharish.spring6.webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
