package com.alibaba.dubbo.test;

import java.util.Map;

/**
 * Created by ken.lj on 2017/9/12.
 */
public class ObjectMapConvertTest {
    public static void main(String[] args) {
        Class<Person> cls = Person.class;
        Map<String, Object> personMap = (Map<String, Object> )(new Person(1, "chiken"));
        System.out.println(personMap);
    }

}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
