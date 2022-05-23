package tj4;

import java.util.Scanner;

public class Com02Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Com02 sum = new Com02();
		
		int[] abc = new int[5];
		for(int i=0; i<abc.length;i++) {
			System.out.println("abc["+(i+1)+"]:");
			abc[i]=sc.nextInt();
		}
		
		int tot = sum.tot(abc);
		double avg = sum.avg(abc);
		System.out.print("배열값:");
		for(int i=0; i<abc.length;i++) {
			System.out.print(abc[i]+",");
		}
		
		System.out.println();
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		
	}

}
