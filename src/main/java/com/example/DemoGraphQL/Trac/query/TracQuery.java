package com.example.DemoGraphQL.Trac.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.DemoGraphQL.Trac.model.TestTrac;
import com.example.DemoGraphQL.Trac.repo.TracRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wq
 * @date 2019/6/13
 */
@Component
public class TracQuery implements GraphQLQueryResolver {

    @Autowired
    private TracRepository tracRepository;

    public List<TestTrac> findAllTracs(){
        return tracRepository.findAll();
    }

    public long countTracs() {
        return  tracRepository.count();
    }


    public TestTrac getTracOne(Long id){
        return tracRepository.getOne(id);
    }

    public Map<String,Object> getMapQuery(){
        Map map = new HashMap<String,Object>();
        map.put("id",99l);
        map.put("name","mr.jayson");
        map.put("getDesc","12");
        return map;
    };

}
