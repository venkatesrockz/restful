package com.example.webservice.restful.users;

import java.util.Date;

public class User {

	private Integer Id;
	private String Name;
	private Date BD;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBD() {
		return BD;
	}
	public void setBD(Date bD) {
		BD = bD;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", BD=" + BD + "]";
	}
	public User(Integer id, String name, Date bD) {
		super();
		Id = id;
		Name = name;
		BD = bD;
	}
	
	
	
	
}
