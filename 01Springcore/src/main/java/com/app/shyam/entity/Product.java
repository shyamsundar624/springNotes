package com.app.shyam.entity;

public class Product {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting value of ID");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting value of Name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
