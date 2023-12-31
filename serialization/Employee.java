package com.jspiders.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private String name;
	private int age;
	private String address;
	private long contact;
	
	
	public Employee(String name, int age, String address, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	
	
	
}
