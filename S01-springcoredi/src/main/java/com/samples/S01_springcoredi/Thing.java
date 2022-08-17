package com.samples.S01_springcoredi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Thing {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Thing() {
		super();
		System.out.println("I am a consturctor");
	}
	@Override
	public String toString() {
		return "Thing [id=" + id + "]";
	}
	
	@PostConstruct
	private void method1() {
		System.out.println("I am method1()");
	}

	@PreDestroy
	private void method2() {
		System.out.println("I am method2()");
	}
	
	

}
