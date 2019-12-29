package com.desheng.bigdata.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

//添加SpringBootApplication的注解，表示当前类就是springboot的启动类
@SpringBootApplication
@MapperScan({"com.desheng.bigdata.sb.mapper"})
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
