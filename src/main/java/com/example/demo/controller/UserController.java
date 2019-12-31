package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userservice;
	private User user;
    @RequestMapping("/register")
    public Response register(@RequestBody Map<String, String> person){
        String username = person.get("username");
        String PASSWORD = person.get("PASSWORD");
        String phone = person.get("phone");
        String sex = person.get("sex");
        int age = Integer.parseInt(person.get("age"));
        String Email = person.get("Email");
        String IDcardNumber = person.get("IDcardNumber");
        //1.判断用户名、密码、手机号是否为空
        if(username != null && PASSWORD != null && phone != null && sex != null && age != 0 && Email != null && IDcardNumber != null){
            List<User> users =  userservice.queryByUsername(username);
            //2.判断是否有重复用户名
            if(users!=null && users.size()>0){
                return new Response();
            }else {
                int count = userservice.register(user);//User(username, PASSWORD, phone, sex, age, Email, IDcardNumber);
                if(count>0){
                    //3.没有重复用户名，注册成功
                    return new Response();

                }else {
                    return new Response();
                }
            }
        }else{
            return new Response();
        }
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Response login(@RequestBody Map<String, String> person){
        String username = person.get("username");
        String PASSWORD = person.get("PASSWORD");
        //1. 判断用户名、密码是否为空
        if(username != null && PASSWORD != null ){
            List<User> users =  userservice.queryByUsername(username);
            //2. 判断用户名是否存在
            if(users!=null && users.size()>0){
                User user = users.get(0);
                //3. 判断密码是否正确
                if(PASSWORD.equals(user.getPASSWORD())){
                    //4. 密码正确，登陆成功
                    return new Response();
                }else {
                    return new Response();
                }
            }else {
                return new Response();
            }
        }else {
            return new Response();
        }
    }
}