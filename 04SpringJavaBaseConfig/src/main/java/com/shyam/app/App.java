package com.shyam.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shyam.app.config.AppConfig;
import com.shyam.app.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
    }
}
