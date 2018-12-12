package com.hcc.ssmdemo.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcc.ssmdemo.mapper.UserMapper;
import com.hcc.ssmdemo.pojo.UserInf;
import com.hcc.ssmdemo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserMapper userMapper;
	
	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public ArrayList<UserInf> getAllUser() {
		return userMapper.getAllUser();
	}

}
