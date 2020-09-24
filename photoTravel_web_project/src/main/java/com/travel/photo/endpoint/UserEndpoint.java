package com.travel.photo.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.photo.model.User;

@RestController
@ResponseBody
@RequestMapping("user")
public class UserEndpoint {

	
	
	@RequestMapping(method = RequestMethod.GET , path = "")
	public User getUser() {
		return new User("Caio" ,"Max@gmail.com");
		
	}
	
	
}
