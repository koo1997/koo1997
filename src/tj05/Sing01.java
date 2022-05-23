package tj05;

public class Sing01 {
	private static Sing01 sing=new Sing01();
	static Sing01 get1() {
		return sing;
	}
	private Sing01() {
		
	}
	static String name;
	static int kor;
	static int eng;
	static int mat;
	static {//static 블락
		name="홍길동";
		kor=88;
		eng=70;
		mat=90;
	}
	int tot() {
		
		return kor+eng+mat;
	}
	double avg() {
		return (kor+eng+mat)/3.0;
	}

}
