package com.samples.S03StereotypeAnnotations.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
	@Value("Java Instructor")
	private String name;
	
	@Value("Pearl Academy")
	private String Companyname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", Companyname=" + Companyname + "]";
	}
	
	

}
