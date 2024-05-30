package com.learning.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learning.order.dto.OrderDTOFromFE;
import com.learning.order.dto.UserDTO;
import com.learning.order.entity.Order;
import com.learning.order.repo.OrderRepo;


@Service
public class OrderService {
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	SequenceGenerator sequenceGenerator;
	
	@Autowired
	RestTemplate restTemplate;
	
	

	public Order saveOrderInDb(OrderDTOFromFE orderDetails) {
		
		Integer newOrderID = sequenceGenerator.generateNextOrderId();
		// TODO Auto-generated method stub
		UserDTO userDto = fetchOrderDetailsFromUserId(orderDetails.getUserId());
		
     Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), userDto);
		orderRepo.save(orderToBeSaved);
		return orderToBeSaved;
	}


	private UserDTO fetchOrderDetailsFromUserId(Integer userId) {
		
		
		return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/" + userId, UserDTO.class);
		
	}
	

}
