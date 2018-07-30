package com.tranquoctuyen.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;

public class DeleteUser extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    User user;
	@Autowired
	UserDao userDao;


	



	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String delete() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		
		
		userDao.delete(request.getParameter("username"));
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
