package tj4;

public class Login {

	String id;
	String pw;
	
	
	Login(String id,String pw){
	this.id=id;
	this.pw=pw;
	
	
	
	}
	String idCheck() {
		if(id.equals("admin") && pw.equals("1111")) {
			return "로그인성공";
			
		}else {
			return "로그인실패";
		}
		
	}
}
