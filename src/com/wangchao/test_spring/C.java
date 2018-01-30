package com.wangchao.test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created by WYCL on ${DATA}.
 */
public class C {
    public static void main(String[] args) {
        //获取ioc容器

        ApplicationContext act = new ClassPathXmlApplicationContext("String-Car.xml");

        //获取bean

        Car car = (Car)act.getBean("car");

        System.out.println(car);

        Car car1 = (Car)act.getBean("car1");
        System.out.println(car1);

       Person person = (Person) act.getBean("person");

        System.out.println(person);
      //引用其他bean测试
       Person person1 = (Person) act.getBean("person1");

        System.out.println(person1);

        //内部bean测试

        Person person2 = (Person)act.getBean("person2");
        System.out.println(person2);

        //null值测试和级联属性的测试

        Person person3 = (Person) act.getBean("person3");
        System.out.println(person3);

        //List集合类型的测试

        PersonList personList = (PersonList) act.getBean("personList");
        System.out.println(personList + "\t");

        //Map集合类型的测试

        PersonMap pm = (PersonMap)act.getBean("personMap");
        System.out.println("Map集合测试： " +  pm);

        //Properties类型的集合测试

        MyDataSource myDataSource  = (MyDataSource) act.getBean("myDataSource");

        System.out.println(myDataSource);

        //独立的集合bean的测试

        PersonList personList1 = (PersonList)act.getBean("personList2");
        System.out.println(personList1);

        //使用P命名空间来注入bean

        PersonList personList2 = (PersonList) act.getBean("personList3");
        System.out.println( "P命名空间测试" + personList2);
    }
}
