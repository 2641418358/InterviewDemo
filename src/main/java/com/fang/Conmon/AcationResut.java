package com.fang.Conmon;


import lombok.Data;

/**
 * @program: InterviewDemo
 * @description: 返回结果集封装
 * @author: xiaozhu
 * @create: 2020-08-08 12:46
 **/
@Data
public class AcationResut {
    private String message;
    private Object data;
    private boolean success;

    public static AcationResut Success(Object data){
        AcationResut acationResut = new AcationResut();
        acationResut.message = "success";
        acationResut.data = data;
        acationResut.success = true;
        return acationResut;
    }

    public static AcationResut Success(){
        AcationResut acationResut = new AcationResut();
        acationResut.message = "success";
        acationResut.success = true;
        return acationResut;
    }

    public static AcationResut Fault(String message){
        AcationResut acationResut = new AcationResut();
        acationResut.message = message;
        acationResut.success = false;
        return acationResut;
    }

}
