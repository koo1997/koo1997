package tj4;

public class tj1 {
	
	String name;
	int kor;
	int eng;
	int mat;
	
	tj1(){
		
	}
	
	int tot() {
		int tot = kor+eng+mat;
		return tot;
	}
	
	double avg() {
		double avg = (double)(kor+eng+mat)/3.0;
		return avg;
	}
	
	

}
