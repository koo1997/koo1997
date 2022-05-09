
public class tj04 {

	public static void main(String[] args) {
		//합수호출
		grade1(80,100,90);
		
		
	}
	
	public static void grade1(int kor,int eng,int mat) {
		int tot = (kor+eng+mat);
		int grade1 = tot/3;
		System.out.println("총점 :"+tot);
		System.out.println("평균 :"+grade1);
		String a;
		if(grade1>=60) {
			a="합격";
		}else {
			a="불합격";
		}
		System.out.println(a);
		
		
		
	
	}

}
