package com.ncee.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@Results({
	@Result(name="success",location="/index.jsp"),
	@Result(name="fail",location="/login.jsp")
})
@Service(value="userAction")
@Scope(value="prototype")
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = -2860468326563825851L;
	
	@Action(value="/login")
	public String login(){
		return SUCCESS;
	}
	
	private String loginName;
	private String password;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
