package com.mapper;

import java.util.List;

import com.pojo.Score;
import com.pojo.Student;

public interface StudentMapper {

	Student stuShowMy(int userId);

	void stuUpdateMy(Student student); 
	
	List<Score> stuShowGrade(int userId);

}
