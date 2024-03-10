package com.kishore.onlinebookstore.orders;

import java.util.List;

public interface OrderService {

	List<Order> getAllOrders();

	Order getOrderById(String orderId);

	List<Order> getOrderByUser(String userId);

}
