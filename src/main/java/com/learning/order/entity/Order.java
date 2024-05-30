package com.learning.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.learning.order.dto.FoodItemDTO;
import com.learning.order.dto.RestaurantDTO;
import com.learning.order.dto.UserDTO;


@Document("order")
public class Order {
	
	
	private Integer OrderId;
	private List<FoodItemDTO> foodItemsList;
	private RestaurantDTO restaurant;
	private UserDTO userDTO;
	public Integer getOrderId() {
		return OrderId;
	}
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	public List<FoodItemDTO> getFoodItemsList() {
		return foodItemsList;
	}
	public void setFoodItemsList(List<FoodItemDTO> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}
	public RestaurantDTO getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantDTO restaurant) {
		this.restaurant = restaurant;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public Order(Integer orderId, List<FoodItemDTO> foodItemsList, RestaurantDTO restaurant, UserDTO userDTO) {
		super();
		OrderId = orderId;
		this.foodItemsList = foodItemsList;
		this.restaurant = restaurant;
		this.userDTO = userDTO;
	}

}
