package com.ncee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncee.dao.model.Users;
import com.ncee.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	@Qualifier("usersService")
	private UsersService usersService;
	
	@RequestMapping(value="/users")
	public List<Users> getAllUsers(){
		return this.usersService.getAllUsers();
	}
}
