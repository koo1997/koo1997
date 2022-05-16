package tj00;
import java.util.Scanner;
public class tj002 {

	public static void main(String[] args) {
		Grade score=null;
		Scanner sc=new Scanner(System.in);
		int kor; int eng;
		System.out.println("국어");
		kor=sc.nextInt();
		System.out.println("영어");
		eng=sc.nextInt();
		int avg = (kor+eng)/2;
		int cnt= avg/10;
		
		switch (cnt) {
		case 10:
			score=Grade.A;
			
			break;
		case 9:
			score=Grade.A;
			
			break;
		case 8:
			score=Grade.B;
			
			break;
		case 7:
			score=Grade.C;
			
			break;
		case 6:
			score=Grade.D;
			
			break;
		

		default:
			score=Grade.F;

			break;
		}
		System.out.println("등급:"+score);
		
	}

}
