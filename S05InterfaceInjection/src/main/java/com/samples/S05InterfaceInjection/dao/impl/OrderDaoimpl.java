package com.samples.S05InterfaceInjection.dao.impl;

import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.dao.OrderDao;

@Component
public class OrderDaoimpl implements OrderDao{

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDaoimpl Class CreateOrder method()...");
	}
	
}
