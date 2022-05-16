package tj3;

public class Calc {

	String name;
	int kor;
	int eng;
	int mat;
	
	public void tot(int kor, int eng,int mat) {
		System.out.println("총점"+( kor+eng+mat));
	}
	public double avg1(int kor, int eng,int mat) {
		
		this.eng=eng;
		this.kor=kor;
		this.mat=mat;
		double avg=(this.kor+this.eng+this.mat)/3.0;
		return avg;
	}
	
	public void avg2() {
	double avg =	this.avg1(kor, eng, mat);
	
	System.out.println("평균 :" + avg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
