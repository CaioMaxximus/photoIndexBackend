package com.travel.photo.service;

import org.springframework.stereotype.Service;

import com.travel.photo.model.User;

@Service
public class UserService {

	
	public User getUser() {
		return new User("","");
	}
	
	
}
