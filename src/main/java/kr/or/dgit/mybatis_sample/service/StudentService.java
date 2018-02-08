package kr.or.dgit.mybatis_sample.service;

import org.apache.ibatis.session.SqlSession;



import kr.or.dgit.mybatis_sample.dao.StudentDao;
import kr.or.dgit.mybatis_sample.dto.Student;
import kr.or.dgit.mybatis_sample.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final StudentService instance  = new StudentService();
	
	public static StudentService getInstance() {
		return instance;
	}
	private StudentService() {};
	
	public int createStudent(Student student) {
		SqlSession sqlsession = MybatisSqlSessionFactory.openSession();
		try{
			StudentDao studentDao = sqlsession.getMapper(StudentDao.class);
			int res = studentDao.insertStudent(student);
			return res;
		}finally {
			sqlsession.commit();
			sqlsession.close();
		}
		
	}
	
	public Student searchStudentById(int studId) {
		SqlSession sqlsession = MybatisSqlSessionFactory.openSession();
		try{
			StudentDao studentDao = sqlsession.getMapper(StudentDao.class);
			return studentDao.findStudentById(studId);
		}finally {
			
			sqlsession.close();
		}
		
	}
	
	public int removeStudent(int studId) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
			int res = studentDao.deleteStudent(studId);
			return res;
		}finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	public int updateStudent(Student student) {
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
			int res = studentDao.updateStudent(student);
			return res;
		}finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
}
