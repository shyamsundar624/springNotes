package com.app.Test.entity;

public class Controller {
private String id;
private String name;
private IService service;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public IService getService() {
	return service;
}
public void setService(IService service) {
	this.service = service;
}
@Override
public String toString() {
	return "Controller [id=" + id + ", name=" + name + ", service=" + service + "]";
}



}
