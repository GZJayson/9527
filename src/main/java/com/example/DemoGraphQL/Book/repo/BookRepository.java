package com.example.DemoGraphQL.Book.repo;

import com.example.DemoGraphQL.Book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
