package com.ncee.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;
import org.mockito.runners.MockitoJUnit44Runner;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.ncee.dao.domain.UsersMapper;
import com.ncee.dao.model.Users;

//@RunWith(SpringRunner.class)
@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest
//@ContextConfiguration
//@TestExecutionListeners({
//	DependencyInjectionTestExecutionListener.class,
//	DirtiesContextTestExecutionListener.class,
//	TransactionalTestExecutionListener.class,
//	DbUnitTestExecutionListener.class})
//@DbUnitConfiguration(databaseConnection="primaryDatasource")
public class UsersServiceTest {
	@InjectMocks
	private UsersService userService;
	@Mock
	private UsersMapper usersMapper;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
//	@DatabaseSetup("classpath:dbunit/users.xml")
	public void testFindUser() {
		Users userPojo = new Users();
		userPojo.setUsername("psarbor");
		Mockito.when(this.usersMapper.selectByLogin(Mockito.any(Users.class))).thenReturn(userPojo);
		
		Users pojo = this.userService.findUser("ps", "lotus");	
		Assert.assertNotNull(pojo);
		Assert.assertEquals(pojo, userPojo);
	}
}
