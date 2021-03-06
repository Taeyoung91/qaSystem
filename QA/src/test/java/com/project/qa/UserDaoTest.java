package com.project.qa;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.qa.dao.UserDao;
import com.project.qa.domain.User;
import com.project.qa.dto.LoginDto;
import com.project.qa.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class UserDaoTest {

	@Inject
	private UserDao userDao;
	
	@Inject
	private UserService userService;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(userDao.getTime());
	}
	
	@Test
	public void testInsertUser() throws Exception{
		
		User user = new User();
		user.setUSER_ID("eeddaa");
		user.setUSER_PW("123");
		user.setUSER_NAME("김태영");
		userDao.insertUser(user);
	}
	
}