package tj3;
import java.util.Scanner;
public class Sc01Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("국어 :");
		int kor = sc.nextInt();
		System.out.println("영어 :");
		int eng = sc.nextInt();
		System.out.println("수학 :");
		int mat = sc.nextInt();
		
		Sc01 ss1=new Sc01(kor,eng, mat);
		System.out.println("이름 :" + ss1.name);
		ss1.tot();
		double avg=ss1.avg();
		System.out.println("평균 :" + avg);
		
		
		
		
		
		
		
		
		
		
	}

}
