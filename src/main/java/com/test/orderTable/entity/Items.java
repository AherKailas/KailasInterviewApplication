package com.test.orderTable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class Items 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private Integer itemId;
	
	//@Column(name = "order_id")
	//private Integer orderId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_unit_price")
	private Double itemUnitPrice;
	
	@Column(name = "item_quantity")
	private Integer itemQuantity;

}
