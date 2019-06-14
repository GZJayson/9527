package com.example.DemoGraphQL.Author.query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.DemoGraphQL.Author.model.Author;
import com.example.DemoGraphQL.Author.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wq
 * @date 2019/6/12
 */
public class AuthorMutation implements GraphQLMutationResolver {

    @Autowired
    private AuthorRepository authorRepository;

    public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);

        authorRepository.save(author);

        return author;
    }
}
