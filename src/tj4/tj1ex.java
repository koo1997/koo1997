package tj4;

public class tj1ex {

	public static void main(String[] args) {

		tj1 ss1 = new tj1();
		ss1.name = "홍길동";
		ss1.kor= 50;
		ss1.eng= 60;
		ss1.mat= 70;
		System.out.println("이름 :"+ss1.name);
		System.out.println("국어 :"+ss1.kor);
		System.out.println("영어 :"+ss1.eng);
		System.out.println("수학 :"+ss1.mat);
		
		
		tj1 ss2 = new tj1();
		ss2.name = "홍길순";
		ss2.kor= 60;
		ss2.eng= 70;
		ss2.mat= 80;
		
		System.out.println("이름 :"+ss2.name);
		System.out.println("국어 :"+ss2.kor);
		System.out.println("영어 :"+ss2.eng);
		System.out.println("수학 :"+ss2.mat);
		System.out.println("총점 :" + ss2.tot());
		System.out.println("평균 :"+ss2.avg());
	}

}
