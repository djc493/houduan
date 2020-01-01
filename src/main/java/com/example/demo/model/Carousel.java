package com.example.demo.model;

import java.util.Date;

public class Carousel {
	private int cId;
	private String poster;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	@Override
	public String toString() {
		return "Carousel [cId=" + cId + ", poster=" + poster + "]";
	}
	
}
