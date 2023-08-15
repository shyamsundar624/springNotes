package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.shyam.entity.Farmer;

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
        Farmer farmer = context.getBean("farmer",Farmer.class);
        System.out.println(farmer);
    }
}
