package com.mapper;



import com.pojo.User;

public interface UserMapper {
	
	public  User login(int userId);
	
	public  User getuser(int userId);

	public void updatePwd(User user);

}
