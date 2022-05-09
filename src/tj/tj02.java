package tj;

public class tj02 {

	public static void main(String[] args) {

		
	int x = -100;
	int result1 = +x;
	int result2 = -x;
	
	System.out.println("result1="+result1);
	System.out.println("result2="+ result2);
		
	short s = 100;
	int result3 = -s;
	System.out.println("result3="+result3);
	
	int j = 10;
	int k = 10;
	
	int sum = 0;
	for(int i=1; i<11;i++) {
		sum = sum + i;
		j++;
	}
		
		
		for(int i=10; i>0;--i) {
			k--;
		}
		
		System.out.println(sum);
		System.out.println(j);
		System.out.println(k);

		
		
		
		//!=not boolean문법 뜻의 반대
		byte v1= 10;	
		int v2 = ~10;//10진법 반대
		System.out.println(v2);
	
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(-10));
		
		int i = 1;
		while(i<=10) {
			System.out.println("0"+i);
			i++;
		}
	
		
		
		
		
		
		
		
	
	
	}

}
