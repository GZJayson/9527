package com.example.DemoGraphQL.Query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class CommonMutation implements GraphQLMutationResolver {
    public String helloJay(){
        return "hello,graphql";
    }
}
