package com.app.shyam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.shyam.entoty.Controller;

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
        Controller controller = context.getBean("controller",Controller.class);
        System.out.println(controller);
    }
}
