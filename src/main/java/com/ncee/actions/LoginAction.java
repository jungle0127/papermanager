package com.ncee.actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.ncee.dao.model.Users;
import com.ncee.service.IUsersService;
import com.opensymphony.xwork2.ActionSupport;

//@Namespace("/")
@Results({
	@Result(name="success",location="/WEB-INF/management/manageindex.jsp"),
	@Result(name="error",location="/WEB-INF/assistancepages/error.jsp")
})
@Scope(value = "prototype")
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = -2860468326563825851L;
	private static final Logger logger = LogManager.getLogger(LoginAction.class);
	@Autowired
	private IUsersService userService;

	@Action(value="login")
	public String login() {
		Users user = this.userService.findUser(username, password);
		if(null != user){
			logger.info("Username:{},Password:{},roleId:{}",user.getUsername(),user.getPassword(),user.getId());
			logger.info(this.username + this.password);
			return SUCCESS;
		}
		return ERROR;
	}

	private String username;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String password;


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
