package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService
{

	
	//Create
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getRatings();
	
	// get all by userId
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
}
