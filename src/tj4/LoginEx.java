package tj4;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		String id;String pw;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("id:");
			id= sc.next();
			System.out.println("pw:");
			pw=sc.next();
			Login log=new Login(id,pw);
			String res = log.idCheck();
			if(res=="로그인성공") {
				System.out.println("id:"+log.id+"pw:"+log.pw+"로그인성공");
				break;
			}else {
				System.out.println("id:"+log.id+"pw:"+log.pw+"로그인실패");
				
			}
		}

		
		
		
	}

}
