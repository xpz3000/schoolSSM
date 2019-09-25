package com.service;

import com.pojo.User;

public interface UserService {
	
	User login(int userId,String userPwd);
	
	User getuser(int userId);
	
	void updatePwd(User user);

}
