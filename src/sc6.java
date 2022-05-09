import java.util.Scanner;

public class sc6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
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
