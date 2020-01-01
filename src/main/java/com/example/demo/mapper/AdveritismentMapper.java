package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Adveritisment;

@Mapper
public interface AdveritismentMapper {
	public List<Adveritisment> selectAllAdveritisments();
}
