
public class tj11 {

	public static void main(String[] args) {

		String v = "";
		for(int i = 1;i<=5;i++ ) {
			 
			v+="*";
			System.out.println(v);
		}
	
		
		int b=0;
		int c=100;
		for(int a = 1 ; a<=100;a++) {
			if(a>=b) {
				b=a;
				
			}if(a<=c) {
				c=a;
				
		}

		} 		
		
		System.out.println("최대값"+b);
		System.out.println("최소값"+c);
		
		for(float x=0.1f;x<=1.0f;x+=0.1f) {
			System.out.println(x);
		}
		
		for(int m=2; m<=9; m++) {
			System.out.println(m+"단");
			for(int n=1; n<=9;n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
		
		
		
		
	}

}
