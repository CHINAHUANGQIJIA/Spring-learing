package com.soft1851.spring.ioc.entity;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicaztionConText.xml"})
public class StudentForumTest {
    //注入
    @Autowired
    public Student student;
    @Test
    public void text(){
        System.out.println(student);
    }
}