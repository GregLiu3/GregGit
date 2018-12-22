package com.lgy.Service;

import com.lgy.dao.UserDao;
import com.lgy.entity.User;

public class UserService {
	private UserDao dao = new UserDao();
	public User login(User user){
		return dao.login(user);
	}
	public void register(User user){
		dao.register(user);
	}

}
