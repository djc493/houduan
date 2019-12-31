package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UcollectMapper;
import com.example.demo.model.Ucollect;
import com.example.demo.service.UcollectService;

@Service

public class UcollectServiceImpl implements UcollectService{
	@Autowired
	UcollectMapper ucollectMapper;

	@Override
	public List<Ucollect> getUcollectsList() {
		// TODO Auto-generated method stub
		
		return (List<Ucollect>) ucollectMapper;
	}

}
