
public class tj07 {

	public static void main(String[] args) {
		
//		int a = 5;
//		int b = 2;
//		
//		
//		double a1 = (double)a/b;
//		double a2 = a/b;
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		if(a1 % 2 ==0) {
//			System.out.println("짝수");
//		
//		}else {
//			System.out.println("홀수");
//		}
		int a=0;
		int b = 0 ;
		int i=1;
		while(i<=100) {
			
			if( i % 2 == 0) {
				a+=i;
			}else{
				b = b + i;
				
			}
			i++;
			
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println((a+b));
		
//		int sum1=0;
//		int sum2=0;
//		for(int i=1;i<=100; i++) {
//			if( i % 2 == 0) {
//			sum1+=i;
//		}else{
//			sum2 = sum2 + i;
//			
//		}
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);
//		
	
	
			
		}
	
	
	
	
	
	public static int sageAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우");
			}
		}else {
			if(left>(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우");
			}
		}
		return left+right;
	
	
	
	}
		
	}


