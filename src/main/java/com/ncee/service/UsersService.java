package com.ncee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncee.dao.domain.UsersMapper;
import com.ncee.dao.model.Users;

@Service("usersService")
public class UsersService {
	@Autowired
	private UsersMapper userMapper;

	public Users findUser(String loginName, String password) {
		Users user = new Users();
		user.setUsername(loginName);
		user.setPassword(password);
		return this.userMapper.selectByLogin(user);
	}
}
