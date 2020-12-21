package com.ItsFRZ.AndroidCRUD.Service;

import java.util.List;
import java.util.Optional;

import com.ItsFRZ.AndroidCRUD.Entity.StudentEntity;


public interface StudentService {

	StudentEntity saveStudentData(StudentEntity entity);
	StudentEntity updateStudentData(StudentEntity entity);
	void deleteStudentData(int id);
	Optional<StudentEntity> findStudentById(int id);
	List<StudentEntity> findAllStudent();
 	
	
}
