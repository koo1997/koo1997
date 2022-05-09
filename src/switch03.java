import java.util.Scanner;
public class switch03 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
//		String a;
//		System.out.println("id를 입력 하세요 :");
//		a = sc.next();
//		
//		switch (a) {
//		case "admin":
//			System.out.println("관리자입니다.");
//			break;
//		case "Admin":
//			System.out.println("관리자입니다.");
//			break;
//
//		default:
//			System.out.println("비관리자입니다.");
//			break;
//		}
		int b;
		int c;
		System.out.println("1.배수출력 2.성적처리");
		b = sc.nextInt();
		switch (b) {
		case 1:
			int sum1=0;
			int sum2=0;
			int sum3=0;
			int q;
			int w;
			System.out.println("초기치 입력 :");
			q = sc.nextInt();
			System.out.println("최종치 입력 :");
			w = sc.nextInt();
			for(int i=q;i<=w; i++) {
				if(i%2==0) {
				sum1+=i;	
				}else {
				sum2+=i;	
				}
				
				if(i%3==0 ||i%4==0) {
					sum3+=i;		
					}
			}	
				System.out.println("짝수의 합:"+sum1);
				System.out.println("홀수의 합:"+sum2);	
				System.out.println("배수의 합:"+sum3);	
			break;
		case 2:
			int kor;
			int eng;
			System.out.println("국어 :");
			kor = sc.nextInt();
			System.out.println("영어 :");
			eng = sc.nextInt();
			int tot = kor+ eng;
			int avg = tot/2;
			if((avg>=60) && (kor>=40) && (eng>=40)) {
				System.out.println("국어 :"+kor+"영어 :"+eng+"평균 :"+eng+"합격여부 :합격");
			}else {
				System.out.println("국어 :"+kor+"영어 :"+eng+"평균 :"+eng+"합격여부 :불합격");
			}
		default:
			break;
		}
			
		
			
			
			
				
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
