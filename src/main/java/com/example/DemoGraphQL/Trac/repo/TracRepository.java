package com.example.DemoGraphQL.Trac.repo;

import com.example.DemoGraphQL.Book.model.Book;
import com.example.DemoGraphQL.Trac.model.TestTrac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface TracRepository extends JpaRepository<TestTrac, Long> {

}
