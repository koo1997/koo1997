package tj3;

public class Calc2 {
	
	int add=10; int divide=20;
	int su;
	public void plint() {
		System.out.println(this.add);
		System.out.println(this.divide);
		
	}
	public int add1(int x,int y) {
		this.add = x;
		this.divide = y;
		add=x+y;
		
		
		return  x+ y; 
	}
	
	public int odd(int su1) {

		
		if(su1%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	return su1;
	}
	
	
	
	
	
}
