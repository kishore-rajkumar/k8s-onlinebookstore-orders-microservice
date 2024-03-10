package com.kishore.onlinebookstore.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderRestCotroller {

	private OrderService service;
	
	@Autowired
	public OrderRestCotroller(OrderService _service) {
		this.service=_service;
	}

	@GetMapping
	public List<Order> allOrders(){
		return service.getAllOrders();
	}
	
	@GetMapping("{orderId}")
	public Order orderById(@PathVariable String orderId){
		return service.getOrderById(orderId);
	}
	
	@GetMapping("of")
	public List<Order> ordersByUser(@RequestParam("user") String userId){
		return service.getOrderByUser(userId);
	}
}
