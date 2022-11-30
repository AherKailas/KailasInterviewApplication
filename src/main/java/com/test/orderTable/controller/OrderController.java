package com.test.orderTable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.orderTable.entity.Order;
import com.test.orderTable.service.OrderServices;

@Controller
public class OrderController 
{
	@Autowired
	private OrderServices orderServices;
	
	@PostMapping("/order/create")
	public String insertOrder(Order order)
	{
		orderServices.saveOrder(order);
		return "order is inserted";
	}
	
	@GetMapping("/orders")
	public List<Order> getAllOrders()
	{
		return orderServices.GetAllOrders();
	}
	
	@GetMapping("/order/{id}")
	public Order getById(@PathVariable Integer id)
	{
		return orderServices.getOrderById(id);
	}
}
