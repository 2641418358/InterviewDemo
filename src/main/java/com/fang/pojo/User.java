package com.fang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: InterviewDemo
 * @description: 用户对象
 * @author: xiaozhu
 * @create: 2020-08-07 18:19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    int id;
    String mobile;
    String password;
    String sex;
    Date birthdate;
    String address;
    String email;
    String state;
    Date create_time;
    Date update_time;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
