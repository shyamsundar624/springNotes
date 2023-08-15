package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.shyam.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
ApplicationContext context =new ClassPathXmlApplicationContext("appConfig.xml");
System.out.println(context);

Product product = context.getBean("prod",Product.class);
System.out.println(product);
	}
}
