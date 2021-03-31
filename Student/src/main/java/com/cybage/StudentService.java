package com.cybage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepositary studentRepositary;
	
	
	public String saveStudent(Student student) {
		studentRepositary.save(student);
		return "Student information added successfully";
	}
	
	
	
	

}
