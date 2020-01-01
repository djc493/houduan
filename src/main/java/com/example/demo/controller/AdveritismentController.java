package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Adveritisment;
import com.example.demo.service.AdveritismentService;

@RestController
@RequestMapping("/homepage")
public class AdveritismentController {
	
	@Autowired
	AdveritismentService adveritismentService;
	
	@RequestMapping("/adveritisment")
	public List<Adveritisment> getList(){
		return adveritismentService.getAdveritismentsList();
		
	}
}
