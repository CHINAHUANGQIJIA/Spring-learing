package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.GoStudent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class GoStudentText {
    private static Logger logger=  LoggerFactory.getLogger(GoStudentText.class);
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicaztionConText.xml");
        GoStudent goStudent=(GoStudent)ac.getBean("gostudent");
        logger.info(goStudent.toString());
    }
}
