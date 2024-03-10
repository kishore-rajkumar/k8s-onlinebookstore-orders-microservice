package com.kishore.onlinebookstore.orders;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImplWithDummyData implements OrderService {

	private List<Order> orders;

	{
		Order o1 = new Order(1L, 10001L, LocalDate.of(2024, 1, 16), Arrays.asList(1L, 3L), "Khanapara, Ghy",
				Status.IN_TRANSIT.get(), 1245.00);
		Order o2 = new Order(2L, 10003L, LocalDate.of(2023, 12, 10), Arrays.asList(1L), "Paltan Bazar, Ghy",
				Status.SHIPPED.get(), 745.00);
		orders = Stream.of(o1, o2).collect(Collectors.toList());
	}

	@Override
	public List<Order> getAllOrders() {
		return orders;
	}

	@Override
	public Order getOrderById(String orderId) {
		Long id = Long.parseLong(orderId);
		Order order = orders.stream().filter(o -> o.getId() == id).findFirst().get();
		return order;
	}

	@Override
	public List<Order> getOrderByUser(String userId) {
		Long id = Long.parseLong(userId);
		List<Order> userOrders = orders.stream()
				.filter(o -> o.getUserId().equals(id)).collect(Collectors.toList());
		return userOrders;
	}

}
