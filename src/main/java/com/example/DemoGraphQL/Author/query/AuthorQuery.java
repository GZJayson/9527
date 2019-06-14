package com.example.DemoGraphQL.Author.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DemoGraphQL.Author.model.Author;
import com.example.DemoGraphQL.Author.repo.AuthorRepository;
import org.springframework.stereotype.Component;


@Component
public class AuthorQuery implements GraphQLQueryResolver {
    private AuthorRepository authorRepository;


    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countAuthors() {
        return  authorRepository.count();
    }

}
