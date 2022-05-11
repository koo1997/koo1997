import java.util.Scanner;
public class tj13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.println("메뉴 선택 1. 구구단 2. 성적처리 0. 종료");
			 int num =sc.nextInt();
		if(num==1) {
			gugu();
		}else if(num==2) {
			String grade=grade();
			System.out.println(grade);
			
		}else if(num==0) {
			System.out.println("종료");
			break;
		}
		
		}
		
		
		
		
		
		
	}
	public static void gugu() {
		for(int i = 2; i<10;i++) {
			System.out.println(i+"단");
			for(int j=1; j<10;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	}
	public static String grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 :");
		int kor = sc.nextInt();
		System.out.println("영어 :");
		int eng = sc.nextInt();
		System.out.println("수학 :");
		int mat = sc.nextInt();
		int tot=kor+eng+mat;
		double avg= tot/3;
		String grade;
		System.out.println("평균 :"+avg);
		System.out.println("총점 :"+tot);
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40 ) {
			grade = "합격";
			
		}else {
			grade = "불합격";
		}
		return grade;
	}

}
