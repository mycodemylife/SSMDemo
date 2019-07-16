package com.a.b.contorller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.a.b.pojo.User;
import com.a.b.service.IUserService;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/all")
	@ResponseBody
	public String getAllUser(HttpServletRequest request) {
		List<User> allUser = userService.getAllUser();
		return JSON.toJSONString(allUser);
	}
}
