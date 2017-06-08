package com.ncee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncee.dao.domain.UsersMapper;
import com.ncee.dao.model.Users;
import com.ncee.service.IUsersService;

@Service("userService")
public class UsersService implements IUsersService {
	@Autowired
	private UsersMapper userMapper;
	@Override
	public Users findUser(String loginName, String password) {
		Users user = new Users();
		user.setUsername(loginName);
		user.setPassword(password);
		return this.userMapper.selectUserByLoginInfomation(user);		
	}
}
