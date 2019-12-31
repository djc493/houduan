package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    List<User> queryByUsername(String username);//用于登陆时，验证用户
	public int register(User user);//用于注册时，添加用户
	
}
