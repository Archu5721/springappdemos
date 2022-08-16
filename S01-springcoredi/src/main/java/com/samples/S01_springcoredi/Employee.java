package com.samples.S01_springcoredi;

public class Employee {
	private int id;
	private String name;
	private String Companyname;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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
		return "Employee [id=" + id + ", name=" + name + ", Companyname=" + Companyname + "]";
	}

}
