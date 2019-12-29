package com.desheng.bigdata.sb.web;

import com.desheng.bigdata.sb.pojo.User;
import com.desheng.bigdata.sb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user2")
public class UserController3 {

    @Autowired
    private UserService userService;

    /**
     /user/query  get请求
     *  ResponseEntity<User> 响应实体
     *      response header
     *      response body
     *      response 短语
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<User> queryById(@PathVariable("id")Long id) {
        try {
            User user = userService.queryById(id);
            if(user == null) { //用户没有找到，资源不存在
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.status(HttpStatus.OK).body(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<List<User>> list() {
        try {
            List<User> list = userService.list();
            if(list == null || list.size() == 0) { //用户没有找到，资源不存在
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.ok(list);//返回状态码为200的一种简写方式
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    //post请求
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> saveUser(User user) {
        try {
            int count = this.userService.saveUser(user);
            if(count == 0) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } else {//创建资源成功 201
                return ResponseEntity.status(HttpStatus.CREATED).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    //put请求
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(@RequestBody User user) {
        if(user == null) { //参数不合法 400
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        try {
            int count = this.userService.updateUser(user);
            if(count == 0) {//404
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } else {//204
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();//500
    }

    //delete请求
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteById(@RequestBody User user) {
        try {
            int count = userService.deleteById(user.getId());
            if(count == 0) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            } else {//操作已经成功，但是没有返回内容，204
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
