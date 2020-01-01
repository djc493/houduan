package com.example.demo.model;

import java.util.Date;

public class Adveritisment {
	private int aId;
	private String adName;
	private String city;
	private Date releaseDate;
	private String poster;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	@Override
	public String toString() {
		return "Adveritisment [aId=" + aId + ", adName=" + adName + ", city=" + city + ", releaseDate=" + releaseDate
				+ ", poster=" + poster + "]";
	}
	
}
