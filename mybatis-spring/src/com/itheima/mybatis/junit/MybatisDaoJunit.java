package com.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.pojo.User;

public class MybatisDaoJunit {
	
	
	
	@Test
	public void testMybatis() throws Exception {
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) ac.getBean("userDao");
		
		User user = userDao.findUeserById(29);
		System.out.println(user);
	}

}
