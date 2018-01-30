package com.wangchao.test_spring;

/**
 * created by WYCL on ${DATA}.
 */
public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("This is 构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("This is com.wangchao.test_spring.HelloWorld 的set方法");
        this.name = name;
    }

    public void  sayHello(){
        System.out.println("Hello  " + name);
    }
}
