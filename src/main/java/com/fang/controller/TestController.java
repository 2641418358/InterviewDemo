package com.fang.controller;

import com.fang.Conmon.AcationResut;
import com.fang.pojo.User;
import com.fang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: InterviewDemo
 * @description: 测试显示图层Controller
 * @author: xiaozhu
 * @create: 2020-08-07 17:37
 **/

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/list")
    public AcationResut view(Model model){
        List<User> lists = userService.selectAll();
        return AcationResut.Success(lists);
    }

    @RequestMapping("/save")
    public AcationResut add(User user){
        boolean date = userService.addUser(user) == 1;
        return date ? AcationResut.Success(user) : AcationResut.Fault("后台异常");
    }


    @RequestMapping("/update")
    public AcationResut update(User user){
        boolean flag = userService.updateUser(user) == 1;
        return flag ? AcationResut.Success(user) : AcationResut.Fault("后台异常");
    }

    @RequestMapping("/delete")
    public AcationResut delete(int id){
        boolean flag = userService.deleteUser(id) == 1;
        return flag ? AcationResut.Success() : AcationResut.Fault("暂无数据");
    }

}
