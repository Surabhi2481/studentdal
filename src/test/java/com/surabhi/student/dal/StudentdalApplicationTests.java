package com.surabhi.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.surabhi.student.dal.entities.Student;
import com.surabhi.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Surabhi");
		student.setCourse("Spring");
		student.setFee(300d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			System.out.println(student);
		}
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			student.setFee(400d);
			studentRepository.save(student);
			System.out.println(student);
		}
	}

	@Test
	public void testDeleteStudent() {
		Student student = studentRepository.findById(1l).get();
		studentRepository.delete(student);

	}

}
