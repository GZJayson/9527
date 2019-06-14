package com.example.DemoGraphQL.Trac.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.DemoGraphQL.Trac.model.TestTrac;
import org.springframework.stereotype.Component;

/**
 * 扩展TestTrac实体类的字段
 * @author wq
 * @date 2019/6/13
 */
@Component
public class TracResolver implements GraphQLResolver<TestTrac> {

    //age 将作为 TestTrac 的新字段在 graphqls 文件里被使用
    //参数必须传要扩展的目标类,即使没用到
    public Integer age(TestTrac t1) {
        return (int)(18+Math.random()*(30-18+1));
    }
}
