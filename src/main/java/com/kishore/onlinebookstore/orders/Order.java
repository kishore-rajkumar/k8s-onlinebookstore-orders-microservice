package com.kishore.onlinebookstore.orders;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private Long id;		 			//Unique identifier for the order.
    private Long userId; 	 			//Unique identifier for the user who placed the order.
    private LocalDate date;		 			//Date and time when the order was placed.
    private List<Long> items; 		//List of order items, each containing details such as productId, productName, quantity, unitPrice, and totalPrice.
    private String shippingAddress; 	//Shipping address for the order.
    private String status; 				//Current status of the order (e.g., "pending", "shipped", "delivered", etc.).
    private Double totalAmount; 		//Total amount for the order, including the sum of totalPrice for all order items.
}
