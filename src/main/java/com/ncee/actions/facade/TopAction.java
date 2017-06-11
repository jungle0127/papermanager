package com.ncee.actions.facade;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@Namespace("/facade")
@Results({
	@Result(name="top",location="/WEB-INF/management/facade/top.jsp"),
	@Result(name="menutree",location="/WEB-INF/management/facade/menutree.jsp"),
	@Result(name="welcome",location="/WEB-INF/management/facade/welcome.jsp")})
public class TopAction extends ActionSupport {
	private static final long serialVersionUID = -3392302879309636244L;
	@Action("top")
	public String getTop(){
		return "top";
	}
	@Action("menutree")
	public String getMenutree(){
		return "menutree";
	}
	@Action("welcome")
	public String getWelcome(){
		return "welcome";
	}
}
