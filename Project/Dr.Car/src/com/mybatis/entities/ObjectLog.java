package com.mybatis.entities;

public class ObjectLog {
	
	private String user;
	private int pass;
	
	public ObjectLog() {
		// TODO Auto-generated constructor stub
	}

	public ObjectLog(String name , int id) {
		this.user = name;
		this.pass = id;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	
}
