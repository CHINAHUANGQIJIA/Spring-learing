package com.soft1851.spring.ioc.entity;

import java.util.List;

public class Phone {
    private List<String> brand;
    private  Double price;

    public Phone(List<String> brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand=" + brand +
                ", price=" + price +
                '}';
    }
}
