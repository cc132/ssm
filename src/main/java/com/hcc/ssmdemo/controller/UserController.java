package com.hcc.ssmdemo.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hcc.ssmdemo.pojo.User;
import com.hcc.ssmdemo.pojo.UserInf;
import com.hcc.ssmdemo.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/showAllUsers")
	public ModelAndView showUsers() {
		ModelAndView mv = new ModelAndView("show");
		ArrayList<UserInf> users = userService.getAllUser();
		mv.addObject("data", users);
		return mv;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public ArrayList<UserInf> showAllUserAsString(@RequestBody User user){
		System.out.println(user.getAccount() + ":" + user.getPassword());
		ArrayList<UserInf> allUser = userService.getAllUser();
		
		//再添加一条中文数据
		UserInf user1 = new UserInf();
		user1.setName("黄春超");
		user1.setAge(24);
		allUser.add(user1);
		return allUser;
	}
}
