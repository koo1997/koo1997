package tj4;

public class Calc00 {
	static String name;
	
	static int kor;
	static int eng;
	
	static int mat;
	
	
	static int tot() {
		return kor+eng+mat;
	}
	static double avg() {
		return (kor+eng+mat)/3;
	}
	static String grade() {
		double avg =(kor+eng+mat)/3;
		if(avg>=60 && kor>=40 && eng>=40 &&mat>=40) {
			return "합격";
		}else {
			return "불합격";
		}
		}
	
}
