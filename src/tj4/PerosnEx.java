package tj4;

import java.util.Scanner;

public class PerosnEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Perosn per=new Perosn();
		
		System.out.println("월급 :");
		per.salary=sc.nextInt();
		per.tax();
		
		
		
	}

}
