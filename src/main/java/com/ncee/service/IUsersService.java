package com.ncee.service;

import com.ncee.dao.model.Users;

public interface IUsersService {
	Users findUser(String loginName,String password);
}
