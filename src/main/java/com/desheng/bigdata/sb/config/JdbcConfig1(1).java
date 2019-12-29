package com.desheng.bigdata.sb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


/*
//这个是在使用springboot的configuration模拟的ssm中的bean的注入是使用
@Configuration //当前注解指定当前类是一个配置信息的类
@PropertySource({"classpath:jdbc.properties"})//当前注解用来加载外部的配置文件
public class JdbcConfig1 {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean //当前配置就将该方法的返回值作为spring中的bean注入到spring工厂中
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();//数据源， 需要指定最基本的4个参数
        dataSource.setDriverClassName(driverClassName);

        dataSource.setUrl(url);

        dataSource.setUsername(username);

        dataSource.setPassword(password);

        return dataSource;
    }
}*/
