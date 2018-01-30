package com.wangchao.test_spring;

import java.util.Map;

/**
 * created by WYCL on ${DATA}.
 */
public class PersonMap {
    private String name ;
    private Integer age ;

    private Map<String,Car> cars ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "com.wangchao.test_spring.PersonMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
