package com.aks.app.dao;

import com.aks.app.entity.User;

public interface UserDetailsDao {
	User findUserByUsername(String username);
}
