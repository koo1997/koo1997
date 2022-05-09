import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name;
		int kor;
		int eng;
		int mat;
//		System.out.println("이름 :" );
//		name = sc.next();
		System.out.println("국어 :");
		kor = sc.nextInt();
		System.out.println("영어 :");
		eng = sc.nextInt();
		System.out.println("수학 :");
		mat = sc.nextInt();
		int tot = kor+eng+mat;
		double avg=tot/3;
		System.out.println("총점 :"+tot);
		
		System.out.println("평균 :"+avg);
	
		
		switch ((int)avg/10) {
		case 10 :
			
		case 9 :
			System.out.println("A");
			
			break;
		case 8 :
			System.out.println("B");
			
			break;
		case 7 :
			System.out.println("C");
			
			break;
		case 6 :
			System.out.println("D");
			
			break;

		default:
			System.out.println("F");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
