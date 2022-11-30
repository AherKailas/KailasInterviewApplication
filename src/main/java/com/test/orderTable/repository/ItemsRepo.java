package com.test.orderTable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.orderTable.entity.Items;

public interface ItemsRepo extends JpaRepository<Items, Integer> 
{
	
}
