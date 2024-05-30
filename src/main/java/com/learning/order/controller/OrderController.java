package com.learning.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.order.dto.OrderDTOFromFE;
import com.learning.order.entity.Order;
import com.learning.order.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/saveOrder")
	public ResponseEntity<Order> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
		
		Order orderSavedInDB = orderService.saveOrderInDb(orderDetails);
		return new ResponseEntity<>(orderSavedInDB,HttpStatus.CREATED);
	}
	
	

}
