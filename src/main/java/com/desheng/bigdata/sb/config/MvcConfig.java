package com.desheng.bigdata.sb.config;

import com.desheng.bigdata.sb.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//当前类是一个配置类
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //注入一个自定的bean
    @Bean
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将自定义的拦截器注册到springmvc的系统拦截器中
        registry.addInterceptor(loginInterceptor());
    }
}
