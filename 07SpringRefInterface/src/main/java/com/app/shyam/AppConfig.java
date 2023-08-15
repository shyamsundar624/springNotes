package com.app.shyam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.shyam.entoty.Controller;
import com.app.shyam.entoty.IService;
import com.app.shyam.entoty.ServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public IService service() {
		ServiceImpl service=new ServiceImpl();
		service.setId(34);
		return service;
	}
	
	@Bean
	public Controller controller() {
		Controller controller=new Controller();
		controller.setId(88);
		controller.setName("Rest Controller");
		controller.setService(service());
		return controller;
	}
}
