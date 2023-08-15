package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.shyam.config.Config;
import com.app.shyam.entity.Address;
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
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
     
        Student bean = context.getBean("student",Student.class);
        Address address = context.getBean("address",Address.class);
        System.out.println(bean);
        System.out.println(address);
    }
}
