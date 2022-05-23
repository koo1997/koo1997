package tj4;

public class Parent {
	int kor;
	int eng;
	Parent(int kor,int eng){
		
		this.kor=kor;
		this.eng=eng;
		
	}
	
	void tot1() {
		int tot1=kor+eng;
		System.out.println("부모 총점 :"+tot1);
	}
	
	void avg() {
		double avg;
		avg=(kor+eng)/2.0;
		System.out.println("부모 평균:"+avg);
	}

}
