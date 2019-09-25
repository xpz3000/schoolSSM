package com.service;

import java.util.List;

import com.pojo.Score;
import com.pojo.Student;

public interface StudentService {

	Student stuShowMy(int userId);

	void stuUpdateMy(Student student); 
	
	List<Score> stuShowGrade(int userId);  

}
