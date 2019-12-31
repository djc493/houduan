package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ucollect;
import com.example.demo.service.UcollectService;

@RestController
@RequestMapping("/Ucollect")

public class UcollectController {
	@Autowired
	UcollectService ucollectService;
	
	@RequestMapping("/getList")
	public List<Ucollect> getList(){
		return ucollectService.getUcollectsList();
	}

}
