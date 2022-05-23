package tj4;

public class Mem2 extends Mem {
	
	String name;
	String ssn;
	Mem2(String name,String ssn,String id,String pw){
		super(id, pw);
		this.name=name;
		this.ssn=ssn;
	}
	void idcheck() {
		if(id.equals("admin")&&pw.equals("1234")) {
			System.out.println("로그인 성공여부");
		}else {
			System.out.println("로그인 실패여부");
		}
	

	
	}
	
	
	
}
