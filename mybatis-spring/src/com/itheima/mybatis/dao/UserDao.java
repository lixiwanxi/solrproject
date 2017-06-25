package com.itheima.mybatis.dao;

import java.io.IOException;

import com.itheima.mybatis.pojo.User;

public interface UserDao {
	
	
	//根据Id查询 用户
	public User findUeserById(Integer id) throws IOException;

}
