package com.tj.ex02;

public class IdCheck {
	
	String id;
	String pw;
	
	public IdCheck(String id,String pw) {
	this.id=id;
	this.pw=pw;
	
	
	}
	
	
	public void id() {
		if(id.equals("admin")&&pw.equals("1234")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
	

}
