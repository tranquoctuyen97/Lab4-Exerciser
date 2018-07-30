package com.tranquoctuyen.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;

public class UserFindAll extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserDao userDao;

	private List<User> listUSER;
	
	public String list() throws Exception {
		listUSER=userDao.getall();
		System.out.println("call list");
		for (User t: listUSER) {
			System.out.println(t.getName());
			System.out.println(t.getUsername());
		}
		System.out.println("end call list");
		return SUCCESS;
	}

	public List<User> getListUSER() {
		return listUSER;
	}

	public void setListUSER(List<User> listUSER) {
		this.listUSER = listUSER;
	}
	
}
