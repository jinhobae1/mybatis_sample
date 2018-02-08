package kr.or.dgit.mybatis_sample.dto;

public class PhoneNumber {
	private String contryCode;
	private String stateCode;
	private String number;
	public PhoneNumber() {}
	
	public PhoneNumber(String contryCode, String stateCode, String number) {
		this.contryCode = contryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	public PhoneNumber(String str) {
		if(str != null) {
			String[] parts = str.split("-");
			
			if( parts.length>0)this.contryCode = parts[0];
			if( parts.length>1)this.stateCode = parts[1];
			if( parts.length>2)this.number = parts[2];
		}
	}
	
	
	@Override
	public String toString() {
		return String.format("%s-%s-%s", contryCode, stateCode, number);
	}
	
	
	
}
