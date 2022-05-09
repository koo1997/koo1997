//import java.util.Scanner;

public class sc6 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String id;
//		String pw;
//		
//		System.out.println("아이디 입력");
//		id = sc.next();
//		System.out.println("비밀번호 입력");
//		pw = sc.next();
//		
//		if(id.equals("admin")  && pw.equals("1111") ) {
//			System.out.println("로그인성공"); 
//		}else {
//			System.out.println("로그인실패");
//		}
		
		
		int value = 356;
		System.out.println(value-56);
		
		int top = 5;
		int bottom = 10;
		int height = 7;
		double area = (top+bottom)*height / 2.0;
		System.out.println(area);
		
		int x =10;
		int y = 5;
		System.out.println((x>7 && (y<=5)));
		System.out.println((x%3 == 2) ||(y%2 != 1));
		
		double u = 5.0;
		double i = 0.0;
		
		double z = 5 % i;
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
		
		
		
		int kor = (int) (Math.random()*100)+1;
		int eng = (int) (Math.random()*100)+1;
		int mat = (int) (Math.random()*100)+1;
		int avg = (kor+eng+mat)/3;
		System.out.println("평균 :"+ avg);
		if(avg>=90) {
			
			System.out.println("학점 :"+"A학점");
		}else
		if(avg>=80) {
			System.out.println("학점 :"+"B학점");
		}else
		if(avg>=70) {
			System.out.println("학점 :"+"C학점");
		}else
		if(avg>=60) {
			System.out.println("학점 :"+"D학점");
		}else
		if(avg<60) {
			System.out.println("학점 :"+"F학점");
		}
		
		
//		int n = (int) (Math.random()*45)+1;
//		System.out.println(n);
				
		
		
		
		
		
		
		
		
		
		
	}

}
