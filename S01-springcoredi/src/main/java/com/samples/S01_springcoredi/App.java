package com.samples.S01_springcoredi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01_springcoredi/SpringConfig.xml");
        
//        Employee emp = (Employee) springContainer.getBean("emp");
//        System.out.println(emp);
        
//        Hospital hp = (Hospital) springContainer.getBean("hospital");
//        System.out.println(hp);
        
//        CarDealer cd = (CarDealer) springContainer.getBean("cardealer");
//        System.out.println(cd);
        
//        Customer customer = (Customer) springContainer.getBean("customer");
//        System.out.println(customer);
//        
        ShoppingCart shopping = (ShoppingCart) springContainer.getBean("shopping");
        System.out.println(shopping);
    }
}
