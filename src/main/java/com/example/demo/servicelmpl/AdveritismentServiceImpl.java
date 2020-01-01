package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AdveritismentMapper;
import com.example.demo.model.Adveritisment;

@Service
public class AdveritismentServiceImpl {
	
	@Autowired
	AdveritismentMapper adveritismentMapper;
	
	public List<Adveritisment> getAdveritismentslList(){
		return adveritismentMapper.selectAllAdveritisments();
		
	}
}
