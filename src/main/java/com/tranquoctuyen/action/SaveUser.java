package com.tranquoctuyen.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;

public class SaveUser extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User user;
	@Autowired
	UserDao userDao;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String add() throws Exception {
	
			userDao.addUser(user);
		
		return SUCCESS;
	}
}
