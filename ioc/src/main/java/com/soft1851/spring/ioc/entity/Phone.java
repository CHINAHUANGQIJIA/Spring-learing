package com.soft1851.spring.ioc.entity;

public class Phone {
    private String brand;
    private  Double price;
    public Phone(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
