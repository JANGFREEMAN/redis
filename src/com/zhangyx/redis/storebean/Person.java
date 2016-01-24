package com.zhangyx.redis.storebean;

import java.io.Serializable;

public class Person implements Serializable{

	private int age ; 
	private String username;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
