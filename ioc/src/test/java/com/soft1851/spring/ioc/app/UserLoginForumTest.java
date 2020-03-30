package com.soft1851.spring.ioc.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/applicaztionConText.xml"})

public class UserLoginForumTest {
    //  自动注入
    @Autowired
    private UserLogin userlogin;
    @Test
    public void userLogin() throws Exception{
        userlogin.userLogin(userlogin.getUser());
    }
}