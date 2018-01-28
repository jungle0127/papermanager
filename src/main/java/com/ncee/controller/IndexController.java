package com.ncee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncee.dao.model.Users;
import com.ncee.service.UsersService;

@RestController
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private UsersService userService;
	@GetMapping(value="/demo")
	public Users getDemo() {
		Users user = this.userService.findUser("ps", "lotus");
		return user;
	}
}
