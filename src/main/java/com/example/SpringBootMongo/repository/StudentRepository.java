package com.example.SpringBootMongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringBootMongo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
	List<Student> findByNameAndEmail(String name, String email);
	
	List<Student> findByEmailIsLike(String email);
	
	@Query("{name:?0}")
	List<Student> getStudentsByName(String name);
}
