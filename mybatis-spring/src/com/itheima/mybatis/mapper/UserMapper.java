package com.itheima.mybatis.mapper;

import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	
	//根据ID查询用户
	public User findUserById(Integer id);

}
