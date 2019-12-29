package com.desheng.bigdata.sb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController()
@RequestMapping("/hello1")
public class HelloController1 {

    @Autowired
    DataSource dataSource;

    @RequestMapping("hello")
    public String hello() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
