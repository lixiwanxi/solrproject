package com.itheima.mybatis.dao;

import java.io.IOException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.mybatis.pojo.User;

/**
 * 原始Dao开发   Mybatis 公司  提供 一个类 SqlSessionDaoSupport
 * @author lx
 *
 */

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


	//根据Id查询 用户
	@Override
	public User findUeserById(Integer id) throws IOException {
		// TODO Auto-generated method stub
		User user = getSqlSession().selectOne("test.findUserById", id);
		return user;
	}


	
	
	
	
	

}
