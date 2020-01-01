package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.New;

@Mapper
public interface NewMapper {
	public List<New> selectAllNew();
}
