package com.a.b.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.b.mapper.UserMapper;
import com.a.b.pojo.User;
import com.a.b.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper; 
	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}
