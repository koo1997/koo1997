package tj4;

public class Con01Ex {

	public static void main(String[] args) {
		
		Com01 sum=new Com01();
		
		int[] val1 = new int[10];
		for(int i = 0 ;i<val1.length;i++) {
			val1[i]=i+1;
		}
		
		int res1=sum.sum1(val1);
		int res2=sum.sum2(val1);
		System.out.println("짝수:"+res1);
		System.out.println("홀수:"+res2);
	}

}
