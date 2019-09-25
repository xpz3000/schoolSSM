package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	public User login(int userId,String userPwd){
		User user=userMapper.login(userId); 
		if (user!=null&&user.getUserPwd().equals(userPwd)) {
			return user;
		}
		return null;
	}
	
	public User getuser(int userId){
		User user=userMapper.getuser(userId);
		if (user!=null) {
			return user;
		}
		return null;
		
	}
	
	public void updatePwd(User user){
		userMapper.updatePwd(user);
	}

}
