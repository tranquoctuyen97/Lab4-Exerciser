package com.tranquoctuyen.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.service.UserService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class AllActionFuckyou extends ActionSupport implements ModelDriven<User>{

	
	private static final long serialVersionUID = 1L;
	private User user=new User();
	private List<User> userList=new ArrayList<>();
	@Autowired
	private UserService Service ;

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String list() {
		userList=Service.getall();
		return SUCCESS;
	}
	public String save() {
		Service.addUser(user);
		return SUCCESS;
	}

   public String delete() {
	   HttpServletRequest request 
	   = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	 
	   Service.delete(request.getParameter("username"));
	   return SUCCESS;
   }
   public String update() {
	   HttpServletRequest request 
	   = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
	   user=Service.getUser(request.getParameter("username"));
	  // Service.updateUser(user);
	  
	   return SUCCESS;
	   
   }
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
