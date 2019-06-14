package com.example.DemoGraphQL.Book.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.DemoGraphQL.Author.model.Author;
import com.example.DemoGraphQL.Book.model.Book;
import com.example.DemoGraphQL.Author.repo.AuthorRepository;
import org.springframework.stereotype.Component;

/**
 * 扩展返回 bean属性
 */
@Component
public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.getOne(book.getAuthor().getId());
    }
}
