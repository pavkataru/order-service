package com.learning.order.dto;

import java.util.List;

public class OrderDTOFromFE {
	
	private Integer userId;
	private RestaurantDTO restaurant;
	private List<FoodItemDTO> foodItemsList;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public RestaurantDTO getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantDTO restaurant) {
		this.restaurant = restaurant;
	}
	public List<FoodItemDTO> getFoodItemsList() {
		return foodItemsList;
	}
	public void setFoodItemsList(List<FoodItemDTO> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}
	

}
