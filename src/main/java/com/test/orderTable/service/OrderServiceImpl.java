package com.test.orderTable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.orderTable.entity.Order;
import com.test.orderTable.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderServices
{
	@Autowired
	private OrderRepo orderRepo;
	
	@Override
	public List<Order> GetAllOrders() 
	{
		List<Order> orders = orderRepo.findAll();
		return orders;
	}

	@Override
	public Order getOrderById(Integer id) 
	{
		return orderRepo.findById(id).get();
	}

	@Override
	public Order saveOrder(Order order) 
	{
		return orderRepo.save(order);
	}
	
}
