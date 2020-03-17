package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.User;

public class UserLogin {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public boolean userLogin(User user){
        Boolean end=false;
        if(user.getAccount().equals("admin") && user.getPassword().equals("111")){
            end=true;
            System.out.println("登录成功，欢迎光临！！！");
        }else {
            System.out.println("登录失败，请检查做账户或者密码是否正确");
        }

        return end;
    }

}
