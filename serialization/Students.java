package com.jspiders.serialization;

import java.io.Serializable;

public class Students implements Serializable {

	private String name;
	private int  age;
	private String email;
	private long contact;
	
	
	
	public Students(String name, int age, String email, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getContact() {
		return contact;
	}



	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


