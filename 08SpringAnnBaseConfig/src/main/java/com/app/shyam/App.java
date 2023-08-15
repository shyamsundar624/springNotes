package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.app.shyam.config.AppConfig;
import com.app.shyam.entity.Student;

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
Student student = context.getBean("student",Student.class);
System.out.println(student);
    }
}
