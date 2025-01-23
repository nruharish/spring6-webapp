package com.nruharish.spring6.webapp.services;

import com.nruharish.spring6.webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
