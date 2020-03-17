package com.soft1851.spring.ioc.entity;

import java.util.List;

public class Student {
    private String name;
    private List<String> phone;

    public Student(String name, List<String> phone) {
        this.name = name;
        this.phone = phone;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
