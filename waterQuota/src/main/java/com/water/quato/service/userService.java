package com.water.quato.service;

import com.water.quato.bean.User;

public interface userService {

	public User findUser(String userName,String userPassword,String userIdentity);
}
