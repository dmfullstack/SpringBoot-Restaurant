package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Restaurant;

@Service
public interface RestaurantService {

	public Restaurant addRestaurant(Restaurant restaurant);
	public List<Restaurant> findAll();
	public String deleteRestaurant(int restaurantId);
	public Restaurant searchById(int restaurantId);
	public Restaurant searchByName(String restaurantName);
}
