package com.wangchao.test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by WYCL on ${DATA}.
 */
public class Main {
    public static void main(String[] args) {
        //不是用框架之前的步骤：
        //1.创建一个HelloWorld对象

        HelloWorld hw = new HelloWorld();

        //2.为实例对象赋值

        hw.setName("Spring");

        hw.sayHello();

        //用框架之后的步骤

        //1.创建一个SPring的IOC容器


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        //2.从IOC容器中获取bean实例

        HelloWorld hw1 = (HelloWorld) context.getBean("helloWorld");

        //3.调用sayhello方法

        hw1.sayHello();
    }
}
