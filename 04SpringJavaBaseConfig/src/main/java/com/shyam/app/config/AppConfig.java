package com.shyam.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shyam.app.model.Book;

@Configuration
public class AppConfig {

	@Bean(name="book")
	public  Book getBook() {
		Book book=new Book();
		book.setId(10);
		book.setName("First Head Java");
		book.setCost(2423.343);
		return book;
	}
}
