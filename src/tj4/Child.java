package tj4;

public class Child extends Parent{
	
	int mat;
	public Child(int kor,int eng,int mat) {
		super(kor, eng);
		this.mat=mat;
	
	}
	
	void avg() {
		double avg;
		avg=(kor+eng+mat)/3;
		System.out.println("자식 평균:"+avg);
	}
	
	void tot2() {
		int tot;
		tot=kor+eng+mat;
		
		System.out.println("자식 총점:"+tot);
	}
	
	

}
