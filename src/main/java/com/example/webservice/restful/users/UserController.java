package com.example.webservice.restful.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	
	@GetMapping(path = "/Users")
	public List<User> getallusers()
	{
		return service.findall();
	}
	
	@GetMapping(path = "/Users/{id}")
	public User getoneuser(@PathVariable Integer id)
	{
		return service.findone(id);
	}

}
