package com.tranquoctuyen.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;

public class UpdateUser extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User user;
	String username;
	@Autowired
	UserDao userDao;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String input() throws Exception {
		user=userDao.getUser(username);
		return INPUT;
	}

	
	public String update() throws Exception {
		if (userDao.getUser(username)==null) {
			userDao.updateUser(user);
			return SUCCESS;
		}
		return INPUT;
	}
}
