package tj4;

import java.util.Scanner;

public class ChildEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Child chi=new Child(80,55,90);
		Parent par=chi;
		par.tot1();
		par.avg();
		chi.tot2();
		int a;
		int b;
		int c;
		System.out.println("국어:");
		a=sc.nextInt();
		System.out.println("영어:");
		b=sc.nextInt();
		System.out.println("수학:");
		c=sc.nextInt();
		Child ccc=new Child(a, b, c);
		ccc.tot1();
		ccc.avg();
		ccc.tot2();
		
		
	}

}
