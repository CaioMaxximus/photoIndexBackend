package com.travel.photo.endpoint;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.photo.model.User;

@RestController
@ResponseBody
@RequestMapping("users")
public class UserEndpoint {

	
	
	@RequestMapping(method = RequestMethod.GET , path = "/{id}")
	public User getUser(@PathVariable int id) {
		return new User("Caio" ,"Max@gmail.com");
		
	}
	
	
}
