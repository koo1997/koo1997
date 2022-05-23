package tj4;

public class AA {
	String name;
	int num1;
	int num2;
	int num3;
	private int num4;
	public int getnum;
	public AA() {
		// TODO Auto-generated constructor stub
	}
	public AA(String name, int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	private AA(int num3,int num4) {
		this.num3=num3;
		this.num4=num4;
	}
	
	public void getCalc() {
		System.out.println("두수의 합:"+(num1+num2));
		System.out.println("두수의 빼기:"+(num1-num2));
		System.out.println("두수의 곱:"+(num1*num2));
		System.out.println("두수의 나누기:"+((double)num1/num2));
	}
	
	
	
	boolean getEven(){
		if(num3%2==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public int getnum(int num) {
		return this.num4=num;
	}
	

}
