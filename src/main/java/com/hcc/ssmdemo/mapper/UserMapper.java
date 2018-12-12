package com.hcc.ssmdemo.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.hcc.ssmdemo.pojo.UserInf;

@Repository("userMapper")
public interface UserMapper {
	ArrayList<UserInf> getAllUser();
}
