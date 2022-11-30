package com.test.orderTable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.orderTable.entity.Order;

@Service
public interface OrderServices
{
	public List<Order> GetAllOrders();
	
	public Order getOrderById(Integer id);
	
	public Order saveOrder(Order order);
}
