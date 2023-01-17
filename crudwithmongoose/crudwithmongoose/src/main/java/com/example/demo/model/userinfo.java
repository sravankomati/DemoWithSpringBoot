package com.example.demo.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class userinfo {
	@Id
	
	String userid; 
	String email, password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public userinfo(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public userinfo() {
		super();
	}

	@Override
	public String toString() {
		return "userinfo [userid=" + userid + ", email=" + email + ", password=" + password + "]";
	}

}
