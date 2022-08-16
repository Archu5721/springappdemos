package com.samples.S01_springcoredi;

import java.util.Map;

public class Customer {
	private int id;
	private Map<Integer,String> purchase;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, String> getPurchase() {
		return purchase;
	}
	public void setPurchase(Map<Integer, String> purchase) {
		this.purchase = purchase;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", purchase=" + purchase + "]";
	}
	
	
}
