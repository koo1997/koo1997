package tj4;

public class Cal02 {
	int kor; int eng; int mat; int tot; double avg;
	String id; String pw;
	
	//생성자 생성 오버로드
	Cal02(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	Cal02(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	// 메소드 
	void gugudan() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
	void sungjuk() {
		tot = kor + eng + mat;
		avg = tot / 3.0;
		System.out.println("총점 :" + tot + " 평균 :" + avg);
	}
	void idCheck() {
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
