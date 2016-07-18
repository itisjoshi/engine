package com.joshi.core.service;
import java.util.List;

import com.joshi.core.model.Student;

public interface StudentService {

	public Student save(Student student);
	public void delete(Student student);
	public  List<Student> findAll();
	public Student findById(Long id);
	public List<Student> save(List<Student> students);
}
