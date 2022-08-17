package com.samples.S01_springcoredi.scopes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
     
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01_springcoredi/scopes/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp");
        System.out.println(emp.hashCode());
        
        Employee emp1 = (Employee) springContainer.getBean("emp");
        System.out.println(emp1.hashCode());
        
        
    }
}
