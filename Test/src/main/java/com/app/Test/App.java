package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Test.config.AppConfig;
import com.app.Test.entity.Controller;
import com.app.Test.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		 * Controller controller = context.getBean("controller", Controller.class);
		 * System.out.println(controller);
		 */
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
