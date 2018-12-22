package com.lgy.dao;

import com.lgy.entity.User;

public class UserDao {
	public User login(User user){
		String name = user.getName();
		String pwd = user.getPwd();
		if("liugaoyang".equals(name) && "123456".equals(pwd)){
			return user;
		}
		return null;
	}
	public void register(User user){
		System.out.println("注册成功：用户，"+user.getName());
	}

}
