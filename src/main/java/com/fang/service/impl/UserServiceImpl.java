package com.fang.service.impl;

import com.fang.mapper.UserMapper;
import com.fang.pojo.User;
import com.fang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: InterviewDemo
 * @description: userservice实现类
 * @author: xiaozhu
 * @create: 2020-08-07 18:34
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
