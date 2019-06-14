package com.example.DemoGraphQL.Query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DemoGraphQL.Author.repo.AuthorRepository;
import org.springframework.stereotype.Component;

@Component
public class CommonQuery implements GraphQLQueryResolver {
    public String helloJay(){
        return "hello,graphql";
    }
}
