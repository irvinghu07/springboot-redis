package com.irving.springbootredis.entity;

import java.io.Serializable;

/**
 * Development IDE: IntelliJ IDEA
 * Author: irving
 * Project Name: springboot-redis
 * Date: 2018-12-14
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -6790905518607882847L;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
