import java.util.Scanner;
public class tj12함수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		a: for(int i = 0; i<=10;i++) {
//			for(int j= 10; j>=0;j--) {
//				System.out.println(i+"-"+j);
//				if(i==6) {
//					break a;
//				}
//			}
//		}
//		System.out.println("종료");
		
	
		while(true) {
			 System.out.println("메뉴 선택 1. 구구단 2. id check 3. 배수 출력 0. 종료");
			 int cnt =sc.nextInt();
			 if(cnt == 1) {
//				 for(int m=2; m<=9; m++) {
//						System.out.println(m+"단");
//						for(int n=1; n<=9;n++) {
//							System.out.println(m+"x"+n+"="+(m*n));
//						}
//					}
				 gugudan();
				 
					
			 }else if(cnt == 2) {
				
//				 String id;
//					String pw;
//					
//					System.out.println("아이디 입력");
//					id = sc.next();
//					System.out.println("비밀번호 입력");
//					pw = sc.next();
//					
//					if(id.equals("admin")  && pw.equals("1111") ) {
//						System.out.println("로그인성공"); 
//					}else {
//						System.out.println("로그인실패");
//					}
				 idcheck();
				 String id = idcheck();
				 System.out.println(id);
			 }else if(cnt == 3) {
				 
//				 int l=0;
//				 for(int i=0;i<=100;i++) {
//					 if(i%2==0) {
//						l+=i; 
//					 }
//				 }
//				 
//				 System.out.println( "1~100까지의" );
//				 System.out.println( "짝수의 합 :"+l);
			 }else if(cnt == 0) {
				 System.out.println("메뉴 종료");
				 break;
			 }
			 
		 }
		
		
	}
		public static void gugudan() {
			for(int i =1;i<=9;i++) {
				System.out.println(i);
			}
			
		}
	
	public static String idcheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("id입력");
		String id = sc.next();
		return id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
