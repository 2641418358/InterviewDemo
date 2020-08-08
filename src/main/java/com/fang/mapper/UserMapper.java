package com.fang.mapper;

import com.fang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /** 
    * @Description: 查询所有user对象 
    * @Param:
    * @return:  
    * @Author: xiaozhu 
    * @Date: 2020/8/7 
    */
    List<User> selectAll();

    /**
    * @Description: 增加user对象
    * @Param:
    * @return:
    * @Author: xiaozhu
    * @Date: 2020/8/8
    */
    int addUser(User user);

    /**
     * @Description: 修改user对象
     * * @Param: User
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
