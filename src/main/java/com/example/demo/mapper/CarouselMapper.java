package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Carousel;

@Mapper
public interface CarouselMapper {
	public List<Carousel> selectAllCarousels();
}
