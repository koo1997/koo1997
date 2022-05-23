package tj4;

import java.util.Scanner;

public class Cal04 {
	 int kor;
	 int eng;
	 int mat;
	void in() {
		Scanner sc = new Scanner(System.in);
		System.out.println("kor:");
		kor=sc.nextInt();
		System.out.println("eng:");
		eng=sc.nextInt();
		System.out.println("mat:");
		mat=sc.nextInt();
	}
	 int tot(){
	int a=	kor+eng+mat;
		return a;
	}
	
	 double avg() {
		int sum = tot();
		double a = sum/3;
		return a;
	}
	
	void grade() {
		in();
		double avg=avg();
		String grade;
		int tot=tot();
		if(avg>=60) {
			grade= "합격";
		}else {
			grade="불합격";
		}
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot());
		System.out.println("평균:"+avg());
		System.out.println("합격여부:"+grade);
		
	
		
	}
}
