package com.example.webservice.restful.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private static List<User> Users = new ArrayList<User>();
	
	private int usercount = 3;
	static
	{
		Users.add(new User(1,"Venkat",new Date()));
		Users.add(new User(2,"Vineeth",new Date()));
		Users.add(new User(3,"agan",new Date()));
	}
	
	
	public List<User> findall()
	{
		return Users;
	}
	
	public User findone(int id)
	{
		for(User user:Users)
		{
			if(user.getId() == id)
			{
				return user;
			}
			
				
		}
		return null;
	}
	
	public User Saveuser(User user)
	{
		if(user.getId()== null)
		{
			user.setId(++usercount);
		}
		Users.add(user);	
		return user;
	}
	
}
