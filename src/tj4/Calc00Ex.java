package tj4;

import java.util.Scanner;

public class Calc00Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름:");
		Calc00.name=sc.next();
		System.out.println("kor:");
		Calc00.kor=sc.nextInt();
		System.out.println("eng:");
		Calc00.eng=sc.nextInt();
		System.out.println("kor:");
		Calc00.mat=sc.nextInt();
		
		System.out.print("이름:"+Calc00.name);
		System.out.print("\t kor:"+Calc00.kor);
		System.out.print("\t eng:"+Calc00.eng);
		System.out.print("\t mat:"+Calc00.mat);
		System.out.print("\t tot:"+Calc00.tot());
		System.out.print("\t avg:"+Calc00.avg());
		System.out.print("\t grade"+Calc00.grade());
		
	}

}
