package com.infyshine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer userid;
	private String userName;
	private String password;
	public Integer getUserid() {
		return userid;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", password=" + password + "]";
	}
	

}
