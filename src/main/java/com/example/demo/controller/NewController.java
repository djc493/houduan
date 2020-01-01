package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.New;
import com.example.demo.service.NewService;

@RestController
@RequestMapping("/homepage")
public class NewController {
	
	@Autowired
	NewService newService;
	
	@RequestMapping("/new")
	public List<New> getList(){
		return newService.getNewList();
		
	}
}
