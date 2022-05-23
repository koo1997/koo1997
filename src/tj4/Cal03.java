package tj4;

public class Cal03 {
	
	static int kor;
	static int eng;
	static int mat;
	
	
	static int tot(){
		return kor+eng+mat;
	}
	
	static double avg() {
		 return (kor+eng+mat)/2;
	}
	
	static String grade() {
		double avg = (kor+eng+mat)/3;
		if(avg>=60) {
			return "합격";
		}else {
			return"불합격";
		}
	}
	static void vvv() {
		
		System.out.println("국어:"+Cal03.kor);
		System.out.println("영어:"+Cal03.eng);
		System.out.println("수학:"+Cal03.mat);
		System.out.println("총점:"+Cal03.tot());
		System.out.println("평균:"+Cal03.avg());
		System.out.println("합격여부:"+Cal03.grade());
	}

}
