package com.sjzc.enote.controller;

import com.sjzc.enote.domain.User;
import com.sjzc.enote.repository.UserRepository;
import com.sjzc.enote.utils.ResHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

   //用户注册 -- /api/addUser

    @CrossOrigin
    @RequestMapping(value = "/api/addUser")
    @ResponseBody
    Object addUser(@RequestBody Map<String,Object> params) {
        try {
            String level="writer";
            String sign="说点什么吧";
            String avatar="/img/defaultAvatar.jpeg";
            String name=(String)params.get("name");
            String password=(String)params.get("password");
            String phone=(String)params.get("phone");
            User user = new User(name,password,phone,sign,avatar,level);
            userRepository.save(user);
           return  ResHelper.success("注册成功",null);
        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("注册失败",e.getMessage());

        }



    }


   // 用户名判重校验 -- /api/checkName

    @CrossOrigin
    @RequestMapping(value = "/api/checkName")
    @ResponseBody
    Object checkName(@RequestBody Map<String,String> map) {
        try {
            User user = userRepository.findByName(map.get("name"));

            if(user!=null){
                return  ResHelper.success("用户名被占用",false);
            }else{
                return  ResHelper.success("用户名可用",true);
            }

        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("error",e.getMessage());

        }

    }


    //用户登录 -- /api/login

    @CrossOrigin
    @RequestMapping(value = "/api/login")
    @ResponseBody
    Object login(@RequestBody Map<String,String> map) {
        try {
            User user = userRepository.findByName(map.get("name"));

            if(user!=null){

                //查询结果不为空，继续比对密码

                if(user.getPassword().equals(map.get("password"))){
                    return  ResHelper.success("登录成功",user);
                }else{
                    return  ResHelper.success("密码错误",null);
                }

            }else{
                return  ResHelper.success("该用户不存在",null);
            }

        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("error",e.getMessage());

        }

    }



 //手机号判重校验 -- /api/checkPhone

    @CrossOrigin
    @RequestMapping(value = "/api/checkPhone")
    @ResponseBody
    Object checkPhone(@RequestBody Map<String,String> map) {
        try {
            User user = userRepository.findByPhone(map.get("phone"));

            if(user!=null){
                return  ResHelper.success("手机号被占用",false);
            }else{
                return  ResHelper.success("手机号可用",true);
            }

        }catch(Exception e){
            System.out.println(e);
            return ResHelper.fail("error",e.getMessage());

        }

    }






}


