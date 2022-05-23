package tj4;

public class Sung2 extends Sung {
	
	double avg;
	
	Sung2(String name,int kor,int mat){
		this.kor=kor;
		this.mat=mat;
		this.name=name;
		
	}
	void avg() {
		this.kor=kor;
		this.mat=mat;
		
		avg=(kor+mat)/2;
		System.out.println("평균 :"+avg);
	}
	

}
