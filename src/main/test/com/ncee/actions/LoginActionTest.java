package com.ncee.actions;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;

import org.apache.struts2.StrutsSpringJUnit4TestCase;
import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.opensymphony.xwork2.ActionProxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.context.cfg.xml"})
public class LoginActionTest extends StrutsSpringJUnit4TestCase<LoginAction> {
//	protected String[] getContextLocations() {
//		return new String[] { "struts.xml", "classpath:spring.context.cfg.xml" };
//	}
	public void setUp(){
		try {
			super.setUp();
			request = new MockHttpServletRequest();
			response = new MockHttpServletResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testLogin() {
		ActionProxy proxy = null;
		request.setParameter("username", "ps");
		request.setParameter("password", "lotus");
		proxy = getActionProxy("/login");
		LoginAction loginAction = (LoginAction) proxy.getAction();
		try {
			String result = loginAction.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
