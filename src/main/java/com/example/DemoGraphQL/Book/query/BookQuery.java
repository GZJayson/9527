package com.example.DemoGraphQL.Book.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DemoGraphQL.Book.model.Book;
import com.example.DemoGraphQL.Book.repo.BookRepository;
import org.springframework.stereotype.Component;

@Component
public class BookQuery implements GraphQLQueryResolver {
    private BookRepository bookRepository;

    public long countBooks() {
        return bookRepository.count();
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
