package com.guide.entity;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private String passworld;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String passworld) {
		super();
		this.id = id;
		this.userName = userName;
		this.passworld = passworld;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassworld() {
		return passworld;
	}

	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passworld=" + passworld + "]";
	}
	
}
