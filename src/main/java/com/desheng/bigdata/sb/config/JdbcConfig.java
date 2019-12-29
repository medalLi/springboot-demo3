//package com.desheng.bigdata.sb.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
//
//@Configuration //当前注解指定当前类是一个配置信息的类
//public class JdbcConfig {
//
//
//    @Bean //当前配置就将该方法的返回值作为spring中的bean注入到spring工厂中
//    /**
//     * 声明要注入的属性前缀，SpringBoot会自动把相关属性通过set方法注入到DataSource中
//     */
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();//数据源， 需要指定最基本的4个参数
//        return dataSource;
//    }
//}
