
import java.util.Scanner;

public class sc1 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		Double avg;
		
		System.out.println("이름 입력: ");
		name = sc.next();
		System.out.println("국어점수 :");
		kor = sc.nextInt();
		System.out.println("평균 :");
		avg= sc.nextDouble();
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("평균 : "+avg);

	}

}
