import java.util.Scanner;
public class sc4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.println("단 입력 :");
		dan =sc.nextInt();
		System.out.println(dan + "단 출력");
		for(int i=1; i<=9;i++) {
			
			System.out.println(dan + "*" + i + "=" + dan * i);
		}


	}

}
