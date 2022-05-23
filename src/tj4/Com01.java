package tj4;

public class Com01 {
	static int plus(int x,int y) {
		return x+y;
	}
	
	int sum1(int[] su) {
		
		int sum=0;
		for(int i=0;i<su.length;i++) {
			if(su[i]%2==0) {
				sum+=su[i];
			}
			}
		return sum;
	}

	
int sum2(int[] su) {
		
		int sum=0;
		for(int i=0;i<su.length;i++) {
			if(su[i]%2!=0) {
				sum+=su[i];
			}
			}
		return sum;
	}


}