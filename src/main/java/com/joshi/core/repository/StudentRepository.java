package com.joshi.core.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.joshi.core.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	@SuppressWarnings("unchecked")
	public Student save(Student student);
	public void delete(Student student);
	public List<Student> findAll();
	public Student findById(Long id);
}
