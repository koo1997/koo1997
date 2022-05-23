package tj05;

public class Sing {
	private static Sing sing =new Sing();
//	private Sing() {
		
//	}
	int mat;int eng=80;
	
	static Sing get() {
		return sing;
	}
	
}
//private 설명 같은클래스만 접근가능