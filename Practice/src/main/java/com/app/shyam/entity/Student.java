package com.app.shyam.entity;

public class Student {

	private Long id;
	private String Name;
	private Address address;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", address=" + address + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
