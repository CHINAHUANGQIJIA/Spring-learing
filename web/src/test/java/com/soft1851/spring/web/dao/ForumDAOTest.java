/*
package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumDAOTest {

    @Autowired
    private ForumDAO forumDAO;
    @Test
    public void selectAll() {
        List<Forum> forums = forumDAO.selectAll();
        System.out.println(forums);
    }
    @Test
    public void get(){
        Forum forum = forumDAO.get(14);
        System.out.println(forum);
    }
}*/
