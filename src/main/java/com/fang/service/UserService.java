package com.fang.service;

import com.fang.pojo.User;

import java.util.List;

public interface UserService {

    /**
    * @Description: 查询所有user对象
    * @Param:
    * @return:  List<User>
    * @Author: xiaozhu
    * @Date: 2020/8/7
    */
    List<User> selectAll();

    /** 
    * @ description: 添加user对象
    * @ param:  User
    * @ return: Integer
    * @ author: xiaozhu
    * @ date: 2020/8/8
    */
    int addUser(User user);

    /**
    * @Description: 修改user对象
    * @Param: User
    * @return:  int
    * @Author: xiaozhu
    * @Date: 2020/8/8
    */
    int updateUser(User user);


    /**
    * @Description: 根据id删除user对象
    * @Param: int
    * @return: int
    * @Author: xiaozhu
    * @Date: 2020/8/8
    */
    int deleteUser(int id);
}
