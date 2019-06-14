package com.example.DemoGraphQL.Trac.query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.DemoGraphQL.Author.model.Author;
import com.example.DemoGraphQL.Book.model.Book;
import com.example.DemoGraphQL.Trac.model.TestTrac;
import com.example.DemoGraphQL.Trac.repo.TracRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wq
 * @date 2019/6/13
 */
@Component
public class TracMutation implements GraphQLMutationResolver {

    @Autowired
    private TracRepository tracRepository;


    public TestTrac CreateTrac(String name) {
        TestTrac trac = new TestTrac();
        trac.setName(name);
        return tracRepository.save(trac);
    }

    public TestTrac CreateTracByObj(TestTrac trac) {
        return tracRepository.save(trac);
    }

    public TestTrac UpdateTrac(Long id,String name) {
        TestTrac t1 = new TestTrac();
        t1.setId(id);
        t1.setName(name);
        tracRepository.save(t1);
        return t1;
    }
}
