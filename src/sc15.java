import java.util.Scanner;
public class sc15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5];
//		int num;
//		System.out.println(jumsu[0]);
//		 num = sc.nextInt();
//		jumsu[0]=80;
//		jumsu[1]=90;
//		int sum = jumsu[0] + jumsu[1];
//		double sum2;
		int sum1=0;
		int max = 0;
		int min = 1000;
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("jumsu [" +(i+1)+ "]");
			jumsu[i]=sc.nextInt();
			sum1+=jumsu[i];
//			int a=jumsu[i];
			if(jumsu[i]>=max) {
				max=jumsu[i];
			}if(jumsu[i]<=min) {
				min=jumsu[i];
			}
			
		}
		double avg = (double)sum1/5.0;
		System.out.println("총점 :"+sum1);
		System.out.println("평균 :"+avg);
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
	}

}