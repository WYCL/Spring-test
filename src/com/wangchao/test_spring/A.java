package com.wangchao.test_spring;

/**
 * created by WYCL on ${DATA}.
 */
public class A {
    private int  age;

    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sayHello(){
        System.out.println("王朝" + "  age: " + age + "  gender: " + gender);
    }
}
