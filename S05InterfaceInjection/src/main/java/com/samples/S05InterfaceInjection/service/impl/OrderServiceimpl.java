package com.samples.S05InterfaceInjection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.dao.OrderDao;
import com.samples.S05InterfaceInjection.service.OrderService;

@Component("service")
public class OrderServiceimpl implements OrderService{
	
	@Autowired
	private OrderDao orderdao;
	

	public OrderDao getOrderdao() {
		return orderdao;
	}


	public void setOrderdao(OrderDao orderdao) {
		this.orderdao = orderdao;
	}


	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceimpl placeOrder method()...");
		orderdao.createOrder();
	}
	
	
}
