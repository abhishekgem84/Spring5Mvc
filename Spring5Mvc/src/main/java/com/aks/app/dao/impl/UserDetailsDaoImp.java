package com.aks.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aks.app.dao.UserDetailsDao;
import com.aks.app.entity.User;

@Repository
public class UserDetailsDaoImp implements UserDetailsDao {

	@Autowired
	private SessionFactory sessionFatory;

	public User findUserByUsername(String username) {
		return sessionFatory.getCurrentSession().get(User.class,username);
	}

}
