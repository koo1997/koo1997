import java.util.Scanner;
public class tj10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a ;
		System.out.println("번호를 입력하세요 :");
		a = sc.nextInt();
		
		
		
		if(a==1) {
			String name;
			int kor;
			int eng;
			int mat;
			System.out.println("이름 :" );
			name = sc.next();
			System.out.println("국어 :");
			kor = sc.nextInt();
			System.out.println("영어 :");
			eng = sc.nextInt();
			System.out.println("수학 :");
			mat = sc.nextInt();
		int tot = kor+eng+mat;
		double avg=tot/3;
		System.out.println("총점 :"+tot);
		
		System.out.println("평균 :"+avg);
		
		}else if(a==2) {

			int dan;
			System.out.println("단 입력 :");
			dan =sc.nextInt();
			System.out.println(dan + "단 출력");
			for(int i=1; i<=9;i++) {
				
			System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}else if(a==3) {
			String id;
			String pw;
			
			System.out.println("아이디 입력");
			id = sc.next();
			System.out.println("비밀번호 입력");
			pw = sc.next();
			
			if(id.equals("admin")  && pw.equals("1111") ) {
				System.out.println("로그인성공"); 
			}else {
				System.out.println("로그인실패");
			}
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
