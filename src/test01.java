import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("아이디 :");
		id = sc.next();
		
		
		if(id.equals("admin")) {
			int pw;
			System.out.println("비밀번호 :");
			pw = sc.nextInt();
			if(pw==1234){
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
		}else {
			System.out.println("잘못된 아이디 입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
