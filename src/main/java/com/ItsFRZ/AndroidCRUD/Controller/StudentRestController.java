package com.ItsFRZ.AndroidCRUD.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ItsFRZ.AndroidCRUD.Entity.StudentEntity;
import com.ItsFRZ.AndroidCRUD.Service.StudentService;


@RestController
@RequestMapping("/rest")
public class StudentRestController {
	
	@Autowired
	StudentService service;

	@GetMapping
	public List<StudentEntity> getAllData()
	{
		
		return service.findAllStudent();
	}
	
	
	public StudentEntity registerData(@RequestBody StudentEntity entity) 
	{
		
		return service.saveStudentData(entity);
	}
	
	public StudentEntity updateData(@RequestBody StudentEntity entity) 
	{
		
		return service.saveStudentData(entity);
	}
	
	public void deleteData(@PathVariable int id) {
		
		service.deleteStudentData(id);
	}
	
	public Optional<StudentEntity> findStudentDataById(@PathVariable int id)
	{
		
		return service.findStudentById(id);
	}
}
