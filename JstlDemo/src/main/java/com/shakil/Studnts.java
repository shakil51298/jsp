package com.shakil;

public class Studnts {
	String name;
	int rollNum;
	String phone ; 

	// setter and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
// constructors
	public Studnts(String name, int rollNum , String phone) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.phone = phone ; 
	}

	@Override
	public String toString() {
		return "Studnts [name=" + name + ", rollNum=" + rollNum + ", phone=" + phone + "]";
	}
}
