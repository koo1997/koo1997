package tj4;

import java.util.Scanner;

public class S2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b;
		int c;
		int d;
		int e;
		
		System.out.println("이름 :");
		b=sc.next();
		System.out.println("국어 :");
		c=sc.nextInt();
		System.out.println("영어 :");
		d=sc.nextInt();
		System.out.println("수학 :");
		e=sc.nextInt();
		S2 a=new S2("b", c, d, e);
		
		
		
		a.print();
		a.avg();
	}

}
