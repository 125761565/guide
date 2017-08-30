package com.guide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guide.dao.IUserDao;
import com.guide.entity.User;
import com.guide.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	
	public User getByUserName(String userName) {
		
		return userDao.getByUserName(userName);
	}

}
