package com.app.shyam.entity;

public class Address {
private Long id;
private String city;
private int pincode;


@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
