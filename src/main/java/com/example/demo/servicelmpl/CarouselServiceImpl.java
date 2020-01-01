package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CarouselMapper;
import com.example.demo.model.Carousel;
import com.example.demo.service.CarouselService;

@Service
public class CarouselServiceImpl implements CarouselService{
	
	@Autowired
	CarouselMapper carouselMapper;
	
	@Override
	public List<Carousel> getCarouselList(){
		// TODO Auto-generated method stub
		return carouselMapper.selectAllCarousels();
	}
}
