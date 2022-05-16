package tj3;

public class Sc01 {

	String name ="홍길동";
	int kor; int eng;int mat;
	
	Sc01(int kor,int eng,int mat){
		this.eng=eng;
		this.kor=kor;
		this.mat=mat;
	}
	
	
	public void tot() {
		
		System.out.println("총점:"+(kor+eng+mat));
		
	}
	public double avg() {
		
		
		return (this.kor+this.eng+this.mat)/3.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
