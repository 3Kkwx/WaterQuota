package com.water.quato.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.water.quato.bean.User;
import com.water.quato.service.userService;

@Controller
public class userController {

	@Resource
	private userService userService;

	// 用户登录注册页面
	@RequestMapping("/Login")
	private String infoJsp() {
		return "login";
	}

	@RequestMapping("/login")
	public String loginTorF(@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword, @RequestParam("userIdentity") String userIdentity) {
		User userInfo = userService.findUser(userName, userPassword, userIdentity);
		String result;
		if (userInfo != null) {
			// 跳转登录后的页面
			result = "shouYe";
		} else {
			// 页面不跳转，提示用户重新输入用户名和密码
			result = null;
		}
		return result;
	}

}
