package com.desheng.bigdata.sb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/*
//使用springboot的配置文件进行注入操作
@Configuration //当前注解指定当前类是一个配置信息的类
@EnableConfigurationProperties({JdbcProperties.class})//指定要注入的配置类JdbcProperties
public class JdbcConfig2 {

    *//*@Autowired
    private JdbcProperties jdbc;

    @Autowired
    public void setJdbc(JdbcProperties jdbc) {
        this.jdbc = jdbc;
    }*//*

    @Bean //当前配置就将该方法的返回值作为spring中的bean注入到spring工厂中
    public DataSource dataSource(JdbcProperties jdbc) {
        DruidDataSource dataSource = new DruidDataSource();//数据源， 需要指定最基本的4个参数
        dataSource.setPassword(jdbc.getPassword());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        return dataSource;
    }
}*/
