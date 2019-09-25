package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Teacher;
import com.service.TeacherService;


@Controller
@RequestMapping("")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("teaShowMy")
	public ModelAndView teaShowMy(Teacher teacher){
		Teacher t=teacherService.teaShowMy(teacher.getUserId());
		ModelAndView mav = new ModelAndView("teaShowMy");
		mav.addObject("my",t);
		return mav;
	}

}
