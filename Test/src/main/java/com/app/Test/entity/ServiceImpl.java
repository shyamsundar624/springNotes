package com.app.Test.entity;

public class ServiceImpl implements IService {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ServiceImpl [id=" + id + "]";
	}
	
}
