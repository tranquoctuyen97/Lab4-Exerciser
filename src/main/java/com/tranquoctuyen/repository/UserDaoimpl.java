package com.tranquoctuyen.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.tranquoctuyen.entity.User;

public class UserDaoimpl implements UserDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public User getUser(String username) {
	
		return em.find(User.class, username);
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
		if (getUser(u.getUsername())!=null) {
			em.merge(u);
		}else {
			em.persist(u);
		}
		
		
	}

	@Override
	public void updateUser(User u) {
		em.merge(u);
		
	}

	@Override
	public void delete(String username) {
		User u=getUser(username);
		em.remove(u);
			
	}

	@Override
	public List<User> getall() {
		Query query=em.createQuery("select u from User u");
		return query.getResultList();
	}

}
