package com.app.shyam.entoty;

public class ServiceImpl implements IService{

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ServiceImpl [id=" + id + "]";
	}
	
	
}
