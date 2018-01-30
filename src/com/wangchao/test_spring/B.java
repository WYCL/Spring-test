package com.wangchao.test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by WYCL on ${DATA}.
 */
public class B {
    public static void main(String[] args) {
        //创建IOC实例

        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring-config.xml");

        //从ioc容器获取bean

        A aa = (A) applicationContext.getBean("a");

        //调用方法

        aa.sayHello();
    }
}
