package com.springframework.webApp.repositories;

import com.springframework.webApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
