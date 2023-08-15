package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.shyam.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
