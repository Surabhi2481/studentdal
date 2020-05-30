package com.surabhi.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.surabhi.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
