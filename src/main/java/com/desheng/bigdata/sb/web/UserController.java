package com.desheng.bigdata.sb.web;

import com.desheng.bigdata.sb.pojo.User;
import com.desheng.bigdata.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // /user/query/1
    @RequestMapping("query/{id}")
    public User queryById(@PathVariable("id")Long id) {
        User user = userService.queryById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("list")
    public List<User> list() {
        return userService.list();
    }

    @RequestMapping("del/{id}")
    public String deleteById(@PathVariable("id")Long id) {
        int count = userService.deleteById(id);
        if(count == 1) {
            return "删除成功！";
        } else {
            return "删除失败~";
        }
    }
}
