package com.example.demo.mapper;

//import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper

public interface UserMapper {
    public	int insertUser(User user);
    //List<User> selectUsersByUsername(String username);
	public User selectUserByUsername(String username);

}
