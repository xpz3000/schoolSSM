package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Score;
import com.pojo.Student;
import com.service.StudentService;


@Controller
@RequestMapping("")
public class StudentController {
	@Autowired
	StudentService  studentService;
	

	@RequestMapping("stuShowGrade")
	public ModelAndView stuShowGrade(Score score){

		List<Score> list= studentService.stuShowGrade(score.getUserId());
		ModelAndView mav=new ModelAndView("stuShowGrade");
		mav.addObject("list",list);
		return mav;
	}
	
	@RequestMapping("stuShowMy")
	public ModelAndView stuShowMy(Student student){
		System.out.print("1111111111");
	    Student s=studentService.stuShowMy(student.getUserId());
	    ModelAndView mav=new ModelAndView("stuShowMy");
	    mav.addObject("my",s);
		return mav;
	}
	
	@RequestMapping("stuUpdateMy")
	public ModelAndView updateMy(Student student){
		studentService.stuUpdateMy(student);
		ModelAndView mav=new ModelAndView("stuIndex");
		return mav;
	}
	
	
}
