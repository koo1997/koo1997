package tj4;

public class S2 extends S1{
	
	int mat;
	
	S2(String name,int kor, int eng, int mat){
		super(name, kor, eng);
		this.mat=mat;
	}
	
	
	void tot() {
		int tot;
		tot=kor+eng+mat;
	}
	void print() {
		System.out.println("성적처리2");
	}
	
	void avg() {
		double avg;
		avg=(kor+eng+mat)/3;
		System.out.println("평균 : "+avg);
	}
	
	

}
