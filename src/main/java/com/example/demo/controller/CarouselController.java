package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Carousel;
import com.example.demo.service.CarouselService;

@RestController
@RequestMapping("/homepage")
public class CarouselController {

	@Autowired
	CarouselService carouselService;
	
	@RequestMapping("/carousel")
	public List<Carousel> getList(){
		return carouselService.getCarouselList();
		
	}
}
