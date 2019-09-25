package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TeacherMapper;
import com.pojo.Teacher;
import com.service.TeacherService;


@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherMapper teacherMapper;

	@Override
	public Teacher teaShowMy(int userId) {
	  Teacher teacher=teacherMapper.teaShowMy(userId);
	  if (teacher!=null) {
		return teacher;
	}
		return null;
	}
	

}
