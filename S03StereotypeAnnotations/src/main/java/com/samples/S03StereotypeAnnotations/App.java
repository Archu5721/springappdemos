package com.samples.S03StereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S03StereotypeAnnotations.model.Instructor;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springcontainer = new ClassPathXmlApplicationContext(
				"com/samples/S03StereotypeAnnotations/SpringConfig.xml");
		
		Instructor instructor = (Instructor) springcontainer.getBean("instructor");
		System.out.println(instructor);
		System.out.println(instructor.hashCode());
	}
}
