package com.water.quato.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.water.quato.bean.User;
import com.water.quato.mapper.userMapper;
import com.water.quato.service.userService;

@Service("userService")
public class userServiceImpl implements userService{

	@Resource
	private userMapper userMapper;
	
	@Override
	public User findUser(String userName, String userPassword, String userIdentity) {
		return userMapper.findUser(userName, userPassword, userIdentity);
		// TODO Auto-generated method stub
	}

}
