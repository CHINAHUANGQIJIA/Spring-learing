package com.soft1851.spring.ioc.entity;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicaztionConText.xml"})
public class BookTest {
    @Autowired
    private Book book;
    @Test
    public void testToString() {
        book.setName("iPhone11promax");
        book.setPrice(1099.99);
        System.out.println(book);
    }
}
