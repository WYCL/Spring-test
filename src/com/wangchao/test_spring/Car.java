package com.wangchao.test_spring;

import java.security.PrivilegedExceptionAction;

/**
 * created by WYCL on ${DATA}.
 */
public class Car {
    private  String brand;

    private double  price ;

    private String crop ;

    private String maxSpeed;

    public Car() {
    }

    public Car(String brand, double price, String crop) {
        this.brand = brand;
        this.price = price;
        this.crop = crop;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    @Override
    public String toString() {
        return "Car[" + " brand: " + brand + " crop: " + crop + " price: " + price + " maxSpeed " + maxSpeed + " ]";
    }
}
