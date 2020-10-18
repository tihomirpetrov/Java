package com.springframework.webApp.repositories;

import com.springframework.webApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
