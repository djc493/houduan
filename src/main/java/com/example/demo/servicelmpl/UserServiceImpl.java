package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@Service
public abstract class UserServiceImpl  implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		User user2 = userMapper.selectUserByUsername(user.getUsername());
		int i = -1;
		if (user2==null) {
			userMapper.insertUser(user);
		}else {
			i = 2;
		}

		return 1;
	}
}
