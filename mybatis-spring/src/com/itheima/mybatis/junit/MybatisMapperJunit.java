package com.itheima.mybatis.junit;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.mapper.OrdersMapper;
import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.OrdersExample;
import com.itheima.mybatis.pojo.User;

public class MybatisMapperJunit {
	
	
	
	//测试Mapepr代理开发
	@Test
	public void testMybatis() throws Exception {
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		User user = userMapper.findUserById(29);
		System.out.println(user);
	}
	//测试Mapepr代理开发 增强版
	@Test
	public void testMybatisS() throws Exception {
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserMapper userMapper = ac.getBean(UserMapper.class);
		User user = userMapper.findUserById(29);
		System.out.println(user);
		
		
	}
	//测试逆向工程
	@Test
	public void testMybatisGen() throws Exception {
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		 OrdersMapper ordersMapper = ac.getBean(OrdersMapper.class);
		
		 //查询 
//		 Orders orders = ordersMapper.selectByPrimaryKey(5);
//		 System.out.println(orders.getNumber());
		
		 OrdersExample example = new OrdersExample();
		 example.createCriteria().andUserIdEqualTo(1);
		 List<Orders> orders = ordersMapper.selectByExample(example);
		 for (Orders orders2 : orders) {
			System.out.println(orders2.getNumber());
		} 
		 //修改
		 //添加
		 
		 //删除
		 
		 
		
		 
	}

}
