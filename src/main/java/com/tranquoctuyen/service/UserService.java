package com.tranquoctuyen.service;

import java.util.List;

import com.tranquoctuyen.entity.User;

public interface UserService {
	  public User getUser(String uername);
	  public User checkLogin(String username,String pass);
	  public void addUser(User u);
	  public void updateUser(User u);
	  public void delete(String username);
	  public List<User> getall();
}
