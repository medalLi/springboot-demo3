package com.desheng.bigdata.sb.web;

import com.desheng.bigdata.sb.pojo.User;
import com.desheng.bigdata.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("rest")
public class UserController2 {

    @Autowired
    private UserService userService;

    // /user/query  get请求
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User queryById(@PathVariable("id")Long id) {
        User user = userService.queryById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    //delete请求
    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteById(@RequestBody User user) {
        int count = userService.deleteById(user.getId());
        if(count == 1) {
            return "删除成功！";
        } else {
            return "删除失败~";
        }
    }

    //post请求
    @RequestMapping(method = RequestMethod.POST)
    public void saveUser(User user) {

    }

    //put请求
    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(User user) {

    }
}
