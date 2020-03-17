package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneText {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicaztionConText.xml");
        Phone phone=(Phone)ac.getBean("phone");
        System.out.println(phone);
    }
}
