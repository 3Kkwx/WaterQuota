package com.water.quato.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.water.quato.bean.User;

@Mapper
public interface userMapper {

	public User findUser(String userName,String userPassword,String userIdentity);
}
