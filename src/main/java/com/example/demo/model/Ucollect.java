package com.example.demo.model;

import java.util.Date;

public class Ucollect {
	private int c_id;
	private String writer;
	private String headline;
	private String content;
	private Date u_date;
	public Date getU_date() {
		return u_date;
	}
	public void setU_date(Date u_date) {
		this.u_date = u_date;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Ucollect [c_id=" + c_id + ", writer=" + writer + ", headline=" + headline + ", content=" + content
				+ ", u_date=" + u_date + "]";
	}
	
}
