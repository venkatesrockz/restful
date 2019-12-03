package com.example.webservice.restful.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<User> getoneuser(@PathVariable Integer id)
	{
		
		User ret = service.findone(id);
		if(ret == null)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(ret, HttpStatus.OK);
	}

}
