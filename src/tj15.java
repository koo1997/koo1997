
public class tj15 {

	public static void main(String[] args) {

		int sum=0;
		int[] score = {83,90,87};
		for(int i=0; i<3;i++) {
			sum+=score[i];
			
		}
		System.out.println("총합 :"+sum);
		double avg = (double)sum/3;
		//double avg = sum/3;
		System.out.println(avg);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}

}
