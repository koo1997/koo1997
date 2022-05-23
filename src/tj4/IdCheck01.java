package tj4;

public class IdCheck01 extends Check {
	
	IdCheck01(String id, String pw) {
		super(id, pw);
	}

	void id(Check check) {
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인성공");
			
		}else {
			System.out.println("로그인실패");
		}
		}

}
