package com.soft1851.spring.orm.app;

import com.soft1851.spring.orm.config.JdbcConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;

public class ForumTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        actx.scan("com.soft1851.spring.ioc.config");
        JdbcTemplate jdbcTemplate= (JdbcTemplate) actx.getBean("jdbcTemplate");
        String sql = "SELECT * FROM t_forum ";
        List<Forum> forumList=  jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Forum.class));
        System.out.println(forumList);
    }
}