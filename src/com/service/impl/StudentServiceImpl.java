package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.StudentMapper;
import com.pojo.Score;
import com.pojo.Student;
import com.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper studentMapper;
	
	public Student stuShowMy(int userId){
		Student student = studentMapper.stuShowMy(userId);
		if (student!=null) {
			return student;
		}
		else{
			return null;
		}
	}

	@Override
	public void stuUpdateMy(Student student) {
	 studentMapper.stuUpdateMy(student);
	}
	
	public List<Score> stuShowGrade(int userId) {
		List<Score> L= new ArrayList<Score>();
		L=studentMapper.stuShowGrade(userId);
		System.out.print(L.size()); 
		return L;
	}

}
