package tj4;

public class Sungjuk2 extends Sungjuk{
	
	public Sungjuk2(int kor, int eng, int mat, String id, String pw) {
		super(kor,eng,mat,id,pw);
		
	}
	public void tot() { // 구현 메소드
		int tot = kor + eng + mat;
		System.out.println( "총점 : " + tot);
	}
}
