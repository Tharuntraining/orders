package com.training.service;

import com.training.dto.UserOrders;
import com.training.utils.Status;

public interface OrdersService {

	public Status createUserOrder(UserOrders userOrder);

}
