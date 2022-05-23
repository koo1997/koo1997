package tj4;

public class SungEx {

	public static void main(String[] args) {
		
		Sung2 aa=new Sung2("홍길동",50,66);
		System.out.println("이름"+aa.name);
		System.out.println("국어"+aa.kor);
		System.out.println("수학"+aa.mat);
		aa.tot();
		aa.avg();
	}

}
