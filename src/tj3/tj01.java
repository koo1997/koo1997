package tj3;

public class tj01 {
//필드
	String name;
	int age=10;
	double height=180.0;
	double weight;
	int kor; int eng;
	//생성자
	tj01(int aaa){
		kor=aaa;
	}
	//기본 생성자
	tj01(){
		
	}
	
//메소드	
	void print() {
		System.out.println("클래스 연습");
	}
	
	int tot() {
		int tot= kor+eng;
		return tot;
	}

	





}

