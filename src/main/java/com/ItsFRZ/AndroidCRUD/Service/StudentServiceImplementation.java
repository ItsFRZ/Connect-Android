package com.ItsFRZ.AndroidCRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ItsFRZ.AndroidCRUD.Entity.StudentEntity;
import com.ItsFRZ.AndroidCRUD.Repository.StudentRepository;


@Service
public class StudentServiceImplementation implements StudentService {

	
	@Autowired
	StudentRepository repository;

	@Override
	public StudentEntity saveStudentData(StudentEntity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public StudentEntity updateStudentData(StudentEntity entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public void deleteStudentData(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<StudentEntity> findStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<StudentEntity> findAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	


}
