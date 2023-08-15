package com.app.shyam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.shyam.entity.Address;
import com.app.shyam.entity.Student;

@Configuration
public class Config {
	
	@Bean
	public Address address() {
		Address address=new Address();
		address.setCity("Patna");
		address.setPincode("1234456");
		return address;
	}
	
	@Bean
	public Student student() {
		Student student=new  Student();
		student.setId(12);
		student.setName("shyam");
		student.setAddress(address());
		return student;
	}

}
