package tj4;

public class Com02 {
	int sum;
	
	
	int tot(int[] su) {
		int sum =0;
		for(int i =0;i<su.length;i++) {
			sum+=su[i];
		}
		return sum;
	}
	double avg(int[] su) {
		double sum1=0;
		for(int i =0;i<su.length;i++) {
			sum1+=su[i];
		}
		double sum=sum1/su.length;
		return sum;
	}
//	double avg() {
//		double avg = (double)sum/5;
//		return avg;
//	}
}
