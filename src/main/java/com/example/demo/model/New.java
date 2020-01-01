package com.example.demo.model;

import java.util.Date;

public class New {
	private int nid;
	private String newName;
	private Date releaseDate;
	private String content;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "New [nid=" + nid + ", newName=" + newName + ", releaseDate=" + releaseDate + ", content=" + content
				+ "]";
	}
	
}
