package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.dto.UserOrders;
import com.training.service.OrdersService;
import com.training.utils.Status;

@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@PostMapping("placeuserorders")
	public Status createUserOrder(@RequestBody UserOrders userOrder) {
		return ordersService.createUserOrder(userOrder);
	}

}
