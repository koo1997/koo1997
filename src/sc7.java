import java.util.Scanner;
public class sc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	
	int min=0;
	int max=0;
	int i=0;
	int y = 0;
	int u = 0;
	System.out.println("초기치 입력:");
	min = sc.nextInt();
	System.out.println("최종치 입력");
	max = sc.nextInt();
	int min2 = min;//초기치
	while(min<=max) {
		
		if(min%2==0 ) {
			i+=min;
			
		}else {
			y+=min;
			
		}
		min++;
		
	}
	System.out.println(i);
	System.out.println(y);
	System.out.println(y+i);
	System.out.println(min2);
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
