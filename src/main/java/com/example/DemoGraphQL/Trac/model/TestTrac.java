package com.example.DemoGraphQL.Trac.model;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

/**
 * 实体类
 * @author ywx
 * @date 2019/6/13
 */
@Entity
@Table(name="test_trac")
@Proxy(lazy = false)
@Data
public class TestTrac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public TestTrac setId(Long id) {
        this.id = id;
        return this;
    }

    public TestTrac setName(String name) {
        this.name = name;
        return this;
    }
}
