package com.example.SpringBootMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMongo.entity.Student;
import com.example.SpringBootMongo.service.StudentService;

@RestController
@RequestMapping("/v1/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable String id) {
		return studentService.findStudentById(id);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable String id) {
		return studentService.deleteStudentById(id);
	}
	
	@GetMapping("/getByNameAndEmail")
	public List<Student> getStudentByNameAndEmail(@RequestParam String name, @RequestParam String email) {
		return studentService.getStudentByNameAndEmail(name, email);
	}
	
	@GetMapping("/getAllByPagination")
	public List<Student> getAllByPagination(@RequestParam int pageNo, @RequestParam int pageSize) {
		return studentService.getAllByPagination(pageNo, pageSize);
	}
	
	@GetMapping("/sortByAge")
	public List<Student> sortByAge() {
		return studentService.sortByAge();
	}
	
	@GetMapping("/likeWildcard/{email}")
	public List<Student> likeWildcard(@PathVariable String email) {
		return studentService.likeWildcard(email);
	}
	
	@GetMapping("/getByName/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}
}
