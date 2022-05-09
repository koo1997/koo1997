import java.util.Scanner;
public class sc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		Double avg;
		
		System.out.println("이름 :" );
		name = sc.next();
		System.out.println("국어 :");
		kor = sc.nextInt();
		System.out.println("영어 :");
		eng = sc.nextInt();
		System.out.println("수학 :");
		mat = sc.nextInt();
	    
		tot = (kor+eng+mat);
		avg = tot/3.0;
		System.out.println("총점 :"+(kor+eng+mat));
		
		System.out.println("평균 :"+(kor+eng+mat)/3);
	    
		String a;
		if(avg>=60 || kor>=40 || eng>=40 || mat>=40 ) {
			a = "합격";
		}else {
			a= "불합격";
			
		}	
		System.out.println("합격여부:" +a);
	}

}
