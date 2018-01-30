package com.wangchao.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by WYCL on ${DATA}.
 */
public class Main {
    public static void main(String[] args) {
        //创建IOC容器对象
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("autowire.xml");

        Person person = (Person)applicationContext.getBean("persons",Person.class);
        System.out.println(person);
    }
}
