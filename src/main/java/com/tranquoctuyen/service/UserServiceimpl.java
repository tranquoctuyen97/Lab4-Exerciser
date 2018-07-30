package com.tranquoctuyen.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranquoctuyen.entity.User;
import com.tranquoctuyen.repository.UserDao;
@Transactional
@Service
public class UserServiceimpl implements UserService {
	
private UserDao dao;

	public void setDao(UserDao dao) {
	this.dao = dao;
}

	@Override
	public User getUser(String uername) {
	
		return dao.getUser(uername);
	}

	@Override
	public User checkLogin(String username, String pass) {
		User user=getUser(username);
		if (user!=null &user.getPassword().equals(pass)) {
			return user;
		}
		return null;
	}

	@Override
	public void addUser(User u) {
		dao.addUser(u);
		
	}

	@Override
	public void updateUser(User u) {
		dao.updateUser(u);
		
	}

	@Override
	public void delete(String username) {
		
		dao.delete(username);
		
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return dao.getall();
	}

}
