package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.User;
import com.service.UserService;

@Controller
@RequestMapping("")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String checkLogin(User user ,HttpServletRequest request){

		HttpSession session = request.getSession(true);
		user=userService.login(user.getUserId(),user.getUserPwd());
		if (user!=null) {
			session.setAttribute("session", user.getUserId());
			if (user.getUserRole()==1) {
				return "stuIndex";
			}else if (user.getUserRole()==2) {
				return "teacherIndex";
			}else if (user.getUserRole()==3) {
				return "adminIndex";
			}
		}
		return "fail";
	}
	
	@RequestMapping("editPwd")
	public ModelAndView editPwd(User user){
		User user1 = userService.getuser(user.getUserId());
		ModelAndView mav = new ModelAndView("editPwd");
		mav.addObject("u", user1);
		return mav;
	}
	
	@RequestMapping("updatePwd")
	public ModelAndView updatePwd(User user){
		userService.updatePwd(user);
		ModelAndView mav = new ModelAndView("success");
		return mav;
	}
}
