package com.desheng.bigdata.sb.service;

import com.desheng.bigdata.sb.mapper.UserMapper;
import com.desheng.bigdata.sb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.selectAll();
    }

    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int deleteById(Long id) {
        int count = userMapper.deleteByPrimaryKey(id);
        return count;//被影响的行数
    }

    @Transactional
    public int saveUser(User user) {
        int count = this.userMapper.insertSelective(user);//有选择新的插入数据
        return count;//被影响的行数
    }

    @Transactional
    public int updateUser(User user) {
        int count = this.userMapper.updateByPrimaryKeySelective(user);
        return count;//被影响的行数
    }
}
