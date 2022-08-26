package com.user.managment.model;

public class User {
	private String name;
	private String oragName;

	
	public User(String name, String oragName) {
		super();
		this.name = name;
		this.oragName = oragName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOragName() {
		return oragName;
	}

	public void setOragName(String oragName) {
		this.oragName = oragName;
	}

}
