package com.tranquoctuyen.repository;

import java.util.List;

import com.tranquoctuyen.entity.User;

public interface UserDao {
  public User getUser(String uername);
  public User checkLogin(String username,String pass);
  public void addUser(User u);
  public void updateUser(User u);
  public void delete(String username);
  public List<User> getall();
}
