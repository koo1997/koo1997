package tj4;

public class Check {
	String id;
	String pw;
	Check(String id,String pw){
		this.id=id;
		this.pw=pw;
	}
	
	void id(Check check) {
	if(id.equals("admin") && pw.equals("1111")) {
		System.out.println("로그인성공");
		
	}else {
		System.out.println("로그인실패");
	}
	}

}
