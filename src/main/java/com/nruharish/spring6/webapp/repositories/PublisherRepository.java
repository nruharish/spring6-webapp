package com.nruharish.spring6.webapp.repositories;

import com.nruharish.spring6.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
