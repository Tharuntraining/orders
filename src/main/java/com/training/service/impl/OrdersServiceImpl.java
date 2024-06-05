package com.training.service.impl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.UserOrdersDao;
import com.training.dto.UserOrders;
import com.training.model.Orders;
import com.training.model.ProductsOrdered;
import com.training.service.OrdersService;
import com.training.utils.Status;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private UserOrdersDao userOrdersDao;

	@Override
	public Status createUserOrder(UserOrders userOrder) {
		Orders orderEntity = new Orders();
		orderEntity.setUserId(userOrder.getUserId());
		orderEntity.setOrderStatus("Inprogress");
		orderEntity.setTotalOrderPrice(userOrder.getOrderTotalPrice());
		orderEntity.setOrderedProducts(userOrder.getOrderedProducts().stream().map(dto -> {
			ProductsOrdered po = new ProductsOrdered();
			po.setProductId(dto.getProductId());
			po.setProductStatus("Inprogress");
			po.setUserOrder(orderEntity);
			return po;
		}).collect(Collectors.toList()));

		Orders response = userOrdersDao.save(orderEntity);
		return response != null ? Status.SUCCESS : Status.FAILED;
	}

}
