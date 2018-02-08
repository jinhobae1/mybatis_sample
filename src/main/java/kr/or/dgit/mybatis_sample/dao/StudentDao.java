package kr.or.dgit.mybatis_sample.dao;

import java.util.List;

import kr.or.dgit.mybatis_sample.dto.Student;


public interface StudentDao {
	Student findStudentById(int studId);
	int insertStudent(Student student);
    int deleteStudent(int studId);
    List<Student> findAllStudents();
	int updateStudent(Student student);
}
