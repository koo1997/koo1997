package com.tj.ex03;
import com.tj.ex01.*;
import com.tj.ex02.*;
public class Result {

	public static void main(String[] args) {

		
		Sungjuk sung = new Sungjuk(80,80);
		IdCheck id = new IdCheck("admin","1234");
		int tot=sung.tot();
		System.out.println(tot);
		id.id();
		
	}

}
