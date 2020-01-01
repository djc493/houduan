package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NewMapper;
import com.example.demo.model.New;

@Service
public class NewServiceImpl {
	
	@Autowired
	NewMapper newMapper;
	
	public List<New> getNewList(){
		return newMapper.selectAllNew();
		
	}
}
