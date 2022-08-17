package com.samples.S01_springcoredi.constructor;

public class Employee {
	private int id;
	private String name;
	private String Companyname;
	private Address address;
	
	
	
	public Employee(int id, String name, String companyname, Address address) {
		super();
		this.id = id;
		this.name = name;
		Companyname = companyname;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Companyname=" + Companyname + ", address=" + address + "]";
	}


	
}
