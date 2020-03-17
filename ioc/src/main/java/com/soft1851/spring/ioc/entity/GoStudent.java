package com.soft1851.spring.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GoStudent {
    private  Integer id;
    private  String name;
    private List<String> hobbies;
    private Set<String> type;
    private Map<String,String> age;

    public GoStudent(Integer id, String name, List<String> hobbies, Set<String> type, Map<String, String> age) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.type = type;
        this.age = age;
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

    public Set<String> getType() {
        return type;
    }

    public void setType(Set<String> type) {
        this.type = type;
    }

    public Map<String, String> getAge() {
        return age;
    }

    public void setAge(Map<String, String> age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GoStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", type=" + type +
                ", age=" + age +
                '}';
    }
}
