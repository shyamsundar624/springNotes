package com.app.shyam.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Farmer {

	private List<String> name;
	private Set<String> code;
	private Map<Integer,String> farm;
	private Properties pro;
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public Set<String> getCode() {
		return code;
	}
	public void setCode(Set<String> code) {
		this.code = code;
	}
	public Map<Integer, String> getFarm() {
		return farm;
	}
	public void setFarm(Map<Integer, String> farm) {
		this.farm = farm;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Farmer [name=" + name + ", code=" + code + ", farm=" + farm + ", pro=" + pro + "]";
	}
	
	

}
