package com.shyam.app.model;

public class Book {
private int id;
private String name;
private double cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", cost=" + cost + "]";
}


}
