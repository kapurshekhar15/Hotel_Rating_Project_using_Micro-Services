package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.User;

public interface UserService {
	// user operations

	// create
	User saveUser(User user);

	// get all user
	List<User> getAllUser();

	// get single user of given UserId
	User getUser(String userId);
}
