package com.soft1851.spring.ioc.entity;

import java.util.List;

public class GoStudent {
    private  Integer id;
    private  String name;
    private List<String> hobbies;

    public GoStudent(Integer id, String name, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
    }

    public GoStudent() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "GoStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
