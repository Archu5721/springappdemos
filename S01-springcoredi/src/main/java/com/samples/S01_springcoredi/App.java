package com.samples.S01_springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01_springcoredi/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp");
        System.out.println(emp);
    }
}
