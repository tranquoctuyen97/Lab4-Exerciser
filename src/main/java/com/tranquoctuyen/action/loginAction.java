package com.tranquoctuyen.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;

public class loginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User user;
	@Autowired
	UserDao  userDao;
	@Override
	public void validate() {
	if (user.getUsername().length()==0) {
		addFieldError("user.username", "vui long nhap user");
	}
	if (user.getUsername().length()==0) {
		addFieldError("user.password", "vui long nhap pass");
	}
	if (userDao.checkLogin(user.getUsername(), user.getPassword())==null) {
		addFieldError("user.username", "null data");
	}
		
	}

	@Override
	public String execute() throws Exception {
		if (userDao.checkLogin(user.getUsername(), user.getPassword())!=null) {
			return SUCCESS;
		}
			 this.addActionError("Invalid username and password");
			
		
		return INPUT;
	
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
