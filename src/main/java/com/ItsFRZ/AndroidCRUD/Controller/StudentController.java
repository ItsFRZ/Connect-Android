package com.ItsFRZ.AndroidCRUD.Controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import com.ItsFRZ.AndroidCRUD.Entity.StudentEntity;
import com.ItsFRZ.AndroidCRUD.Repository.StudentRepository;
import com.ItsFRZ.AndroidCRUD.Service.StudentService;





@Controller
public class StudentController {

	@Autowired
	private StudentService service;

		
	StudentEntity doc;
	byte[] sdata;
	
	
	@RequestMapping("/home")
	public String Home() 
	{
		
		return "home";
	}
	
	@RequestMapping("/addStudData")
	public String addStudentData() 
	{
		return "register";
	}

	
	@PostMapping("/insertData")
	public String insertStudentData(@RequestParam("photoid") MultipartFile multipartFile,
									
									@RequestParam("fname") String fname,
									@RequestParam("city") String city,
									@RequestParam("state") String state,
									@RequestParam("hscm") String hscm,
									@RequestParam("sscm") String sscm) 
	{
		StudentEntity entitySave = new StudentEntity();
//		entitySave.setId(id);
		entitySave.setFname(fname);
		entitySave.setCity(city);
		entitySave.setHscm(hscm);
		entitySave.setSscm(sscm);
		entitySave.setState(state);
		entitySave.setFilename(multipartFile.getOriginalFilename());
		try {
			entitySave.setPhotoid(multipartFile.getBytes());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		service.saveStudentData(entitySave);
//		repository.save(entitySave);
		
		
		
		return "register";
	}
	
	@RequestMapping("/listStudData")
	public String listStudentData(ModelMap map) 
	{
		Iterable<StudentEntity> studList = this.service.findAllStudent();
		map.addAttribute("list", studList);
		
		
		return "list";
	}
	
	@RequestMapping("/download")
	public StreamingResponseBody download(@RequestParam("id") int id,HttpServletResponse response) 
	{
		
		Optional<StudentEntity> document = service.findStudentById(id);
		if(document.isPresent()) {
		
			doc = document.get();
			sdata = doc.getPhotoid();
			response.setHeader("Content-Dispositions", "");
		
								}
		return OutputStream -> {
			OutputStream.write(sdata);
		};
	}
	
}
