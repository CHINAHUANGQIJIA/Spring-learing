package com.soft1851.spring.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * web应用配置(代替之前的web.xml)
 */
public class WebApplicationConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //创建一个基于注解的web应用上下文配置对象，实现AnnotationConfigRegistry
        AnnotationConfigWebApplicationContext ctx =new AnnotationConfigWebApplicationContext();
        //将webMvcConfig的配置类注册进来
        ctx.register(WebMvcConfig.class);
        //设置ServletContext
        ctx.setServletContext(servletContext);
        ctx.refresh();
        //配置了ctx的映射规则的对象
        ServletRegistration.Dynamic  registration =servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        registration.addMapping("/");
        //设置servelt的启动优先级
        registration.setLoadOnStartup(1);
    }
}
