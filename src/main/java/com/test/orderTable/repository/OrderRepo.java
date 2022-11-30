package com.test.orderTable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.orderTable.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>
{
	
}
