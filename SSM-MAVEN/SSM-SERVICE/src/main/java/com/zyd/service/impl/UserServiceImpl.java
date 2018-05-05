package com.zyd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyd.mapper.UserMapper;
import com.zyd.pojo.User;
import com.zyd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		this.userMapper.insertUser(user);
	}

}
