package com.example.DemoGraphQL.Trac;

import com.example.DemoGraphQL.Trac.model.TestTrac;
import com.example.DemoGraphQL.Trac.repo.TracRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wq
 * @date 2019/6/13
 */

@RestController
public class TracController {

    @Autowired
    private TracRepository tracRepository;

    @GetMapping("trac/{name}")
    public String test(@PathVariable String name){
        return tracRepository.save(new TestTrac().setName(name)).toString();
    }
}
