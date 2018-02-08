package kr.or.dgit.mybatis_sample;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_sample.dto.Student;
import kr.or.dgit.mybatis_sample.service.StudentService;




@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}



	@Test
	public void test1CreateStudentTest() {
		Student student = new Student(1, "배진호", "baejinho@test.co.kr", new Date());
		int res = studentService.createStudent(student);
		Assert.assertEquals(1,res);
		
	}
	
	@Test
	public void test2SearchStudentById() {
		Student student = studentService.searchStudentById(2);
		System.out.println(student);
		Assert.assertNotNull(student);
	
	}

}
