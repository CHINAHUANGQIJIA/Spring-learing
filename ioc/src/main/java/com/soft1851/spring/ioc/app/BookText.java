package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookText {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.scan("com.soft1851.spring.ioc.config");
        Book book=(Book)ctx.getBean("book");
        book.setName("iPhonexsmax");
        book.setPrice(9898.99);
        System.out.println(book);
    }
}
