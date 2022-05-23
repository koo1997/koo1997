package tj4;

public class Mem {
	String id;
	String pw;
	Mem(String id,String pw){
		this.id=id;
		this.pw=pw;
	}
	void idcheck() {
		if(id.equals("admin")&&pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
