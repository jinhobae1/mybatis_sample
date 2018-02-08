package kr.or.dgit.mybatis_sample.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	
	@Override
	public String toString() {
		return String.format("Student [%s-%s-%s-%s-%s]", studId, name, email, phone,dob);
	}


	

}
