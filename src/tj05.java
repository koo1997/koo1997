
public class tj05 {

	public static void main(String[] args) {
		
		
		int kor = 80;
		int eng = 100;
		int mat = 90;
		int tot = (kor+eng+mat);
		String b = grade2(kor,eng,mat);
		
		System.out.println(b);
	}
	
	
		public static String grade2(int kor,int eng,int mat) {
			int a = (kor+eng+mat)/3;
			
			
			
					//System.out.println(b);
					String b;
					if(a>=60) {
						b="합격";
					}else {
						b="불합격";
					}
					System.out.println(a);
					
					return b;
		}

}
