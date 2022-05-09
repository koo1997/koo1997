import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a;
		
		System.out.println("점수 :");
		
		a = sc.next();
		
//		if(a>=90) {
//			if (a>=95) {
//				System.out.println("A+");
//			}else {
//				System.out.println("A");
//			}
//			
//		}if(a>=80) {
//			if(a>=85) {
//				System.out.println("B+");		
//			}
//			else {System.out.println("B0");
//
//			}
//			}else{
//				
//		
//				
//				
//				System.out.println("학점미달");
//			
//			}
		switch (a) {
			case "가가가":
				System.out.println("1");
				break;
			case "나나나":
				System.out.println("2");
				break;
			case "다다다":
				System.out.println("3");
				break;

		default:
			System.out.println("NAN");
			break;
		}
		
		
	}

}
		