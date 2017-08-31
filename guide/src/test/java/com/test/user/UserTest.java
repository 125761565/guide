package com.test.user;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.guide.entity.User;
import com.guide.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-db.xml" })
@Transactional
public class UserTest {
	
	@Autowired
	private IUserService userDao;
	
	@Test
	public void user() {
		User user=userDao.getByUserName("zhang");
		System.out.println(user.getPassword());
	}
}
