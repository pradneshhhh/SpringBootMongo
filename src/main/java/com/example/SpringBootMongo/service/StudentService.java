package com.example.SpringBootMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.SpringBootMongo.entity.Student;
import com.example.SpringBootMongo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findStudentById(String id) {
		return studentRepository.findById(id).get();
	}

	public Student update(Student student) {
		return studentRepository.save(student);
	}

	public String deleteStudentById(String id) {
		studentRepository.deleteById(id);
		return "The student has been deleted";
	}

	public List<Student> getStudentByNameAndEmail(String name, String email) {
		return studentRepository.findByNameAndEmail(name, email);
	}

	public List<Student> getAllByPagination(int pageNo, int pageSize) {
		Pageable page = PageRequest.of(pageNo-1, pageSize);
		return studentRepository.findAll(page).getContent();
	}

	public List<Student> sortByAge() {
		Sort sort = Sort.by(Sort.Direction.ASC, "age");
		return studentRepository.findAll(sort);
	}

	public List<Student> likeWildcard(String email) {
		return studentRepository.findByEmailIsLike(email);
	}

	public List<Student> getStudentByName(String name) {
		return studentRepository.getStudentsByName(name);
	}
	
	
}
