package tj4;

public class Com {
	
	
	
	int sum1(int[] val) {
		int sum = 0;
		for(int i=0;i<val.length;i++) {
			sum+=val[i];
		}
		return sum;
	}
	
	int sum2(int ... val) {
		int sum = 0;
		for(int i=0;i<val.length;i++) {
			sum+=val[i];
		}
		return sum;
	}
	
	

}
