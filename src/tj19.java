import java.util.Scanner;

public class tj19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu= new int[5];
		
		for(int i=0;i<jumsu.length;i++) {
			System.out.println("jumsu["+(i+1)+"]");
			jumsu[i] = sc.nextInt();
		}

		int tot = tot(jumsu);
		System.out.println("총점 :" + tot);}
		
		public static int tot(int[] jumsu) 
		{
			int tot=0;
			for(int i = 0; i <5;i++) {
			tot+=jumsu[i];
			}
			return tot;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
