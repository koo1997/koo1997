package tj4;

public class Sung02 {
	int kor;
	int eng;
	int mat;
	String id;
	String pw;
	String name;
	public Sung02(String name,int kor,int eng, int mat){
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
		this.name=name;
		
	}
	public Sung02(String id,String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	public int getTot() {
		return kor+eng+mat;
	}
	public double getavg() {
		return (kor+eng+mat)/3;
	}
	public String getGrade() {
		double a=getavg();
		
		if(a>=60&&kor>=60&&eng>=60&&mat>=60) {
			return "합격";
		}else {
			return "불합격";
		}
	}
	
	public void getIdCheck() {
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인성공");
			
		}else {
			System.out.println("로그인실패");
		}
	}
	
}
