package com.guide.dao;

import com.guide.entity.User;

public interface IUserDao {
	User	getByUserName(String userName);
}
